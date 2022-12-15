package lesson_02;
/*
   Check is the number is even or old number
 */
import java.util.Scanner;

public class Lab02_02 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please input number:");
        int number= scanner.nextInt();
        if (number%2==0){
            System.out.println(" Is even number");
        }else{
            System.out.println("Is old number");
        }

    }
}
