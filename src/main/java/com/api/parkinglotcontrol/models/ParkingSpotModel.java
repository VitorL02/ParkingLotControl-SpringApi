package com.api.parkinglotcontrol.models;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name="tb_parking_spot")
public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true,length  = 10)
    private String parkingSpotNumber;

    @Column(nullable = false, unique = true,length  = 7)
    private String licensePlateCar;

    @Column(nullable = false,length  = 70)
    private String brandCar;

    @Column(nullable = false,length  = 70)
    private String modelCar;

    @Column(nullable = false,length  = 70)
    private String colorCar;

    @Column(nullable = false)
    private LocalDateTime registrationDate;

    @Column(nullable = false, length=130)
    private String resposableName;

    @Column(nullable = false,length = 30)
    private String apartament;


    @Column(nullable = false,length = 30)
    private String block;




}
