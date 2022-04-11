package com.team422.frc.functest;

import com.team422.frc.subsystem.MechTechSubsystem;

/**
 * An interface with default methods for all functional tests. Functional tests
 * are run by the {@link FunctionalTestScheduler} and can be composed (sequentially)
 * into {@link FunctionalTestGroup}s.
 */
public interface FunctionalTest {
    // TODO Create scheduling commands

    /**
     * The routine of a functional test.
     * Called once when the test is initially scheduled. */
    default void run() {
    }

    /**
     * The action to take when the functional test ends. Called when the test finishes,
     * either by timeout or by interruption/cancellation.
     * 
     * @param interrupted whether the test was interrupted/cancelled
     */
    default void end(boolean interrupted) {
    }

    /**
     * Whether the test has finished. Once a test is finished, the scheduler calls
     * its end() method and un-schedules it.
     * 
     * @return whether the test has finished
     */
    abstract boolean isFinished();

    /**
     * Specifies the subsystem that the test uses. Two tests cannot use the
     * same subsystem at the same time.
     * 
     * @return the subsystem that the test uses
     */
    abstract MechTechSubsystem getSubsystem();

    /** Lays out the Shuffleboard widget that controls the test */
    abstract void layoutShuffleboard();
}
