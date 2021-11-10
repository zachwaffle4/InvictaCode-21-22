package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class vitiHardware {
    DcMotor frontright;
    DcMotor frontleft;
    DcMotor backright;
    DcMotor backleft;
    DcMotor lift;
    DcMotor intakeright;
    DcMotor intakeleft;
    DcMotor spool;

    Servo claw;
    Servo flipper;
    Servo swivel;


    public void init(HardwareMap hardwareMap) {
        frontleft = hardwareMap.get(DcMotor.class,  "frontleft");
        frontright = hardwareMap.get (DcMotor.class, "frontright");
        backleft = hardwareMap.get (DcMotor.class, "backright");
        backright = hardwareMap.get (DcMotor.class, "backleft");

        frontright.setDirection(DcMotor.Direction.FORWARD);
        frontleft.setDirection(DcMotor.Direction.REVERSE);
        backleft.setDirection(DcMotor.Direction.REVERSE);
        backright.setDirection(DcMotor.Direction.FORWARD);

        frontleft.setPower(0);
        frontright.setPower(0);
        backright.setPower(0);
        backleft.setPower(0);

        intakeright = hardwareMap.get(DcMotor.class, "intakeright");
        intakeleft = hardwareMap.get(DcMotor.class, "intakeleft");

        intakeright.setDirection(DcMotor.Direction.FORWARD);
        intakeleft.setDirection(DcMotor.Direction.REVERSE);

        intakeright.setPower(0);
        intakeleft.setPower(0);

        lift = hardwareMap.get (DcMotor.class, "lift");

        lift.setPower(0);

        claw = hardwareMap.get(Servo.class, "claw");

        claw.setDirection(Servo.Direction.FORWARD);

        claw.setPosition(-1);

        flipper = hardwareMap.get (Servo.class, "flipper");

        flipper.setPosition(-1);

        swivel = hardwareMap.get(Servo.class, "swivel");

        swivel.setDirection(Servo.Direction.FORWARD);

        swivel.setPosition(-1);

        spool = hardwareMap.get (DcMotor.class, "spool");

        spool.setDirection(DcMotor.Direction.FORWARD);

        spool.setPower(-1);




    }
    // Sets motors to run without encoders
    public void noEncoders() {
        frontleft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        frontright.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backleft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backright.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }

    public void encoders() {
        frontleft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        frontright.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backleft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backright.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    public void resetEncoders() {
        frontleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }

    public void toPosition() {
        frontleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontright.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backright.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }
}

