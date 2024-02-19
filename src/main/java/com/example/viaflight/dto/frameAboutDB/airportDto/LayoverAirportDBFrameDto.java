package com.example.viaflight.dto.frameAboutDB.airportDto;

import com.example.viaflight.domain.frameAboutDB.airport.LayoverAirportDBFrame;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class LayoverAirportDBFrameDto {

	private String layoverAirportId;    // 이건 이제 SIN 이런 것들 해주는 것.
	private String layoverAirportName;
	private String layoverAirportEngName;
	private String wifi;
	private String smokingArea;
	private String showerFacilities;
	private String pharmacy;
	private String currencyExchange;
	private String luggageStorage;
	private String informationCenter;
	private String skytrainInAirport;
	private String shuttleBusInAirport;
	private String trainMrtOutAirport;
	private String taxiOutAirport;
	private String publicBusOutAirport;
	private String airportTransferBusOutAirport;
	private String airportShuttleBusOutAirport;

	public static LayoverAirportDBFrameDto from(LayoverAirportDBFrame layoverAirportDBFrame) {
		return LayoverAirportDBFrameDto.builder()
				.layoverAirportId(layoverAirportDBFrame.getLayoverAirportId())
				.layoverAirportName(layoverAirportDBFrame.getLayoverAirportName())
				.layoverAirportEngName(layoverAirportDBFrame.getLayoverAirportEngName())
				.wifi(layoverAirportDBFrame.getWifi())
				.smokingArea(layoverAirportDBFrame.getSmokingArea())
				.showerFacilities(layoverAirportDBFrame.getShowerFacilities())
				.pharmacy(layoverAirportDBFrame.getPharmacy())
				.currencyExchange(layoverAirportDBFrame.getCurrencyExchange())
				.luggageStorage(layoverAirportDBFrame.getLuggageStorage())
				.informationCenter(layoverAirportDBFrame.getInformationCenter())
				.skytrainInAirport(layoverAirportDBFrame.getSkytrainInAirport())
				.shuttleBusInAirport(layoverAirportDBFrame.getShuttleBusInAirport())
				.trainMrtOutAirport(layoverAirportDBFrame.getTrainMrtOutAirport())
				.taxiOutAirport(layoverAirportDBFrame.getTaxiOutAirport())
				.publicBusOutAirport(layoverAirportDBFrame.getPublicBusOutAirport())
				.airportTransferBusOutAirport(layoverAirportDBFrame.getAirportTransferBusOutAirport())
				.airportShuttleBusOutAirport(layoverAirportDBFrame.getAirportShuttleBusOutAirport())
				.build();
	}

}
