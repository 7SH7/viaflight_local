package com.example.viaflight.service.inLayoverAirport;

import com.example.viaflight.controller.request.LayoverAirportRequest;
import com.example.viaflight.domain.frameAboutDB.inLayoverAirport.MealOptionsDBFrame;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.AirportEventsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.MealOptionsDBFrameDto;
import com.example.viaflight.repository.frameAboutDB.inLayoverAirport.MealOptionsDBFrameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MealOptionsService {
	private final MealOptionsDBFrameRepository mealOptionsDBFrameRepository;

	public List<MealOptionsDBFrameDto> load(LayoverAirportRequest layoverAirportRequest) {
		String layoverAirportId = layoverAirportRequest.getLayoverAirportName().substring(layoverAirportRequest.getLayoverAirportName().length()-4, layoverAirportRequest.getLayoverAirportName().length()-1);
		Double layoverArrivalTime = LayoverAirportRequest.layoverArrivalTimeToDouble(layoverAirportRequest.getLayoverArrivalTime());
		List<MealOptionsDBFrameDto> mealOptionsDBFrameDtoList = mealOptionsDBFrameRepository.findOpenPlaces(layoverAirportId, layoverArrivalTime).stream().map(MealOptionsDBFrameDto::from).toList();

		return mealOptionsDBFrameDtoList;
	}

}
