package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="RacingDrive", group="tests")
public class RacingDrive extends LinearOpMode
{
    @Override
    public void runOpMode()
    {
        DcMotor driveL = hardwareMap.dcMotor.get("driveL");
        DcMotor driveR = hardwareMap.dcMotor.get("driveR");

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();

        int n = 0;

        while(opModeIsActive())  
        {
            double powerY = gamepad1.right_trigger - gamepad1.left_trigger;
            double powerX = gamepad1.left_stick_x;

            driveL.setPower(powerY + powerX);
            driveR.setPower(-powerY + powerX);

            telemetry.addData("Status", "Running");
            telemetry.addData("X", powerX);
            telemetry.addData("Y", powerY);
            telemetry.update();

            sleep(5);
        }

        telemetry.addData("Status", "Stopped");
        telemetry.update();
    }
}
