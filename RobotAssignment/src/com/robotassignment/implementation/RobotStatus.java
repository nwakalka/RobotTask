package com.robotassignment.implementation;

import com.robotassignment.interfaces.RobotHealth;
import com.robotassignment.model.Robot;

public class RobotStatus extends RobotHealth{

	@Override
	public boolean canCarry(int weight) {
		if(weight > 10){
			System.out.println("OVERWEIGHT");
			return false;
		}
		return true;
	}

	@Override
	public boolean powerCheck(Robot r, int charging) {
		int availableCharging = r.getChargingStatus();
		if(availableCharging < charging){
			System.out.println("Not enough charging available for task");
			return false;
		}else{
			int remainingCharging = availableCharging - charging;
			r.setChargingStatus(remainingCharging);
			if(remainingCharging <=15){
				r.setHeadingstatus(Robot.color.RED);
			}
			return true;
		}
	}

}
