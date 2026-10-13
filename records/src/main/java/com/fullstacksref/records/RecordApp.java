package com.fullstacksref.records;

import java.time.LocalDateTime;
import java.util.Date;

public class RecordApp {

	public static void main (String argv[]) {
		
		VehicleRecord vehicle = new VehicleRecord("Sidd", "BMW",  0);
		
		
		
		System.out.println(vehicle);
		
		System.out.println(vehicle.isElectric());
		
		System.out.println(vehicle.fromBrand("Audi"));
		
		
		AuthTokenRecord authToken = new AuthTokenRecord("",  LocalDateTime.now().plusDays(7) , LocalDateTime.now());
		
	}
}


