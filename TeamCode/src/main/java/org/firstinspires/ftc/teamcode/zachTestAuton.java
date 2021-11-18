package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

// below is the Annotation that registers this OpMode with the FtcRobotController app.
// @Autonomous classifies the OpMode as autonomous, name is the OpMode title and the
// optional group places the OpMode into the Exercises group.
// uncomment the @Disable annotation to remove the OpMode from the OpMode list.

@Autonomous(name="Zach Seeing if Autonomous Works", group="robot")
//@Disabled
public class zachTestAuton extends LinearOpMode
{
    DcMotor left;
    DcMotor right;

    // called when init button is  pressed.

    @Override
    public void runOpMode() throws InterruptedException
    {
        left = hardwareMap.dcMotor.get("Left");
        right = hardwareMap.dcMotor.get("Right");

        left.setDirection(DcMotor.Direction.REVERSE);

        telemetry.addData("Mode", "waiting");
        telemetry.update();

        // wait for start button.

        waitForStart();

        telemetry.addData("Mode", "running");
        telemetry.update();

        // set both motors to 25% power.

        left.setPower(0.25);
        right.setPower(0.25);

        sleep(2000);        // wait for 2 seconds.

        // set motor power to zero to stop motors.

        left.setPower(0.0);
        right.setPower(0.0);

        // set both motors to opposite power, turning left

        left.setPower(0.25);
        right.setPower(-0.25);

        sleep(2000);        // wait for 2 seconds.

        // set both motors to 25% power.

        left.setPower(0.25);
        right.setPower(0.25);

        sleep(2000);        // wait for 2 seconds.

        // set motor power to zero to stop motors.

        left.setPower(0.0);
        right.setPower(0.0);
    }
}