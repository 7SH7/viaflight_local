package com.example.viaflight.configuration.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties
public class KakaoProperties {
	// api key 명명
	private String restApi;
}
