package org.usfirst.frc.team3612.robot.subsystems;

import org.usfirst.frc.team3612.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Lift extends Subsystem {
	private static WPI_TalonSRX rightMotor = new WPI_TalonSRX(RobotMap.leftLiftC);
	private static WPI_TalonSRX leftMotor = new WPI_TalonSRX(RobotMap.rightLiftD);
	
	public Lift() {
		super("Lift");
		
		rightMotor.setName("Lift", "RightMotor");
		leftMotor.setName("Lift", "LeftMotor");
	}
	
	public void runMotor(double speed) {
		rightMotor.set(speed);
		leftMotor.set(speed);
	}
    public void initDefaultCommand() {
		SmartDashboard.putData("LiftMotor", rightMotor);
		SmartDashboard.putData("LiftMotor", leftMotor);
    }
}

