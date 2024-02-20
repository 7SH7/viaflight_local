package com.example.viaflight.controller;

import com.example.viaflight.configuration.properties.KakaoProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/kakao/")
@RequiredArgsConstructor
public class KakaoController {

	private final KakaoProperties kakaoproperties;

	// todo : 밑의 코드 작성 방법 명세서랑 다시 확인할 것.
	// todo : 밑의 코드 건물 이름 입력하는 외부API로 바꾸기 -> 카카오맵으로 해외 확인 되는지 확인할 것. (안 되면 구글맵으로 변경)

	@GetMapping("search")
	public String search(@RequestParam String query) {
		Mono<String> mono = WebClient.builder().baseUrl("https://dapi.kakao.com")   // Host Url
			.build().get()
			.uri(builder -> builder.path("/v2/local/search/address.json")   // 홈페이지에 있는 주소
				.queryParam("query", query)     // 필수 사용값
				.build()
			)
				.header("Authorization", "KakaoAK " + kakaoproperties.getRestApi())     // authorization 느낌.
				.retrieve().bodyToMono(String.class);       // mono라는 것의 string 값으로 바꿔주는 것
		return mono.block();
	}

	@GetMapping("test")
	@ResponseBody
	public KakaoProperties test() {
//		System.out.println(kakaoproperties.getRestApi());
		return kakaoproperties;
	}


}
