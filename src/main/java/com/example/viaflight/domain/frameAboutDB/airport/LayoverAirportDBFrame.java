package com.example.viaflight.domain.frameAboutDB.airport;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "layover_airport_db_frame")
public class LayoverAirportDBFrame {

	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idx;

	@Column(name = "layover_airport_id", nullable = false)
	private String layoverAirportId;

	@Column(name = "layover_airport_name", nullable = false)
	private String layoverAirportName;

	@Column(name = "layover_airport_eng_name", nullable = false)
	private String layoverAirportEngName;

	@Column(nullable = true, length = 400)
	private String wifi;

	@Column(name = "smoking_area", nullable = true, length = 500)
	private String smokingArea;

	@Column(name = "shower_facilities", nullable = true, length = 600)
	private String showerFacilities;

	@Column(nullable = true, length = 400)
	private String pharmacy;

	@Column(name = "currency_exchange", nullable = true, length = 500)
	private String currencyExchange;

	@Column(name = "luggage_storage", nullable = true, length = 500)
	private String luggageStorage;

	@Column(name = "information_center", nullable = true, length = 500)
	private String informationCenter;

	@Column(name = "skytrain", nullable = true, length = 500)
	private String skyTrainInAirport;

	@Column(name = "shuttle_bus", nullable = true, length = 500)
	private String shuttleBusInAirport;

	@Column(name = "train_mrt", nullable = true, length = 500)
	private String trainMrtOutAirport;

	@Column(name = "taxi", nullable = true, length = 500)
	private String taxiOutAirport;

	@Column(name = "public_bus", nullable = true, length = 500)
	private String publicBusOutAirport;

	@Column(name = "airport_transfer_bus", nullable = true, length = 500)
	private String airportTransferBusOutAirport;

	@Column(name = "airport_shuttle_bus", nullable = true, length = 500)
	private String airportShuttleBusOutAirport;

	@Column(name = "wifi_header", nullable = true)
	private String wifiHeader;

	@Column(name = "smoking_header", nullable = true)
	private String smokingHeader;

	@Column(name = "shower_facilities_header", nullable = true)
	private String showerFacilitiesHeader;

	@Column(name = "clinics_pharmacies_header", nullable = true )
	private String clinicsPharmaciesHeader;

	@Column(name = "information_center_header", nullable = true)
	private String informationCenterHeader;

	@Column(name = "luggage_storage_header", nullable = true)
	private String luggageStorageHeader;

	@Column(name = "currency_exchange_header", nullable = true)
	private String currencyExchangeHeader;

	@Column(name = "skytrain_in_airport_header", nullable = true)
	private String skyTrainInAirportHeader;

	@Column(name = "shuttle_bus_in_airport_header", nullable = true)
	private String shuttleBusInAirportHeader;

	@Column(name = "train_mrt_out_airport_header", nullable = true)
	private String trainMrtOutAirportHeader;

	@Column(name = "taxi_out_airport_header", nullable = true)
	private String taxiOutAirportHeader;

	@Column(name = "public_bus_out_airport_header", nullable = true)
	private String publicBusOutAirportHeader;

	@Column(name = "airport_transfer_out_airport_header", nullable = true)
	private String airportTransferOutAirportHeader;

	@Column(name = "shuttle_bus_out_airport_header", nullable = true)
	private String shuttleBusOutAirportHeader;


}
