package com.example.car_maintanance_tracker;

import org.springframework.boot.SpringApplication;

public class TestCarMaintananceTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.from(CarMaintananceTrackerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
