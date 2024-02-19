package com.example.viaflight.repository.frameAboutDB.outLayoverAirport;

import com.example.viaflight.domain.frameAboutDB.outLayoverAirport.FoodSpotDBFrame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodSpotDBFrameRepository extends JpaRepository<FoodSpotDBFrame, Long> {
	@Query("SELECT a FROM FoodSpotDBFrame a WHERE a.layoverAirportId = :layoverAirportId AND ((a.openTime <= :tourArrivalTime AND a.closeTime >= :tourArrivalTime) OR (a.closeTime > :tourArrivalTime AND a.openTime > a.closeTime))")
	List<FoodSpotDBFrame> findOpenFoodSpot(@Param("layoverAirportId") String layoverAirportId, @Param("tourArrivalTime") double tourArrivalTime);

}
