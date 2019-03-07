package com.airbus.aurbuzz.model;


public class Aircraft {
	private String id;
	private int msn;
	private int harnessLength;
	private int grossWeight;
	private int atmosphericPressure;
	private int roomTemperature;
	private String airport;
	private int fuelCapacityOnLeftWing;
	private int fuelCapacityOnRightWing;
	private int fuelQuantityOnLeftWing;
	private int fuelQuantityOnRightWing;
	private int maxAltitude;
	private String flightNo;
	private String source;
	private String destination;
	private String date;
	
	public Aircraft() {
	}
	public Aircraft(int msn, int harnessLength, int grossWeight, int atmosphericPressure, int roomTemperature,
			String airport, int fuelCapacityOnLeftWing, int fuelCapacityOnRightWing, int fuelQuantityOnLeftWing,
			int fuelQuantityOnRightWing, int maxAltitude, String flightNo, String source, String destination,
			String date) {
		super();
		this.msn = msn;
		this.harnessLength = harnessLength;
		this.grossWeight = grossWeight;
		this.atmosphericPressure = atmosphericPressure;
		this.roomTemperature = roomTemperature;
		this.airport = airport;
		this.fuelCapacityOnLeftWing = fuelCapacityOnLeftWing;
		this.fuelCapacityOnRightWing = fuelCapacityOnRightWing;
		this.fuelQuantityOnLeftWing = fuelQuantityOnLeftWing;
		this.fuelQuantityOnRightWing = fuelQuantityOnRightWing;
		this.maxAltitude = maxAltitude;
		this.flightNo = flightNo;
		this.source = source;
		this.destination = destination;
		this.date = date;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public int getMsn() {
		return msn;
	}
	public void setMsn(int msn) {
		this.msn = msn;
	}
	public int getHarnessLength() {
		return harnessLength;
	}
	public void setHarnessLength(int harnessLength) {
		this.harnessLength = harnessLength;
	}
	public int getGrossWeight() {
		return grossWeight;
	}
	public void setGrossWeight(int grossWeight) {
		this.grossWeight = grossWeight;
	}
	public int getAtmosphericPressure() {
		return atmosphericPressure;
	}
	public void setAtmosphericPressure(int atmosphericPressure) {
		this.atmosphericPressure = atmosphericPressure;
	}
	public int getRoomTemperature() {
		return roomTemperature;
	}
	public void setRoomTemperature(int roomTemperature) {
		this.roomTemperature = roomTemperature;
	}
	public String getAirport() {
		return airport;
	}
	public void setAirport(String airport) {
		this.airport = airport;
	}
	public int getFuelCapacityOnLeftWing() {
		return fuelCapacityOnLeftWing;
	}
	public void setFuelCapacityOnLeftWing(int fuelCapacityOnLeftWing) {
		this.fuelCapacityOnLeftWing = fuelCapacityOnLeftWing;
	}
	public int getFuelCapacityOnRightWing() {
		return fuelCapacityOnRightWing;
	}
	public void setFuelCapacityOnRightWing(int fuelCapacityOnRightWing) {
		this.fuelCapacityOnRightWing = fuelCapacityOnRightWing;
	}
	public int getFuelQuantityOnLeftWing() {
		return fuelQuantityOnLeftWing;
	}
	public void setFuelQuantityOnLeftWing(int fuelQuantityOnLeftWing) {
		this.fuelQuantityOnLeftWing = fuelQuantityOnLeftWing;
	}
	public int getFuelQuantityOnRightWing() {
		return fuelQuantityOnRightWing;
	}
	public void setFuelQuantityOnRightWing(int fuelQuantityOnRightWing) {
		this.fuelQuantityOnRightWing = fuelQuantityOnRightWing;
	}
	public int getMaxAltitude() {
		return maxAltitude;
	}
	public void setMaxAltitude(int maxAltitude) {
		this.maxAltitude = maxAltitude;
	}
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	
	
}
