package com.example.viaflight.service;

import com.example.viaflight.controller.request.LayoverAirportRequest;
import com.example.viaflight.controller.response.AllInfoAboutLayoverAirportResponse;
import com.example.viaflight.dto.frameAboutDB.airportDto.LayoverAirportDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.AirportEventsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.MealOptionsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.RestsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.ShoppingOptionsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.FoodSpotDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.FreeTourDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.PaidActivityDBFrameDto;
import com.example.viaflight.service.airport.LayoverAirportService;
import com.example.viaflight.service.inLayoverAirport.AirportEventsService;
import com.example.viaflight.service.inLayoverAirport.MealOptionsService;
import com.example.viaflight.service.inLayoverAirport.RestsService;
import com.example.viaflight.service.inLayoverAirport.ShoppingOptionsService;
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
public class AllLayoverAirportInfoService {

	private final LayoverAirportService layoverAirportService;

	// 공항 in
	private final AirportEventsService airportEventsService;
	private final MealOptionsService mealOptionsService;
	private final RestsService restsService;
	private final ShoppingOptionsService shoppingOptionsService;

	// 공항 out
	private final FoodSpotService foodSpotService;
	private final FreeTourService freeTourService;
	private final PaidActivityService paidActivityService;


	public AllInfoAboutLayoverAirportResponse load(LayoverAirportRequest layoverAirportRequest) {

		LayoverAirportDBFrameDto layoverAirportDBFrameDto = layoverAirportService.load(layoverAirportRequest);

		List<AirportEventsDBFrameDto> airportEventsDBFrameDtoList = airportEventsService.load(layoverAirportRequest);
		List<MealOptionsDBFrameDto> mealOptionsDBFrameDtoList = mealOptionsService.load(layoverAirportRequest);
		List<RestsDBFrameDto> restsDBFrameDtoList = restsService.load(layoverAirportRequest);
		List<ShoppingOptionsDBFrameDto> shoppingOptionsDBFrameDtoList = shoppingOptionsService.load(layoverAirportRequest);

		List<FoodSpotDBFrameDto> foodSpotDBFrameDtoList = foodSpotService.load(layoverAirportRequest);
		List<FreeTourDBFrameDto> freeTourDBFrameDtoList = freeTourService.load(layoverAirportRequest);
		List<PaidActivityDBFrameDto> paidActivityDBFrameDtoList = paidActivityService.load(layoverAirportRequest);

		return new AllInfoAboutLayoverAirportResponse(layoverAirportDBFrameDto, airportEventsDBFrameDtoList, mealOptionsDBFrameDtoList, restsDBFrameDtoList, shoppingOptionsDBFrameDtoList, foodSpotDBFrameDtoList, freeTourDBFrameDtoList, paidActivityDBFrameDtoList);

	}
}
