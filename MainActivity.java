//R8 e-tron Special Edition
//Will need to add rank differences per upgrade later
import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    
    Scanner object = new Scanner(System.in);
    
    double acceleration_stock, top_speed_stock, handling_stock, nitro_stock, rank_stock;
    acceleration_stock = 4.09;
    top_speed_stock = 211.2;
    handling_stock = 1.205;
    nitro_stock = 28.6;
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

    acceleration_1 = -0.17;
    acceleration_2 = -0.22;
    acceleration_3 = -0.28;
    acceleration_4 = -0.34;
    acceleration_5 = -0.31;
    top_speed_1 = 16.8; //228.0
    top_speed_2 = 22.2; //250.2
    top_speed_3 = 27.9; //278.1
    top_speed_4 = 33.4; //311.5
    top_speed_5 = 30.6; //342.1
