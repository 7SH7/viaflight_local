package com.example.viaflight.service.s3;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service        // @Service와 @Component의 차이는 없음.
@RequiredArgsConstructor
public class S3UploadService {

	private final AmazonS3 amazonS3;

	@Value("${cloud.aws.s3.bucket}")
	private String bucket;

	public String uploadFiles(MultipartFile multipartFile, String dirName) throws IOException {
		File uploadFile = convert(multipartFile).orElseThrow(() -> new IllegalArgumentException("MultipartFile -> File로 전환이 실패했습니다."));
		return upload(uploadFile, dirName);
	}


	public String upload(File uploadFile, String filePath) {
		String fileName = filePath + "/" + UUID.randomUUID() + uploadFile.getName();    // UUID.randomUUID()는 랜덤한 문자열을 생성 (이름 중복 방지!)
		String uploadImageUrl = putS3(uploadFile, fileName);    // s3로 upload
		removeNewFile(uploadFile);  // 로컬에 저장된 temp 파일 삭제
		return uploadImageUrl;
	}

	public String putS3(File uploadFile, String fileName) {
		// putObject()는 Amazon S3 클라이언트에서 제공하는 메서드로, 파일을 S3에 업로드하는 기능을 수행
		//  PutObjectRequest 객체는 S3에 파일을 업로드할 때 필요한 정보를 담고 있습니다
		//  withCannedAcl() 메서드는 업로드된 파일에 대한 접근 권한을 설정하는 메서드입니다. (PublicRead는 모든 사용자가 파일에 접근할 수 있도록 설정)
		amazonS3.putObject(new PutObjectRequest(bucket, fileName, uploadFile).withCannedAcl(CannedAccessControlList.PublicRead));
		return amazonS3.getUrl(bucket, fileName).toString();    // amazonS3에서 해당 파일의 URL을 반환
	}

	public void removeNewFile(File targetFile) {
		if (targetFile.delete()) {
			System.out.println("파일이 삭제되었습니다.");
		} else {
			System.out.println("파일이 삭제되지 못했습니다.");
		}
	}

	private Optional<File> convert(MultipartFile file) throws IOException {
		File convertFile = new File(System.getProperty("user.dir") + "/" + file.getOriginalFilename()); // 생성자 파라미터는 정해져 있는 것
		if (convertFile.createNewFile()) { // 바로 위에서 지정한 경로에 File이 생성됨 (경로가 잘못되었다면 생성 불가능)
			try (FileOutputStream fos = new FileOutputStream(convertFile)) { // FileOutputStream 데이터를 파일에 바이트 스트림으로 저장하기 위함
				fos.write(file.getBytes());
			}
			return Optional.of(convertFile);    // 파일 성공 시, 생성된 file 객체를 optional로 감싸서.. (Optional로 감싸는 거구나.. -> NULL 방지구나~)
		}
		return Optional.empty();    // 파일 생성 여부 check
	}


}
