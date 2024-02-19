package com.example.viaflight.controller.response;

import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.FoodSpotDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.FreeTourDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.PaidActivityDBFrameDto;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class LayoverAirportOutResponse {

	List<FoodSpotDBFrameDto> foodSpot;
	List<FreeTourDBFrameDto> freeTour;
	List<PaidActivityDBFrameDto> activity;

	public LayoverAirportOutResponse(List<FoodSpotDBFrameDto> foodSpotDBFrameDtoList, List<FreeTourDBFrameDto> freeTourDBFrameDtoList, List<PaidActivityDBFrameDto> paidActivityDBFrameDtoList) {
		this.foodSpot = foodSpotDBFrameDtoList;
		this.freeTour = freeTourDBFrameDtoList;
		this.activity = paidActivityDBFrameDtoList;
	}

}
