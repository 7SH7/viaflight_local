package com.example.viaflight.service;

import com.example.viaflight.controller.request.LayoverAirportRequest;
import com.example.viaflight.controller.response.LayoverAirportOutResponse;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.FoodSpotDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.FreeTourDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.PaidActivityDBFrameDto;
import com.example.viaflight.service.outLayoverAirport.FoodSpotService;
import com.example.viaflight.service.outLayoverAirport.FreeTourService;
import com.example.viaflight.service.outLayoverAirport.PaidActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class OutLayoverAirportInfoService {
	private final FoodSpotService foodSpotService;
	private final FreeTourService freeTourService;
	private final PaidActivityService paidActivityService;

	public LayoverAirportOutResponse load(LayoverAirportRequest layoverAirportRequest) {
		List<FoodSpotDBFrameDto> foodSpotDBFrameDtoList = foodSpotService.load(layoverAirportRequest);
		List<FreeTourDBFrameDto> freeTourDBFrameDtoList = freeTourService.load(layoverAirportRequest);
		List<PaidActivityDBFrameDto> paidActivityDBFrameDtoList = paidActivityService.load(layoverAirportRequest);

		return new LayoverAirportOutResponse(foodSpotDBFrameDtoList, freeTourDBFrameDtoList, paidActivityDBFrameDtoList);

	}

}
