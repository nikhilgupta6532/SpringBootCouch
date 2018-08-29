package com.nikhilgupta.SpringBoot.Animes;

import com.couchbase.client.java.repository.annotation.Field;

public class WrapperName {

	@Field
	private String animeName;
	
	public String getAnimeName() {
		return animeName;
	}

	public void setAnimeName(String animeName) {
		this.animeName = animeName;
	}
}
