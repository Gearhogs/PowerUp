package org.usfirst.frc.team3612.robot.subsystems;

import org.usfirst.frc.team3612.robot.RobotMap;
import org.usfirst.frc.team3612.robot.commands.runIntake;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Intake extends Subsystem {

	private static WPI_TalonSRX rightMotor = new WPI_TalonSRX(RobotMap.leftIntakeC);
	private static WPI_TalonSRX leftMotor = new WPI_TalonSRX(RobotMap.rightIntakeD);
	
	
	public Intake() {
		super("Intake");
		
		rightMotor.setName("Intake", "RightMotor");
		leftMotor.setName("Intake", "LeftMotor");
	}
	
	public void runMotor(double speed) {
		rightMotor.set(-speed);
		leftMotor.set(-speed);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new runIntake(0));
    }

	public void log() {
		SmartDashboard.putData("IntakeMotor", rightMotor);
		SmartDashboard.putData("IntakeMotor", leftMotor);
		
	}
}
