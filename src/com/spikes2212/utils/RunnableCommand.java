package com.spikes2212.utils;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RunnableCommand extends Command {

	private Runnable runnable;
	private Thread t;

	public RunnableCommand(Runnable runnable) {
		this.runnable = runnable;
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		t = new Thread(runnable);
		t.start();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return !t.isAlive();
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}