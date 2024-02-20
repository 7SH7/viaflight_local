package com.example.viaflight.repository.frameAboutDB.outLayoverAirport;

import com.example.viaflight.domain.frameAboutDB.outLayoverAirport.PaidActivityDBFrame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaidActivityDBFrameRepository extends JpaRepository<PaidActivityDBFrame, Long> {
	@Query("SELECT a FROM PaidActivityDBFrame a WHERE a.layoverAirportId = :layoverAirportId AND ((a.openTime <= :tourArrivalTime AND :tourArrivalTime < a.closeTime AND a.usedTime <= :ableTourTime) OR ((:tourArrivalTime <= a.openTime AND a.openTime < (:tourArrivalTime + :ableTourTime)) OR (:tourArrivalTime <= a.closeTime AND a.closeTime <= (:tourArrivalTime + :ableTourTime))))")
	List<PaidActivityDBFrame> findByPaidActivity(@Param("layoverAirportId") String layoverAirportId, @Param("tourArrivalTime") double tourArrivalTime, @Param("ableTourTime") double ableTourTime);

}
