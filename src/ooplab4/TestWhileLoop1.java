package ooplab4;

import java.util.Scanner;

public class TestWhileLoop {
    public static void main(String[] args) {
        //Whle
        //int n = 1;
        // while (n<=10){
        //System.out.println(n+" ");
        //n++;

        //   }//While

        //Correct Passrord
        int pin = 1234;
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        while (input != pin){
            System.out.print("Enter your password: ");
            input = scanner.nextInt();
        }
        System.out.println("Your password is correct.");




    }//main




}//class
