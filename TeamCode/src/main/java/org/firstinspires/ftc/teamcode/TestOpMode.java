package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name="TestOpMode", group="tests")
public class TestOpMode extends LinearOpMode
{
    @Override
    public void runOpMode()
    {
        telemetry.addData("Status", "Initialized");
        telemetry.update();
        waitForStart();
        int n = 0;
        while(opModeIsActive())
        {
            telemetry.addData("Status", "Running");
            telemetry.addData("Loops", n++);
            telemetry.update();
        }
        telemetry.addData("Status", "Stopped");
        telemetry.update();
    }
}
