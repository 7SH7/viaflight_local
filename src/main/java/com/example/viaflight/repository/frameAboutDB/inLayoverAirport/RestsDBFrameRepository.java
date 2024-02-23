package com.example.viaflight.repository.frameAboutDB.inLayoverAirport;

import com.example.viaflight.domain.frameAboutDB.inLayoverAirport.RestsDBFrame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestsDBFrameRepository extends JpaRepository<RestsDBFrame, Long> {

	@Query("SELECT a FROM RestsDBFrame a WHERE a.layoverAirportId = :layoverAirportId AND ((a.openTime <= :layoverArrivalTime AND a.closeTime >= :layoverArrivalTime) OR (a.openTime > a.closeTime AND ((:layoverArrivalTime >= a.openTime) OR (:layoverArrivalTime < a.closeTime))))")
	List<RestsDBFrame> findOpenPlaces(@Param("layoverAirportId") String layoverAirportId, @Param("layoverArrivalTime") Double layoverArrivalTime);

}
