package com.api.parkinglotcontrol.services;

import com.api.parkinglotcontrol.models.ParkingSpotModel;
import com.api.parkinglotcontrol.repository.ParkingSpotRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ParkingSpotService {

    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

    @Transactional //Usado para garantir rollback por deleções em cascatas
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }

    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return parkingSpotRepository.existsByLicensePlateCar(parkingSpotNumber);
    }

    public boolean existsByApartamentAndBlock(String apartament, String block) {
        return parkingSpotRepository.existsByApartamentAndBlock(apartament,block);
    }
}
