package com.example.viaflight.controller.response;

import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.AirportEventsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.MealOptionsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.RestsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.ShoppingOptionsDBFrameDto;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class LayoverAirportInResponse {
	List<AirportEventsDBFrameDto> airportEvents;
	List<MealOptionsDBFrameDto> foods;
	List<RestsDBFrameDto> rests;
	List<ShoppingOptionsDBFrameDto> shopping;

	public LayoverAirportInResponse (List<AirportEventsDBFrameDto> airportEventsDBFrameDtoList, List<MealOptionsDBFrameDto> mealOptionsDBFrameDtoList, List<RestsDBFrameDto> restsDBFrameDtoList, List<ShoppingOptionsDBFrameDto> shoppingOptionsDBFrameDtoList) {
		this.airportEvents = airportEventsDBFrameDtoList;
		this.foods = mealOptionsDBFrameDtoList;
		this.rests = restsDBFrameDtoList;
		this.shopping = shoppingOptionsDBFrameDtoList;
	}

}
