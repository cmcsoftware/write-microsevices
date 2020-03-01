package com.microservice.write.test;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Users implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6755030260802711033L;

	private String name;
	
	private String surname;
}
