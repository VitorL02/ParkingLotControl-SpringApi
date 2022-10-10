package com.api.parkinglotcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ParkingLotControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingLotControlApplication.class, args);
	}

}
