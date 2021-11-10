package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class FreightFrenzyHardware {
    DcMotor right;
    DcMotor left;

    public void init(HardwareMap hardwareMap) {
        left = hardwareMap.get(DcMotor.class,  "left");
        right = hardwareMap.get (DcMotor.class, "right");

        right.setDirection(DcMotor.Direction.FORWARD);
        left.setDirection(DcMotor.Direction.REVERSE);

        left.setPower(0);
        right.setPower(0);

    }
    // Sets motors to run without encoders
    public void noEncoders() {
        left.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        fronright.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }

    public void encoders() {
        left.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        right.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    public void resetEncoders() {
        left.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        right.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }

    public void toPosition() {
        left.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        right.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }
}

