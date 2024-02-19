package com.example.viaflight.controller.response;

import com.example.viaflight.dto.frameAboutDB.airportDto.LayoverAirportDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.AirportEventsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.MealOptionsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.RestsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.ShoppingOptionsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.FoodSpotDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.FreeTourDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.PaidActivityDBFrameDto;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class AllInfoAboutLayoverAirportResponse {

	LayoverAirportDBFrameDto layoverAirport;

	List<AirportEventsDBFrameDto> airportEvents;
	List<MealOptionsDBFrameDto> foods;
	List<RestsDBFrameDto> rests;
	List<ShoppingOptionsDBFrameDto> shopping;

	List<FoodSpotDBFrameDto> foodSpot;
	List<FreeTourDBFrameDto> freeTour;
	List<PaidActivityDBFrameDto> activity;

	public AllInfoAboutLayoverAirportResponse(LayoverAirportDBFrameDto layoverAirportDBFrameDto, List<AirportEventsDBFrameDto> airportEventsDBFrameDtoList, List<MealOptionsDBFrameDto> mealOptionsDBFrameDtoList, List<RestsDBFrameDto> restsDBFrameDtoList, List<ShoppingOptionsDBFrameDto> shoppingOptionsDBFrameDtoList, List<FoodSpotDBFrameDto> foodSpotDBFrameDtoList, List<FreeTourDBFrameDto> freeTourDBFrameDtoList, List<PaidActivityDBFrameDto> paidActivityDBFrameDtoList) {
		this.layoverAirport = layoverAirportDBFrameDto;

		this.airportEvents = airportEventsDBFrameDtoList;
		this.foods = mealOptionsDBFrameDtoList;
		this.rests = restsDBFrameDtoList;
		this.shopping = shoppingOptionsDBFrameDtoList;

		this.foodSpot = foodSpotDBFrameDtoList;
		this.freeTour = freeTourDBFrameDtoList;
		this.activity = paidActivityDBFrameDtoList;
	}

}
