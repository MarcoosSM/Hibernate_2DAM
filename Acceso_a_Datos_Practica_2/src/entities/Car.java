package entities;
// Generated 21 ene. 2019 19:42:04 by Hibernate Tools 5.2.11.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Car generated by hbm2java
 */
public class Car implements java.io.Serializable {

	private String licensePlate;
	private String model;
	private String color;
	private String brand;
	private Set reservations = new HashSet(0);

	public Car() {
	}

	public Car(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public Car(String licensePlate, String model, String color, String brand, Set reservations) {
		this.licensePlate = licensePlate;
		this.model = model;
		this.color = color;
		this.brand = brand;
		this.reservations = reservations;
	}

	public String getLicensePlate() {
		return this.licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Set getReservations() {
		return this.reservations;
	}

	public void setReservations(Set reservations) {
		this.reservations = reservations;
	}

}