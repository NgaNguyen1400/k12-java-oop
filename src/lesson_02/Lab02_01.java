package lesson_02;

import java.util.Scanner;

public class Lab02_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your weight (kg): ");
        double YourWeight = scanner.nextFloat();
        System.out.print("Please input your height (m): ");
        double YourHeight = scanner.nextFloat();
        double BMI = YourWeight / (YourHeight * 2);

        System.out.printf("Your BMI is: %.2f %n", BMI);

    }
}
