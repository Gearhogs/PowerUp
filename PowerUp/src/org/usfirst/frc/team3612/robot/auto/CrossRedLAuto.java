package org.usfirst.frc.team3612.robot.auto;
import org.usfirst.frc.team3612.robot.commands.TimeControl;
import org.usfirst.frc.team3612.robot.commands.DriveForward;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CrossRedLAuto extends CommandGroup {

    public CrossRedLAuto() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	addSequential (new DriveForward(1));
    	
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
