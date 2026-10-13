package com.fullstacksref;

public record VehicleRecord(String name, String brand,  Integer range) implements GreenVehicleInterface{

	
	public VehicleRecord() {
		
		// we must call the canonical constructor
		this(null,null, 50);
		
		if (range <= 0 )
			throw new IllegalArgumentException("End cannot be lesser than start");
	}
	
	
	VehicleRecord fromBrand(String brand) {
		return new VehicleRecord(null, brand, null);
		
	}

	@Override
	public boolean isElectric() {
		return false;
	}

}
