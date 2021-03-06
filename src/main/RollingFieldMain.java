package main;

import behaviour.BarCode;
import lejos.hardware.Button;
import robot.Robot;
import robot.RobotConfiguration;

public class RollingFieldMain {

	public static void main(String[] args) {
		RobotConfiguration robotConfig = new RobotConfiguration();
		robotConfig.initializeMotors();
		
		Button.LEDPattern(6);
		Button.waitForAnyPress();
		
		Robot robot = new Robot(robotConfig);
		robot.passObstacleWithBarCode(BarCode.ROLLINGFIELD);

	}

}
