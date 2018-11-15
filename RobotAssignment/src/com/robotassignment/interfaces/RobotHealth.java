package com.robotassignment.interfaces;

import com.robotassignment.model.Robot;

public abstract class RobotHealth {

	public abstract boolean canCarry(int weight);
	public abstract boolean powerCheck(Robot r , int charging);
}
