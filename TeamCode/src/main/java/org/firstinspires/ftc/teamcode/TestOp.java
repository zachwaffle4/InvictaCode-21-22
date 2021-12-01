package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class TestOp extends OpMode {

    DcMotor left = null;
    DcMotor right = null;

    Double TICKS_PER_REV = 537.2;

    @Override
    public void init() {
        left = hardwareMap.get(DcMotor.class, "left");
        right = hardwareMap.get(DcMotor.class, "right");

    }

    public void loop() {
        double leftPower = gamepad1.left_stick_y;
        left.setPower(leftPower);

        double rightPower = gamepad1.right_stick_y;
        right.setPower(rightPower);



    }

}
