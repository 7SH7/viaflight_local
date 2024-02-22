package com.example.viaflight.controller.response;

import lombok.Data;

import java.util.List;

@Data
public class GeoCodingResponse {

		private Double lat;
		private Double lng;

		public GeoCodingResponse(Double lat, Double lng) {
			this.lat = lat;
			this.lng = lng;
		}

}
