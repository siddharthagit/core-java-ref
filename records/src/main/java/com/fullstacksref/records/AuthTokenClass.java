package com.fullstacksref.records;

import java.time.LocalDateTime;

public final class AuthTokenClass {
	
	private final String token;
    private final LocalDateTime dateExpiary;
    private final LocalDateTime dateCreated;

    
	public AuthTokenClass(String token, LocalDateTime dateExpiary, LocalDateTime dateCreated, LocalDateTime date2) {
		this.token = token;
		this.dateExpiary = date2;
		this.dateCreated = dateCreated;
		
	}


	public String getToken() {
		return token;
	}


	public LocalDateTime getDateExpiary() {
		return dateExpiary;
	}


	public LocalDateTime getDateCreated() {
		return dateCreated;
	}
	
}
