package com.example.viaflight.domain.frameAboutDB.airport;

import com.example.viaflight.dto.frameAboutDB.airportDto.LayoverAirportDBFrameDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.geom.Area;

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

	@Column(nullable = true, length = 1000)
	private String wifi;

	@Column(name = "smoking_area", nullable = true, length = 1000)
	private String smokingArea;

	@Column(name = "shower_facilities", nullable = true, length = 1000)
	private String showerFacilities;

	@Column(nullable = true, length = 1000)
	private String pharmacy;

	@Column(name = "currency_exchange", nullable = true, length = 1000)
	private String currencyExchange;

	@Column(name = "luggage_storage", nullable = true, length = 1000)
	private String luggageStorage;

	@Column(name = "information_center", nullable = true, length = 1000)
	private String informationCenter;

	@Column(name = "skytrain", nullable = true, length = 1000)
	private String skytrainInAirport;

	@Column(name = "shuttle_bus", nullable = true, length = 1000)
	private String shuttleBusInAirport;

	@Column(name = "train_mrt", nullable = true, length = 1000)
	private String trainMrtOutAirport;

	@Column(name = "taxi", nullable = true, length = 1000)
	private String taxiOutAirport;

	@Column(name = "public_bus", nullable = true, length = 1000)
	private String publicBusOutAirport;

	@Column(name = "airport_transfer_bus", nullable = true, length = 1000)
	private String airportTransferBusOutAirport;

	@Column(name = "airport_shuttle_bus", nullable = true, length = 1000)
	private String airportShuttleBusOutAirport;


}
