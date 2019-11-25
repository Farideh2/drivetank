/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class speedController extends Command {
 

  public static Command increment() {
  if (Robot.speedMultiplier == .3){
    Robot.speedMultiplier = .5;
  } 
  else  if (Robot.speedMultiplier == .5){
    Robot.speedMultiplier = .7;
  }
    return null;
  }

  public static Command decrease(){
    if (Robot.speedMultiplier == .7){
      Robot.speedMultiplier = .5;
    } else  if (Robot.speedMultiplier == .5){
     Robot.speedMultiplier = .3;
   } 
   return null;
  }


  public speedController() {
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return true;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
