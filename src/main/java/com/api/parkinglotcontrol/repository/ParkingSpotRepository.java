package com.api.parkinglotcontrol.repository;

import com.api.parkinglotcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID>{
}
