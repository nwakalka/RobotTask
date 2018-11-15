package com.robotassignment.main;

import com.robotassignment.implementation.RobotImplementation;
import com.robotassignment.interfaces.RobotFeatures;

public class RobotMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RobotFeatures rf = new RobotImplementation();
		//rf.carry(10);
		//rf.walk(2);
		rf.walkAndCarry(2, 8);
	}

}
