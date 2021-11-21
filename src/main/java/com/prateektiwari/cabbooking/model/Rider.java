package com.prateektiwari.cabbooking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Rider {
	String id;
	String name;

	public Rider(String riderId, String riderName) {
		this.id = riderId;
		this.name = riderName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
