![Logo](https://raw.githubusercontent.com/468SiliconWP445/R8-SE-Tuning/refs/heads/main/logo.png)
![Example Usage](https://raw.githubusercontent.com/468SiliconWP445/R8-SE-Tuning/refs/heads/main/screenshot_gui_main.png)

# **R8 SE Tuning Calculator** 

In a nutshell:

A Java project designed to calculate the performance metrics of an R8 SE Tune. The program takes the upgrade levels of each component (acceleration, top speed, etc.) and outputs the acceleration, top speed, handling, nitro and rank of what the R8 SE would have been in pre-v4.1 Asphalt 8.

---

## **Features**
-  **Upgrade Selection**: Choose upgrade levels (0-5) for car components such as acceleration, speed, handling, nitro, tires, suspension, drivetrain, and exhaust.
-  **Performance Calculation**: Calculates final metrics for:
  - **Acceleration**
  - **Speed**
  - **Handling**
  - **Nitro**
  - **Overall Rank**

---

## **How It Works**
1. **User Input**: The user selects upgrade levels for various upgrades (e.g. Top Speed) through a command-line interface, or, a graphical user interface.
2. ***NOTE***: if the user enters a value that is a valid number, but not between 0 and 5, the program assumes the value is 0.
3. **Performance Metrics Calculation**: 
   - The effect that each upgrade has on the relevant statistics (e.g. Tires upgrades speed and handling).
4. **Output**: The stats for the tune are displayed to the user.

---

### **Requirements**
- Java 8 or higher (or equivalent), and JavaFX for the GUI version.

## **Disclaimer**
- All trademarked names and brands mentioned in this project are the property of their respective owners. They are used solely for identification and reference purposes. The use of these names does not imply any affiliation with or endorsement by the trademark holders.
