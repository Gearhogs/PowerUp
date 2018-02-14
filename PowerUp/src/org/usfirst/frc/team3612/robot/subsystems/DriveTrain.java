package org.usfirst.frc.team3612.robot.subsystems;

import org.usfirst.frc.team3612.robot.RobotMap;
import org.usfirst.frc.team3612.robot.commands.ArcadeDrive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class DriveTrain extends Subsystem {
	private WPI_TalonSRX leftDriveA= new WPI_TalonSRX(RobotMap.leftDrivePortA);
	private WPI_TalonSRX rightDriveA= new WPI_TalonSRX(RobotMap.rightDrivePortA);
	private WPI_TalonSRX leftDriveB= new WPI_TalonSRX(RobotMap.leftDrivePortB);
	private WPI_TalonSRX rightDriveB= new WPI_TalonSRX(RobotMap.rightDrivePortB);
	
	private DifferentialDrive drive = new DifferentialDrive(leftDriveB, rightDriveB);
	
	public DriveTrain() {
		leftDriveA.set(ControlMode.Follower, RobotMap.leftDrivePortB);
		rightDriveA.set(ControlMode.Follower, RobotMap.rightDrivePortB);
		
		rightDriveA.setNeutralMode(NeutralMode.Brake);
		leftDriveA.setNeutralMode(NeutralMode.Brake);
	}
	
	public void initDefaultCommand() {
    	setDefaultCommand(new ArcadeDrive());
    }
	
	public void runMotor(double speed) {
		leftDriveA.set(speed);
		leftDriveB.set(speed);
		rightDriveA.set(speed);
		rightDriveB.set(speed);
	}
	
	
	public void ArcadeDrive(double power, double turn) {
		drive.arcadeDrive(-power,turn,true);
	}
	
	public void CurvatureDrive(double power, double curvature, boolean isTurn) {
		drive.curvatureDrive(power,curvature,isTurn);
	}
}