package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Actual Tele-Op", group = "Skystone")
public class FreightFrenzyTeleop extends LinearOpMode {

    @Override
    public void runOpMode() {

        DcMotor left = hardwareMap.dcMotor.get("Left");
        DcMotor right = hardwareMap.dcMotor.get("Right");

        left.setDirection(DcMotor.Direction.REVERSE);
        right.setDirection(DcMotor.Direction.FORWARD);

        waitForStart();

        while (opModeIsActive()) {
            //left stick controls direction,
            //right stick X controls rotation

            double drive = -gamepad1.left_stick_y;//cl
            double turn = gamepad1.left_stick_x;//cl

            double speed = scaleInput(drive);

            double leftPower = scaleInput(drive + turn);
            double rightPower = -leftPower;

            if (gamepad1.left_stick_button || gamepad1.right_stick_button) {
                left.setPower(0);
                right.setPower(0);
            } else {
                left.setPower(leftPower);
                right.setPower(rightPower);
            }

      /*
      IMPORTANT TELEMETRY FOR DEBUGGING
       */
            telemetry.addData("Right Power", "right (%.2f)", right.getPower());
            telemetry.addData("Left Power", "left (%.2f)", left.getPower());
            telemetry.update();
        }
    }

    /*
    This method scales the joystick input so for low joystick values, the
    scaled value is less than linear. This is to make it easier to drive the
    robot more precisely at slower speeds
     */
    private double scaleInput(double dval){

        double[] scaleArray = {0.0, 0.001, 0.005, 0.01, 0.05, 0.1,
                0.15, 0.2, 0.25, 0.3, 0.35, 0.4, 0.45, 0.5, 0.55, 0.6, .7};

        //get the corresponding index for the scaleInput array
        int index = (int) (dval * 16.0);

        //index should be positive
        index = Math.abs(index);

        if (index > 16) {
            index = 16;
        }

        //get value from the array
        double dScale;
        if(dval < 0){
            dScale = -scaleArray[index];
        } else{
            dScale = scaleArray[index];
        }

        //return scaled value
        return dScale;
    }

}
