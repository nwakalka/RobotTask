package com.robotassignment.interfaces;

public interface RobotFeatures {

	public boolean walk(double distance);
	public boolean carry(int weight);
	public boolean walkAndCarry(double distance,int weight);
	public void setCharging(int percentage);
}
