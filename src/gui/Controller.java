package com.a604958692.r8setuning;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private TextField accel_level_input, speed_level_input, handling_level_input, nitro_level_input, tires_level_input, suspension_level_input, drivetrain_level_input, exhaust_level_input;
    @FXML private Label resultLabel;

    @FXML
    private void calculate() {
        double acceleration_stock, top_speed_stock, handling_stock, nitro_stock;
        int rank_stock;
        acceleration_stock = 4.09d;
        top_speed_stock = 211.2d;
        handling_stock = 1.205d;
        nitro_stock = 28.6d;
        rank_stock = 459;

        //Levels below are cumulative

        double acceleration_1, acceleration_2, acceleration_3, acceleration_4, acceleration_5;
        double top_speed_1, top_speed_2, top_speed_3, top_speed_4, top_speed_5;
        double handling_1, handling_2, handling_3, handling_4, handling_5;
        double nitro_1, nitro_2, nitro_3, nitro_4, nitro_5;
        double tires_speed_1, tires_speed_2, tires_speed_3, tires_speed_4, tires_speed_5;
        double tires_handling_1, tires_handling_2, tires_handling_3, tires_handling_4, tires_handling_5;
        double suspension_nitro_1, suspension_nitro_2, suspension_nitro_3, suspension_nitro_4, suspension_nitro_5;
        double suspension_handling_1, suspension_handling_2, suspension_handling_3, suspension_handling_4, suspension_handling_5;
        double drivetrain_speed_1, drivetrain_speed_2, drivetrain_speed_3, drivetrain_speed_4, drivetrain_speed_5;
        double drivetrain_accel_1, drivetrain_accel_2, drivetrain_accel_3, drivetrain_accel_4, drivetrain_accel_5;
        double exhaust_nitro_1, exhaust_nitro_2, exhaust_nitro_3, exhaust_nitro_4, exhaust_nitro_5;
        double exhaust_accel_1, exhaust_accel_2, exhaust_accel_3, exhaust_accel_4, exhaust_accel_5;

        double acceleration_1_rank, acceleration_2_rank, acceleration_3_rank, acceleration_4_rank, acceleration_5_rank;
        double top_speed_1_rank, top_speed_2_rank, top_speed_3_rank, top_speed_4_rank, top_speed_5_rank;
        double handling_1_rank, handling_2_rank, handling_3_rank, handling_4_rank, handling_5_rank;
        double nitro_1_rank, nitro_2_rank, nitro_3_rank, nitro_4_rank, nitro_5_rank;
        double tires_1_rank, tires_2_rank, tires_3_rank, tires_4_rank, tires_5_rank;
        double suspension_1_rank, suspension_2_rank, suspension_3_rank, suspension_4_rank, suspension_5_rank;
        double drivetrain_1_rank, drivetrain_2_rank, drivetrain_3_rank, drivetrain_4_rank, drivetrain_5_rank;
        double exhaust_1_rank, exhaust_2_rank, exhaust_3_rank, exhaust_4_rank, exhaust_5_rank;

        int accel_level = 0, speed_level = 0, handling_level = 0, nitro_level = 0;
        int tires_level = 0, suspension_level = 0, drivetrain_level = 0, exhaust_level = 0;

        double accel_output, speed_output, handling_output, nitro_output;
        double accel_output_rank, speed_output_rank, handling_output_rank, nitro_output_rank;

        double tires_output_speed, tires_output_handling;
        double suspension_output_nitro, suspension_output_handling;
        double drivetrain_output_speed, drivetrain_output_accel;
        double exhaust_output_nitro, exhaust_output_accel;

        double tires_output_rank, suspension_output_rank, drivetrain_output_rank, exhaust_output_rank;

        double total_accel, total_speed, total_handling, total_nitro;
        double total_rank;

        acceleration_1 = -0.17d; //3.92
        acceleration_2 = -0.39d; //3.70
        acceleration_3 = -0.67d; //3.42
        acceleration_4 = -0.99d; //3.10
        acceleration_5 = -1.31d; //2.78

        top_speed_1 = 16.8d; //228.0
        top_speed_2 = 39.0d; //250.2
        top_speed_3 = 66.9d; //278.1
        top_speed_4 = 100.3d; //311.5
        top_speed_5 = 130.9d; //342.1

        handling_1 = 0.008d; //1.213
        handling_2 = 0.018d; //1.223
        handling_3 = 0.030d; //1.235
        handling_4 = 0.045d; //1.250
        handling_5 = 0.059d; //1.264

        nitro_1 = 2.0d; //30.6
        nitro_2 = 4.7d; //33.3
        nitro_3 = 8.1d; //36.7
        nitro_4 = 12.1d; //40.7
        nitro_5 = 15.8d; //44.4

        tires_speed_1 = 5.4d; //216.6
        tires_speed_2 = 12.1d; //223.3
        tires_speed_3 = 20.2d; //231.4
        tires_speed_4 = 29.6d; //240.8
        tires_speed_5 = 40.4d; //251.6

        tires_handling_1 = 0.002d; //1.207
        tires_handling_2 = 0.005d; //1.210
        tires_handling_3 = 0.009d; //1.214
        tires_handling_4 = 0.013d; //1.218
        tires_handling_5 = 0.018d; //1.223

        suspension_nitro_1 = 0.6d; //29.2
        suspension_nitro_2 = 1.4d; //30.0
        suspension_nitro_3 = 2.4d; //31.0
        suspension_nitro_4 = 3.5d; //32.1
        suspension_nitro_5 = 4.9d; //33.5

        suspension_handling_1 = 0.002d; //1.207
        suspension_handling_2 = 0.005d; //1.210
        suspension_handling_3 = 0.009d; //1.214
        suspension_handling_4 = 0.013d; //1.218
        suspension_handling_5 = 0.018d; //1.223

        drivetrain_speed_1 = 5.4d; //216.6
        drivetrain_speed_2 = 12.1d; //223.3
        drivetrain_speed_3 = 20.2d; //231.4
        drivetrain_speed_4 = 29.6d; //240.8
        drivetrain_speed_5 = 40.4d; //251.6

        drivetrain_accel_1 = -0.06d; //4.03
        drivetrain_accel_2 = -0.12d; //3.97
        drivetrain_accel_3 = -0.20d; //3.89
        drivetrain_accel_4 = -0.30d; //3.79
        drivetrain_accel_5 = -0.41d; //3.68

        exhaust_nitro_1 = 0.6d; //29.2
        exhaust_nitro_2 = 1.4d; //30.0
        exhaust_nitro_3 = 2.4d; //31.0
        exhaust_nitro_4 = 3.5d; //32.1
        exhaust_nitro_5 = 4.9d; //33.5

        exhaust_accel_1 = -0.06d; //4.03
        exhaust_accel_2 = -0.12d; //3.97
        exhaust_accel_3 = -0.20d; //3.89
        exhaust_accel_4 = -0.30d; //3.79
        exhaust_accel_5 = -0.41d; //3.68

        acceleration_1_rank = 9; //468
        acceleration_2_rank = 22; //481
        acceleration_3_rank = 40; //499
        acceleration_4_rank = 63; //522
        acceleration_5_rank = 89.5; //549

        top_speed_1_rank = 45; //504
        top_speed_2_rank = 112; //571
        top_speed_3_rank = 202; //661
        top_speed_4_rank = 314; //773
        top_speed_5_rank = 449; //908

        handling_1_rank = 9; //468
        handling_2_rank = 22; //481
        handling_3_rank = 40; //499
        handling_4_rank = 63; //522
        handling_5_rank = 90; //549

        nitro_1_rank = 27; //486
        nitro_2_rank = 67; //526
        nitro_3_rank = 121; //580
        nitro_4_rank = 189; //648
        nitro_5_rank = 269; //728

        tires_1_rank = 14; //473
        tires_2_rank = 30; //489
        tires_3_rank = 51; //510
        tires_4_rank = 74; //533
        tires_5_rank = 101.5d; //560

        suspension_1_rank = 9; //468
        suspension_2_rank = 20; //479
        suspension_3_rank = 34; //493
        suspension_4_rank = 50; //509
        suspension_5_rank = 67.5; //527

        drivetrain_1_rank = 14; //473
        drivetrain_2_rank = 30; //489
        drivetrain_3_rank = 51; //510
        drivetrain_4_rank = 74; //533
        drivetrain_5_rank = 101.5d; //560

        exhaust_1_rank = 9; //468
        exhaust_2_rank = 20; //479
        exhaust_3_rank = 34; //493
        exhaust_4_rank = 50; //509
        exhaust_5_rank = 67.5; //527

        try {
            accel_level = Integer.parseInt(accel_level_input.getText());
            speed_level = Integer.parseInt(speed_level_input.getText());
            handling_level = Integer.parseInt(handling_level_input.getText());
            nitro_level = Integer.parseInt(nitro_level_input.getText());
            tires_level = Integer.parseInt(tires_level_input.getText());
            suspension_level = Integer.parseInt(suspension_level_input.getText());
            drivetrain_level = Integer.parseInt(drivetrain_level_input.getText());
            exhaust_level = Integer.parseInt(exhaust_level_input.getText());

            switch (accel_level) {
                case 0:
                    accel_output = 0d;
                    accel_output_rank = 0;
                    break;
                case 1:
                    accel_output = acceleration_1;
                    accel_output_rank = acceleration_1_rank;
                    break;
                case 2:
                    accel_output = acceleration_2;
                    accel_output_rank = acceleration_2_rank;
                    break;
                case 3:
                    accel_output = acceleration_3;
                    accel_output_rank = acceleration_3_rank;
                    break;
                case 4:
                    accel_output = acceleration_4;
                    accel_output_rank = acceleration_4_rank;
                    break;
                case 5:
                    accel_output = acceleration_5;
                    accel_output_rank = acceleration_5_rank;
                    break;
                default:
                    accel_output = 0d;
                    accel_output_rank = 0;
                    break;
            }

            switch (speed_level) {
                case 0:
                    speed_output = 0d;
                    speed_output_rank = 0;
                    break;
                case 1:
                    speed_output = top_speed_1;
                    speed_output_rank = top_speed_1_rank;
                    break;
                case 2:
                    speed_output = top_speed_2;
                    speed_output_rank = top_speed_2_rank;
                    break;
                case 3:
                    speed_output = top_speed_3;
                    speed_output_rank = top_speed_3_rank;
                    break;
                case 4:
                    speed_output = top_speed_4;
                    speed_output_rank = top_speed_4_rank;
                    break;
                case 5:
                    speed_output = top_speed_5;
                    speed_output_rank = top_speed_5_rank;
                    break;
                default:
                    speed_output = 0d;
                    speed_output_rank = 0;
                    break;
            }

            switch (handling_level) {
                case 0:
                    handling_output = 0d;
                    handling_output_rank = 0;
                    break;
                case 1:
                    handling_output = handling_1;
                    handling_output_rank = handling_1_rank;
                    break;
                case 2:
                    handling_output = handling_2;
                    handling_output_rank = handling_2_rank;
                    break;
                case 3:
                    handling_output = handling_3;
                    handling_output_rank = handling_3_rank;
                    break;
                case 4:
                    handling_output = handling_4;
                    handling_output_rank = handling_4_rank;
                    break;
                case 5:
                    handling_output = handling_5;
                    handling_output_rank = handling_5_rank;
                    break;
                default:
                    handling_output = 0d;
                    handling_output_rank = 0;
                    break;
            }

            switch (nitro_level) {
                case 0:
                    nitro_output = 0d;
                    nitro_output_rank = 0;
                    break;
                case 1:
                    nitro_output = nitro_1;
                    nitro_output_rank = nitro_1_rank;
                    break;
                case 2:
                    nitro_output = nitro_2;
                    nitro_output_rank = nitro_2_rank;
                    break;
                case 3:
                    nitro_output = nitro_3;
                    nitro_output_rank = nitro_3_rank;
                    break;
                case 4:
                    nitro_output = nitro_4;
                    nitro_output_rank = nitro_4_rank;
                    break;
                case 5:
                    nitro_output = nitro_5;
                    nitro_output_rank = nitro_5_rank;
                    break;
                default:
                    nitro_output = 0d;
                    nitro_output_rank = 0;
                    break;
            }

            switch (tires_level) {
                case 0:
                    tires_output_speed = 0d;
                    tires_output_handling = 0d;
                    tires_output_rank = 0;
                    break;
                case 1:
                    tires_output_speed = tires_speed_1;
                    tires_output_handling = tires_handling_1;
                    tires_output_rank = tires_1_rank;
                    break;
                case 2:
                    tires_output_speed = tires_speed_2;
                    tires_output_handling = tires_handling_2;
                    tires_output_rank = tires_2_rank;
                    break;
                case 3:
                    tires_output_speed = tires_speed_3;
                    tires_output_handling = tires_handling_3;
                    tires_output_rank = tires_3_rank;
                    break;
                case 4:
                    tires_output_speed = tires_speed_4;
                    tires_output_handling = tires_handling_4;
                    tires_output_rank = tires_4_rank;
                    break;
                case 5:
                    tires_output_speed = tires_speed_5;
                    tires_output_handling = tires_handling_5;
                    tires_output_rank = tires_5_rank;
                    break;
                default:
                    tires_output_speed = 0d;
                    tires_output_handling = 0d;
                    tires_output_rank = 0;
                    break;
            }

            switch (suspension_level) {
                case 0:
                    suspension_output_nitro = 0d;
                    suspension_output_handling = 0d;
                    suspension_output_rank = 0;
                    break;
                case 1:
                    suspension_output_nitro = suspension_nitro_1;
                    suspension_output_handling = suspension_handling_1;
                    suspension_output_rank = suspension_1_rank;
                    break;
                case 2:
                    suspension_output_nitro = suspension_nitro_2;
                    suspension_output_handling = suspension_handling_2;
                    suspension_output_rank = suspension_2_rank;
                    break;
                case 3:
                    suspension_output_nitro = suspension_nitro_3;
                    suspension_output_handling = suspension_handling_3;
                    suspension_output_rank = suspension_3_rank;
                    break;
                case 4:
                    suspension_output_nitro = suspension_nitro_4;
                    suspension_output_handling = suspension_handling_4;
                    suspension_output_rank = suspension_4_rank;
                    break;
                case 5:
                    suspension_output_nitro = suspension_nitro_5;
                    suspension_output_handling = suspension_handling_5;
                    suspension_output_rank = suspension_5_rank;
                    break;
                default:
                    suspension_output_nitro = 0d;
                    suspension_output_handling = 0d;
                    suspension_output_rank = 0;
                    break;
            }

            switch (drivetrain_level) {
                case 0:
                    drivetrain_output_speed = 0d;
                    drivetrain_output_accel = 0d;
                    drivetrain_output_rank = 0;
                    break;
                case 1:
                    drivetrain_output_speed = drivetrain_speed_1;
                    drivetrain_output_accel = drivetrain_accel_1;
                    drivetrain_output_rank = drivetrain_1_rank;
                    break;
                case 2:
                    drivetrain_output_speed = drivetrain_speed_2;
                    drivetrain_output_accel = drivetrain_accel_2;
                    drivetrain_output_rank = drivetrain_2_rank;
                    break;
                case 3:
                    drivetrain_output_speed = drivetrain_speed_3;
                    drivetrain_output_accel = drivetrain_accel_3;
                    drivetrain_output_rank = drivetrain_3_rank;
                    break;
                case 4:
                    drivetrain_output_speed = drivetrain_speed_4;
                    drivetrain_output_accel = drivetrain_accel_4;
                    drivetrain_output_rank = drivetrain_4_rank;
                    break;
                case 5:
                    drivetrain_output_speed = drivetrain_speed_5;
                    drivetrain_output_accel = drivetrain_accel_5;
                    drivetrain_output_rank = drivetrain_5_rank;
                    break;
                default:
                    drivetrain_output_speed = 0d;
                    drivetrain_output_accel = 0d;
                    drivetrain_output_rank = 0;
                    break;
            }

            switch (exhaust_level) {
                case 0:
                    exhaust_output_nitro = 0d;
                    exhaust_output_accel = 0d;
                    exhaust_output_rank = 0;
                    break;
                case 1:
                    exhaust_output_nitro = exhaust_nitro_1;
                    exhaust_output_accel = exhaust_accel_1;
                    exhaust_output_rank = exhaust_1_rank;
                    break;
                case 2:
                    exhaust_output_nitro = exhaust_nitro_2;
                    exhaust_output_accel = exhaust_accel_2;
                    exhaust_output_rank = exhaust_2_rank;
                    break;
                case 3:
                    exhaust_output_nitro = exhaust_nitro_3;
                    exhaust_output_accel = exhaust_accel_3;
                    exhaust_output_rank = exhaust_3_rank;
                    break;
                case 4:
                    exhaust_output_nitro = exhaust_nitro_4;
                    exhaust_output_accel = exhaust_accel_4;
                    exhaust_output_rank = exhaust_4_rank;
                    break;
                case 5:
                    exhaust_output_nitro = exhaust_nitro_5;
                    exhaust_output_accel = exhaust_accel_5;
                    exhaust_output_rank = exhaust_5_rank;
                    break;
                default:
                    exhaust_output_nitro = 0d;
                    exhaust_output_accel = 0d;
                    exhaust_output_rank = 0;
                    break;
            }

            total_accel = acceleration_stock + accel_output + drivetrain_output_accel + exhaust_output_accel;
            String total_accel_rounded = String.format("%.2f", total_accel);
            total_speed = top_speed_stock + speed_output + tires_output_speed + drivetrain_output_speed;
            String total_speed_rounded = String.format("%.1f", total_speed);
            total_handling = handling_stock + handling_output + tires_output_handling + suspension_output_handling;
            String total_handling_rounded = String.format("%.3f", total_handling);
            total_nitro = nitro_stock + nitro_output + suspension_output_nitro + exhaust_output_nitro;
            String total_nitro_rounded = String.format("%.1f", total_nitro);
            total_rank = rank_stock + accel_output_rank + speed_output_rank + handling_output_rank + nitro_output_rank + tires_output_rank + suspension_output_rank + drivetrain_output_rank + exhaust_output_rank;
            int total_rank_rounded = (int) total_rank;
            double max_speed;
            max_speed = total_speed + total_nitro;
            String max_speed_rounded = String.format("%.1f", max_speed);
            double speed_rank;
            speed_rank = max_speed / total_rank;

            resultLabel.setText(
                    "Acceleration: " + total_accel_rounded + "\n" +
                            "Top Speed: " + total_speed_rounded + "\n" +
                            "Handling: " + total_handling_rounded + "\n" +
                            "Nitro: " + total_nitro_rounded + "\n" +
                            "Total Speed: " + max_speed_rounded + "\n" +
                            "Rank: " + total_rank_rounded + "\n" +
                            "Speed / Rank: " + speed_rank + "\n"
            );
        } catch (NumberFormatException e) {
            resultLabel.setText("Please enter valid numbers for all fields!");
        }
    }

    @FXML
    private void reset() {
        accel_level_input.setText("");
        speed_level_input.setText("");
        handling_level_input.setText("");
        nitro_level_input.setText("");
        tires_level_input.setText("");
        suspension_level_input.setText("");
        drivetrain_level_input.setText("");
        exhaust_level_input.setText("");
    }

    @FXML
    private void exit() {
        Platform.exit();
    }
}
