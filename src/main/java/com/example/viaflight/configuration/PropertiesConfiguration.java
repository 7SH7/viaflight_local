package com.example.viaflight.configuration;

import com.example.viaflight.configuration.properties.KakaoProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// 이 파일의 목적 : kakao.properties 파일에 있는 api값 배치 ::> 보안성 때문에 만든 것!

@Configuration
@EnableConfigurationProperties({
	KakaoProperties.class
	// 여기에 있는 곳에다가 밑의 classpath에 있는 properties 파일을 적용시키겠다는 것.
})
@PropertySource({
	"classpath:properties/kakao.properties"
})
public class PropertiesConfiguration {

}
