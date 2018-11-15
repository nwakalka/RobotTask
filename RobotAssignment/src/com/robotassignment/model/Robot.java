package com.robotassignment.model;

public class Robot {

	
	
	public Robot() {
		this.chargingStatus=100;
		this.headingstatus=color.GREEN;
		this.walkingCapacity=MAX_WEIGHT;
		this.weightCapacity=10;
	}
	public enum color{
		RED,GREEN
	}
	private int chargingStatus;
	private int walkingCapacity;
	private int weightCapacity;
	private color headingstatus;
	private static final int MAX_WEIGHT = 10;
	public int getChargingStatus() {
		return chargingStatus;
	}
	public void setChargingStatus(int chargingStatus) {
		this.chargingStatus = chargingStatus;
	}
	public int getWalkingCapacity() {
		return walkingCapacity;
	}
	public void setWalkingCapacity(int walkingCapacity) {
		this.walkingCapacity = walkingCapacity;
	}
	public int getWeightCapacity() {
		return weightCapacity;
	}
	public void setWeightCapacity(int weightCapacity) {
		this.weightCapacity = weightCapacity;
	}
	public color getHeadingstatus() {
		return headingstatus;
	}
	public void setHeadingstatus(color headingstatus) {
		this.headingstatus = headingstatus;
	}
	
	
}
