package com.example.viaflight.controller.response;

import com.example.viaflight.dto.frameAboutDB.airportDto.LayoverAirportDBFrameDto;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LayoverAirportInfo {

	LayoverAirportDBFrameDto layoverAirport;

	public LayoverAirportInfo (LayoverAirportDBFrameDto layoverAirportDBFrameDto) {
		this.layoverAirport = layoverAirportDBFrameDto;
	}

}
