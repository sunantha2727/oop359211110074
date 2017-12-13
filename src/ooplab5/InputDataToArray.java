package ooplab5;

// 1.user input data to array
        // 2. show data in array
        // 3. summation data in array
        // 4. average value in array

import java.util.Scanner;

public class InputDataToArray {
    private static final int MAX = 5;
    private static int number[] = new int[MAX];

    public static void main(String[] args) {

        inputData(number, number.length);
        showData(number,number.length);
    }//main

private  static void showData(int[] number,int length){
        int total = 0;
        System.out.print("Data in array : ");
        for (int i=0;i<length;i++){
            System.out.print(number[i]+" ");

            total += number[i];
            System.out.println("Total is"+total);
            System.out.println("Total = "+total);
            System.out.println("The avareage data in array: "+(total/length));
        }
}
    private static void inputData(int[] number, int length) {
        //user input data
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {

            System.out.print("Enetr an integer[" + i + "] : ");
            number[i] = scanner.nextInt();
        }//for
    }//InputData
}//class