package com.tapestry.myFirstTapestry.entities;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.tapestry5.beaneditor.NonVisual;
import org.apache.tapestry5.beaneditor.Validate;

import com.tapestry.myFirstTapestry.data.Honorific;

@Entity()
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonVisual
	public Long id;
	public Honorific honorific;
	@Validate("required ,minLength=5")
	public String firstName;
	public String lastName;
	public String street1;
	public String street2;
	public String city;
	public String state;
	@Validate("required,regexp=^\\d{5}(-\\d{4})?$")
	public String zip;
	public String email;
	public String phone;
}
