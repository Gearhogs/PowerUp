/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3612.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//A=Front, B=Back, C=Left, D=Right, E=Center
	
	//Drive Ports
	public static int leftDrivePortA = 0;
	public static int leftDrivePortB = 1;
	public static int rightDrivePortA = 2;
	public static int rightDrivePortB = 3;
	
	//Lift Ports
	public static int leftLiftC = 4;
	public static int rightLiftD = 5;
	
	//Intake Ports
	public static int leftIntakeC = 6;
	public static int rightIntakeD = 7;
	
	//Climb Port
	public static int climbPort = 8;
	
	//Encoders
	public static int leftEncoderPortA = 0;
	public static int leftEncoderPortB = 1;
	public static int rightEncoderPortA = 2;
	public static int rightEncoderPortB = 3;
	public static int liftEncoderPortC = 4;
	public static int liftEncoderPortD = 5;
		
	//Sensors
	public static int gyroPort = 0;
	
}
