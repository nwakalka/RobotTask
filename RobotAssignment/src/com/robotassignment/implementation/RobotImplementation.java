package com.robotassignment.implementation;

import com.robotassignment.interfaces.RobotFeatures;
import com.robotassignment.model.Robot;

public class RobotImplementation implements RobotFeatures {
	
	private Robot robot;
	private RobotStatus robotStatus;
	private static int availableCharging;
	
	public RobotImplementation() {
		this.robot = new Robot();
		this.robotStatus = new RobotStatus();
	}

	@Override
	public boolean walk(double distance) {
		availableCharging = robot.getChargingStatus();
		int requiredCharging = (int) (distance * 1000/50);
		if(robotStatus.powerCheck(robot, requiredCharging)){
			System.out.println("Walked :"+ distance +"km charging used :"+requiredCharging+"% remaining charing :"+robot.getChargingStatus()+"%");
			System.out.println("Robot Heading status :"+robot.getHeadingstatus());
			return true;
		}
		return false;
	}

	@Override
	public boolean carry(int weight) {
		if(robotStatus.canCarry(weight)){
			int requiredCharging = weight*2;
			availableCharging = robot.getChargingStatus();
			if(robotStatus.powerCheck(robot, requiredCharging)){
				System.out.println("carried weight :"+ weight +"km charging used :"+requiredCharging+"% remaining charing :"+robot.getChargingStatus()+"%");
				System.out.println("Robot Heading status :"+robot.getHeadingstatus());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean walkAndCarry(double distance, int weight) {
		if(robotStatus.canCarry(weight)){
			int requiredChargingwt = weight*2;
			int requiredChargingdist = (int) (distance * 1000/50);
			int requiredCharging = requiredChargingdist + requiredChargingwt;
			availableCharging = robot.getChargingStatus();
			if(robotStatus.powerCheck(robot, requiredCharging)){
				System.out.println("Distance walked :"+distance+"km carried weight :"+ weight +"km charging used :"+requiredCharging+"% remaining charing :"+robot.getChargingStatus()+"%");
				System.out.println("Robot Heading status :"+robot.getHeadingstatus());
				return true;
			}
		}
		return false;
	}

	@Override
	public void setCharging(int percentage) {
		int currentCharging = robot.getChargingStatus();
		if(currentCharging + percentage >=100){
			robot.setChargingStatus(100);
		}else{
			robot.setChargingStatus(currentCharging+percentage);
		}
	}

}
