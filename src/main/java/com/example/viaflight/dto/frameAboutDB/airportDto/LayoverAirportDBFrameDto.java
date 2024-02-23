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
	private String skyTrainInAirport;
	private String shuttleBusInAirport;
	private String trainMrtOutAirport;
	private String taxiOutAirport;
	private String publicBusOutAirport;
	private String airportTransferBusOutAirport;
	private String airportShuttleBusOutAirport;

	private String wifiHeader;
	private String smokingHeader;
	private String showerFacilitiesHeader;
	private String clinicsPharmaciesHeader;
	private String informationCenterHeader;
	private String luggageStorageHeader;
	private String currencyExchangeHeader;

	private String skyTrainInAirportHeader;
	private String shuttleBusInAirportHeader;

	private String trainMrtOutAirportHeader;
	private String taxiOutAirportHeader;
	private String publicBusOutAirportHeader;
	private String airportTransferOutAirportHeader;
	private String shuttleBusOutAirportHeader;




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
				.skyTrainInAirport(layoverAirportDBFrame.getSkyTrainInAirport())
				.shuttleBusInAirport(layoverAirportDBFrame.getShuttleBusInAirport())
				.trainMrtOutAirport(layoverAirportDBFrame.getTrainMrtOutAirport())
				.taxiOutAirport(layoverAirportDBFrame.getTaxiOutAirport())
				.publicBusOutAirport(layoverAirportDBFrame.getPublicBusOutAirport())
				.airportTransferBusOutAirport(layoverAirportDBFrame.getAirportTransferBusOutAirport())
				.airportShuttleBusOutAirport(layoverAirportDBFrame.getAirportShuttleBusOutAirport())
				.wifiHeader(layoverAirportDBFrame.getWifiHeader())
				.smokingHeader(layoverAirportDBFrame.getSmokingHeader())
				.showerFacilitiesHeader(layoverAirportDBFrame.getShowerFacilitiesHeader())
				.clinicsPharmaciesHeader(layoverAirportDBFrame.getClinicsPharmaciesHeader())
				.informationCenterHeader(layoverAirportDBFrame.getInformationCenterHeader())
				.luggageStorageHeader(layoverAirportDBFrame.getLuggageStorageHeader())
				.currencyExchangeHeader(layoverAirportDBFrame.getCurrencyExchangeHeader())
				.skyTrainInAirportHeader(layoverAirportDBFrame.getSkyTrainInAirportHeader())
				.shuttleBusInAirportHeader(layoverAirportDBFrame.getShuttleBusInAirportHeader())
				.trainMrtOutAirportHeader(layoverAirportDBFrame.getTrainMrtOutAirportHeader())
				.taxiOutAirportHeader(layoverAirportDBFrame.getTaxiOutAirportHeader())
				.publicBusOutAirportHeader(layoverAirportDBFrame.getPublicBusOutAirportHeader())
				.airportTransferOutAirportHeader(layoverAirportDBFrame.getAirportTransferOutAirportHeader())
				.shuttleBusOutAirportHeader(layoverAirportDBFrame.getShuttleBusOutAirportHeader())
				.build();
	}
}
