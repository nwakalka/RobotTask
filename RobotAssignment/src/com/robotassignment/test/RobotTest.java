package com.robotassignment.test;

import org.junit.Assert;
import org.junit.Test;

import com.robotassignment.implementation.RobotImplementation;
import com.robotassignment.interfaces.RobotFeatures;

public class RobotTest {

	RobotFeatures rf = new RobotImplementation();
	
	@Test
	public void testOverweightSucess(){
		Assert.assertEquals(true, rf.carry(4));
	}
	
	@Test
	public void testOverweightFail(){
		Assert.assertEquals("OVERWEIGHT",false, rf.carry(12));
	}
	
	@Test
	public void testWalkSucess(){
		Assert.assertEquals(true, rf.walk(3));
	}
	@Test
	public void testWalkFail(){
		Assert.assertEquals("Not enough charging available for task ",false, rf.carry(12));
	}
	@Test
	public void testWalkAndCarrySucess(){
		Assert.assertEquals(true, rf.walkAndCarry(2,6));
	}
	@Test
	public void testWalkAndCarryFail(){
		Assert.assertEquals(false, rf.walkAndCarry(5, 8));
	}
	
}
