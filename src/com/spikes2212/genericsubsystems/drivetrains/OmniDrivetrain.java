package com.spikes2212.genericsubsystems.drivetrains;

public abstract class OmniDrivetrain extends HolonomicDrivetrain {

	public abstract void setFront(double speedFront); // right is positive

	public abstract void setRear(double speedRear); // right is positive

	public void driveSideways(double speedSideways) {
		setFront(speedSideways);
		setRear(speedSideways);
	}

	@Override
	public void holonomicDrive(double speedY, double speedX, double truningSpeed) {
		driveArcade(speedY, truningSpeed);
		driveSideways(speedX);
	}
}
