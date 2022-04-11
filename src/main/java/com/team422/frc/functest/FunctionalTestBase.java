package com.team422.frc.functest;

import com.team422.frc.subsystem.MechTechSubsystem;

import edu.wpi.first.util.sendable.Sendable;
import edu.wpi.first.util.sendable.SendableRegistry;

/**
 * A new class for functional tests during system checks and other cases
 */
public class FunctionalTestBase implements FunctionalTest, Sendable {
    // TODO Deal with timeouts
    // TODO Create interface with Shuffleboard
    // TODO Deal with interruptibility via Shuffleboard

    protected MechTechSubsystem requirement;

    protected FunctionalTestBase() {
        String name = getClass().getName();
        SendableRegistry.add(this, name.substring(name.lastIndexOf(".") + 1));
    }
}
