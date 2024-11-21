//R8 e-tron Special Edition
//Will need to add rank differences per upgrade later
import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    
    Scanner object = new Scanner(System.in);
    
    double acceleration_stock, top_speed_stock, handling_stock, nitro_stock, rank_stock;
    acceleration_stock = 4.09d;
    top_speed_stock = 211.2d;
    handling_stock = 1.205d;
    nitro_stock = 28.6d;
    rank_stock = 459d;
    
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

    int acceleration_1_rank, acceleration_2_rank, acceleration_3_rank, acceleration_4_rank, acceleration_5_rank;
    int top_speed_1_rank, top_speed_2_rank, top_speed_3_rank, top_speed_4_rank, top_speed_5_rank;
    int handling_1_rank, handling_2_rank, handling_3_rank, handling_4_rank, handling_5_rank;
    int nitro_1_rank, nitro_2_rank, nitro_3_rank, nitro_4_rank, nitro_5_rank;
    int tires_speed_1_rank, tires_speed_2_rank, tires_speed_3_rank, tires_speed_4_rank, tires_speed_5_rank;
    int tires_handling_1_rank, tires_handling_2_rank, tires_handling_3_rank, tires_handling_4_rank, tires_handling_5_rank;
    int suspension_nitro_1_rank, suspension_nitro_2_rank, suspension_nitro_3_rank, suspension_nitro_4_rank, suspension_nitro_5_rank;
    int suspension_handling_1_rank, suspension_handling_2_rank, suspension_handling_3_rank, suspension_handling_4_rank, suspension_handling_5_rank;
    int drivetrain_speed_1_rank, drivetrain_speed_2_rank, drivetrain_speed_3_rank, drivetrain_speed_4_rank, drivetrain_speed_5_rank;
    int drivetrain_accel_1_rank, drivetrain_accel_2_rank, drivetrain_accel_3_rank, drivetrain_accel_4_rank, drivetrain_accel_5_rank;
    int exhaust_nitro_1_rank, exhaust_nitro_2_rank, exhaust_nitro_3_rank, exhaust_nitro_4_rank, exhaust_nitro_5_rank;
    int exhaust_accel_1_rank, exhaust_accel_2_rank, exhaust_accel_3_rank, exhaust_accel_4_rank, exhaust_accel_5_rank;

    acceleration_1 = -0.17d; //3.92
    acceleration_2 = -0.39d; //3.70
    acceleration_3 = -0.67d; //3.42
    acceleration_4 = -1.01d; //3.08
    acceleration_5 = -1.32d; //2.77
    
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
    suspension_nitro_5 = 4.8d; //33.4

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
    exhaust_nitro_5 = 4.8d; //33.4

    exhaust_accel_1 = -0.06d; //4.03
    exhaust_accel_2 = -0.12d; //3.97
    exhaust_accel_3 = -0.20d; //3.89
    exhaust_accel_4 = -0.30d; //3.79
    exhaust_accel_5 = -0.41d; //3.68

    acceleration_1_rank = 9; //468
    acceleration_2_rank = 22; //481
    acceleration_3_rank = 40; //499
    acceleration_4_rank = 63; //522
    acceleration_5_rank = 90; //549

    top_speed_1_rank = 45; //504
    top_speed_2_rank = 112; //571
    top_speed_3_rank = 202; //661
    top_speed_4_rank = 314; //773
    top_speed_5_rank = 449; //908
