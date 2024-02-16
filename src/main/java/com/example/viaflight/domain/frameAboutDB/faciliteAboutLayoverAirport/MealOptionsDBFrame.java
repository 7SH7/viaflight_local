package com.example.viaflight.domain.frameAboutDB.faciliteAboutLayoverAirport;

import com.example.viaflight.dto.frameAboutDB.faciliteAboutLayoverAirportDto.MealOptionsDBFrameDto;
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
@Table(name = "meal_options_db_frame")
public class MealOptionsDBFrame {

	// 식사, 카페, 디저트

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "meal_options_id",nullable = false)
	private Long mealOptionsId;

	@Column(name = "meal_name", nullable = false)
	private String mealName;

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

	@Column(name = "cost", nullable = true)
	private String cost;

	@Column(name = "blog", nullable = true)
	private String blog;

	@Column(name = "type", nullable = false)
	private String type;

	@Column(name = "image_url" ,nullable = true)
	private String imageURL;

	@Column(name = "layover_airline_id", nullable = false)
	private String layoverAirlineId;



}
