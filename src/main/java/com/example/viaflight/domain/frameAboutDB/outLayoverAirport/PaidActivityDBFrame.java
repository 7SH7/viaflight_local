package com.example.viaflight.domain.frameAboutDB.outLayoverAirport;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "paid_activity_db_frame")
public class PaidActivityDBFrame {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "paid_activity_id", nullable = false)
	private Long PaidActivityId;

	@Column(name = "paid_activity_name", nullable = false)
	private String paidActivityName;

	@Column(name = "open_time", nullable = true)
	private Double openTime;

	@Column(name = "close_time", nullable = true)
	private Double closeTime;

	@Column(name = "used_time", nullable = true)
	private Double usedTime;

	@Column(name = "business_time", nullable = false)
	private String businessTime;

	@Column(name = "information", nullable = false, length = 1000)
	private String information;

	@Column(name = "cost", nullable = true)
	private String cost;

	@Column(name = "homepage", nullable = true)
	private String homepage;

	@Column(name = "type", nullable = false)
	private String type;

	@Column(name = "image_url" ,nullable = true, length = 1000)
	private String imageURL;

	@Column(name = "layover_airport_id", nullable = false)
	private String layoverAirportId;

}
