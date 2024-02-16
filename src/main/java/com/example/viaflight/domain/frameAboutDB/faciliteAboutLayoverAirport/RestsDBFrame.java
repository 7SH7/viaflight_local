package com.example.viaflight.domain.frameAboutDB.faciliteAboutLayoverAirport;

import com.example.viaflight.dto.frameAboutDB.faciliteAboutLayoverAirportDto.RestsDBFrameDto;
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
@Table(name = "rests_db_frame")
public class RestsDBFrame {

	// 라운지, 호텔, 휴식

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rest_id",nullable = false)
	private Long RestId;

	@Column(name = "rest_name", nullable = false)
	private String restName;

	@Column(name = "open_time", nullable = false)
	private String openTime;

	@Column(name = "close_time", nullable = false)
	private String closeTime;

	@Column(name = "business_hours", nullable = false)
	private String businessHours;

	@Column(name = "location", nullable = false)
	private String location;

	@Column(name = "information", nullable = false, length = 1000)
	private String information;

	@Column(name = "phone_number", nullable = true)
	private String phoneNumber;

	@Column(name = "blog", nullable = true)
	private String blog;

	@Column(name = "cost", nullable = true)
	private String cost;

	@Column(name = "type", nullable = false)
	private String type;

	@Column(name = "image_url" ,nullable = true)
	private String imageURL;

	@Column(name = "layover_airline_id", nullable = false)
	private String layoverAirlineId;

}
