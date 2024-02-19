package com.example.viaflight.service;

import com.example.viaflight.controller.request.LayoverAirportRequest;
import com.example.viaflight.controller.response.LayoverAirportInResponse;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.AirportEventsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.MealOptionsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.RestsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.ShoppingOptionsDBFrameDto;
import com.example.viaflight.service.inLayoverAirport.AirportEventsService;
import com.example.viaflight.service.inLayoverAirport.MealOptionsService;
import com.example.viaflight.service.inLayoverAirport.RestsService;
import com.example.viaflight.service.inLayoverAirport.ShoppingOptionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class InLayoverAirportInfoService {
	private final AirportEventsService airportEventsService;
	private final MealOptionsService mealOptionsService;
	private final RestsService restsService;
	private final ShoppingOptionsService shoppingOptionsService;

	public LayoverAirportInResponse load(LayoverAirportRequest layoverAirportRequest) {

		List<AirportEventsDBFrameDto> airportEventsDBFrameDtoList = airportEventsService.load(layoverAirportRequest);
		List<MealOptionsDBFrameDto> mealOptionsDBFrameDtoList = mealOptionsService.load(layoverAirportRequest);
		List<RestsDBFrameDto> restsDBFrameDtoList = restsService.load(layoverAirportRequest);
		List<ShoppingOptionsDBFrameDto> shoppingOptionsDBFrameDtoList = shoppingOptionsService.load(layoverAirportRequest);
		return new LayoverAirportInResponse(airportEventsDBFrameDtoList, mealOptionsDBFrameDtoList, restsDBFrameDtoList, shoppingOptionsDBFrameDtoList);
	}

}
