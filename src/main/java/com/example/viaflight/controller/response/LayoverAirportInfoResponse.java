package com.example.viaflight.controller.response;

import com.example.viaflight.dto.frameAboutDB.airportDto.LayoverAirportDBFrameDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class LayoverAirportInfoResponse {

	LayoverAirportDBFrameDto layoverAirport;


	public LayoverAirportInfoResponse(LayoverAirportDBFrameDto layoverAirportDBFrameDto) {
		this.layoverAirport = layoverAirportDBFrameDto;
	}

}
