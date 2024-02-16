package com.example.viaflight.dto.frameAboutDB.faciliteAboutLayoverAirportDto;

import com.example.viaflight.domain.frameAboutDB.faciliteAboutLayoverAirport.RestsDBFrame;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestsDBFrameDto {

	private String restName;
	private String openTime;
	private String closeTime;
	private String businessHours;
	private String location;
	private String information;
	private String phoneNumber;
	private String blog;
	private String cost;
	private String type;
	private String layoverAirlineId;
	private String imageURL;

	public RestsDBFrameDto from(RestsDBFrame restsDBFrame) {
		return RestsDBFrameDto.builder()
				.restName(restsDBFrame.getRestName())
				.openTime(restsDBFrame.getOpenTime())
				.closeTime(restsDBFrame.getCloseTime())
				.businessHours(restsDBFrame.getBusinessHours())
				.location(restsDBFrame.getLocation())
				.information(restsDBFrame.getInformation())
				.phoneNumber(restsDBFrame.getPhoneNumber())
				.blog(restsDBFrame.getBlog())
				.cost(restsDBFrame.getCost())
				.type(restsDBFrame.getType())
				.layoverAirlineId(restsDBFrame.getLayoverAirlineId())
				.imageURL(restsDBFrame.getImageURL())
				.build();
	}

}
