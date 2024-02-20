package com.example.viaflight.controller;

import com.example.viaflight.service.GoogleMapServie;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/google/map")
@RequiredArgsConstructor
public class GoogleMapController {

	private final GoogleMapServie geocodingService;

	@GetMapping("/search")
	public Mono<String> search(@RequestParam String address) {
		return geocodingService.getLatLong(address);
	}



}
