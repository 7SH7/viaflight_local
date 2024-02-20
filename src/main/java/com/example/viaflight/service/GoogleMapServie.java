package com.example.viaflight.service;

import com.example.viaflight.configuration.GoogleMapsConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class GoogleMapServie {

	private final GoogleMapsConfiguration properties;
	private WebClient webClient;

	@Autowired
	public void setWebClient(WebClient.Builder webClientBuilder) {
		this.webClient = webClientBuilder.baseUrl("https://maps.googleapis.com/maps/api/geocode/").build();
	}


	public Mono<String> getLatLong(String address) {
		return webClient.get()
			.uri(uriBuilder -> uriBuilder
				.path("json")
				.queryParam("address", address)
				.queryParam("key", properties.getApiKey())
				.build()
			)
			.retrieve()
			.bodyToMono(String.class);
	}

}
