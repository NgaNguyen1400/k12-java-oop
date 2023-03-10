package lesson_02;

import java.util.Scanner;

public class Lab02_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height (m)");
        double height = input.nextDouble();
        System.out.println("Please enter your weight (kg)");
        double weight = input.nextDouble();
        double BMI = weight / (height * 2);

        String BMI_label = "Obesity";
        String BMI_advice = "reduce";
        System.out.printf("Your BMI is: %.2f %n", BMI);
        if (BMI < 18.5) {
            BMI_label = "Underweight";
            BMI_advice = "gain";
        } else if (BMI < 25) {
            BMI_label = "Normal weight";
            BMI_advice = "keep";
        } else if (BMI < 30.0) {
            BMI_label = "Overweight";
        }
        System.out.println("You are " + BMI_label);
        System.out.println("Please " + BMI_advice + " your weight");


    }
}