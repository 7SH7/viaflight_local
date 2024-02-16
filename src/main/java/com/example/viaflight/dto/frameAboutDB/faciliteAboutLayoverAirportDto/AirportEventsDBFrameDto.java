package com.example.viaflight.dto.frameAboutDB.faciliteAboutLayoverAirportDto;

import com.example.viaflight.domain.frameAboutDB.faciliteAboutLayoverAirport.AirportEventsDBFrame;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AirportEventsDBFrameDto {

	private String eventName;
	private String location;
	private String openTime;
	private String closeTime;
	private String businessHours;
	private String information;
	private String cost;
	private String reservationUrl;
	private String type;
	private String layoverAirlineId;
	private String imageURL;

	public AirportEventsDBFrameDto from(AirportEventsDBFrame airportEventsDBFrame) {
		return AirportEventsDBFrameDto.builder()
				.eventName(airportEventsDBFrame.getEventName())
				.location(airportEventsDBFrame.getLocation())
				.openTime(airportEventsDBFrame.getOpenTime())
				.closeTime(airportEventsDBFrame.getCloseTime())
				.businessHours(airportEventsDBFrame.getBusinessHours())
				.information(airportEventsDBFrame.getInformation())
				.cost(airportEventsDBFrame.getCost())
				.reservationUrl(airportEventsDBFrame.getReservationUrl())
				.type(airportEventsDBFrame.getType())
				.layoverAirlineId(airportEventsDBFrame.getLayoverAirlineId())
				.imageURL(airportEventsDBFrame.getImageURL())
				.build();
	}

}
