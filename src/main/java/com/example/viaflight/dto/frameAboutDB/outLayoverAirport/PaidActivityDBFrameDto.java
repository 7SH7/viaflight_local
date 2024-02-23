package com.example.viaflight.dto.frameAboutDB.outLayoverAirport;

import com.example.viaflight.domain.frameAboutDB.outLayoverAirport.PaidActivityDBFrame;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaidActivityDBFrameDto {

 	private String paidActivityName;
	private Double openTime;
	private Double closeTime;
	private Double usedTime;
	private String businessTime;
	private String information;
	private String cost;
	private String homepage;
	private String type;
	private String imageURL;
	private String layoverAirportId;

	private String wifiHeader;
	private String smokingHeader;
	private String showerFacilitiesHeader;
	private String clinicsPharmacies;
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


	public static PaidActivityDBFrameDto from(PaidActivityDBFrame paidActivityDBFrame) {
		return PaidActivityDBFrameDto.builder()
				.paidActivityName(paidActivityDBFrame.getPaidActivityName())
				.openTime(paidActivityDBFrame.getOpenTime())
				.closeTime(paidActivityDBFrame.getCloseTime())
				.usedTime(paidActivityDBFrame.getUsedTime())
				.businessTime(paidActivityDBFrame.getBusinessTime())
				.information(paidActivityDBFrame.getInformation())
				.cost(paidActivityDBFrame.getCost())
				.homepage(paidActivityDBFrame.getHomepage())
				.type(paidActivityDBFrame.getType())
				.imageURL(paidActivityDBFrame.getImageURL())
				.layoverAirportId(paidActivityDBFrame.getLayoverAirportId())
				.build();
	}

}
