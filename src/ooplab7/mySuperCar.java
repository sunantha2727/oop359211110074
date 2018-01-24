package ooplab7;

import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {

        SuperCar s3 = new SuperCar();
        s3 = inputData(s3);
        System.out.println (s3.toString());
    }//main

    private static SuperCar inputData(SuperCar s) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a SuperCar  info: ");
        System.out.print("car brand : ");
        s.setBrand(scanner.nextLine());
        System.out.print("car color: ");
        s.setColor(scanner.nextLine());
        System.out.print("car engine size: ");
        s.setSize(scanner.nextLine());
        System.out.print("max speed: ");
        s.setMax(scanner.nextLine());
        System.out.print("country of origin : ");
        s.setOrigin(scanner.nextLine());
        return s;
    }//inputdata
}//class

