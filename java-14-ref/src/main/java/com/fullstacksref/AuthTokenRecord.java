package com.fullstacksref;

import java.time.LocalDateTime;

public record AuthTokenRecord(String token, LocalDateTime dateExpiary, LocalDateTime dateCreated) {

	public AuthTokenRecord {
	
		if (token == "" || token == null)
			throw new java.lang.IllegalArgumentException(String.format("Invalid token: %f", token));
	}

}
