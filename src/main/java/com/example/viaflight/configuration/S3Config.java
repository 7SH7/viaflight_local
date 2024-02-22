package com.example.viaflight.configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class S3Config {

	@Value("${cloud.aws.credentials.access-key}")
	private String accessKey;

	@Value("${cloud.aws.credentials.secret-key}")
	private String secretKey;

	@Value("${cloud.aws.region.static}")
	private String region;


//	BasicAWSCredentials 객체를 생성합니다. 이 객체는 AWS 서비스를 이용하기 위한 인증 정보를 담고 있음.
	@Bean
	public AmazonS3Client amazonS3Client() {
		BasicAWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);

		// 인증, 인가하는 부분 -> key 제공
		return (AmazonS3Client) AmazonS3ClientBuilder
			.standard()
			.withRegion(region)
			.withCredentials(new AWSStaticCredentialsProvider(credentials))
			.build();
	}

}
