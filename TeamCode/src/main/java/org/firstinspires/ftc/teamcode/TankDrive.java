package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="TankDrive", group="tests")
public class TankDrive extends LinearOpMode
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
            double powerL = gamepad1.left_stick_y;
            double powerR = gamepad1.right_stick_y;

            driveL.setPower(-powerL);
            driveR.setPower(powerR);

            telemetry.addData("Status", "Running");
            telemetry.addData("L", powerL);
            telemetry.addData("R", powerR);
            telemetry.update();

            sleep(5);
        }

        telemetry.addData("Status", "Stopped");
        telemetry.update();
    }
}
