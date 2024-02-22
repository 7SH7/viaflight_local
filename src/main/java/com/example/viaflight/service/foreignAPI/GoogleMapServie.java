package com.example.viaflight.service.foreignAPI;

import com.example.viaflight.configuration.GoogleMapsConfiguration;
import com.example.viaflight.controller.response.GeoCodingResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class GoogleMapServie {

	private final GoogleMapsConfiguration properties;
	private WebClient webClient;

	@Autowired
	public void setWebClient(WebClient.Builder webClientBuilder) {
		this.webClient = webClientBuilder.baseUrl("https://maps.googleapis.com/maps/api/geocode/").build();
	}


//	public Mono<String> getLatLong(String address) {
	public Mono<GeoCodingResponse> getLatLong(String address) {
		return webClient.get()
			.uri(uriBuilder -> uriBuilder
				.path("json")
				.queryParam("address", address)
				.queryParam("key", properties.getApiKey())
				.build()
			)
			.retrieve()
			.bodyToMono(Map.class)
			.map(this::extractLatLng);
//			.bodyToMono(String.class);
//			.bodyToMono(GeoCodingResponse.class);
	}

	private GeoCodingResponse extractLatLng(Map<String, Object> responseData) {
		Map<String, Object> location = (Map<String, Object>) ((Map<String, Object>) ((Map<String, Object>) ((List<Object>) responseData.get("results")).get(0)).get("geometry")).get("location");
		Double lat = (Double) location.get("lat");
		Double lng = (Double) location.get("lng");
		return new GeoCodingResponse(lat, lng);
	}

}
