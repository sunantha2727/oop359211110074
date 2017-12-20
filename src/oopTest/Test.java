import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Test {
    private static final int MAX = 20;
    private static int number[] = new int[MAX];
    public static void main(String[] args) {
        inputData(number,number.length);

        showData(number, number.length);

        System.out.println("Before sorting: ");
        //ascending order
        sortingDataAscending(number);

        //descending order
        sortingDataDesending(number);

    }//main

    private static void sortingDataDesending(int[] number) {
        System.out.println("Desending Order: ");
        Integer[] num = new Integer[number.length];
        int i = 0;
        for(int val:number){
            num[i++] = val;
        }

        Arrays.sort(num, Collections.reverseOrder());
        showData(num,num.length);
    }//sortingDataDesending

    private static void sortingDataAscending(int[] number) {
        System.out.println("Ascending Order: ");
        Arrays.sort(number);
        showData(number,number.length);
    }//sortingData



    private static void showData(int[] number, int length) {
        System.out.print("Data in array: ");
        for(int i=0;i<length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();

    }//showData
    private static void showData(Integer[] number, int length) {
        System.out.print("Data in array: ");
        for(int i=0;i<length;i++){
            System.out.print(number[i]+" ");
        }

        System.out.println();
    }//showData

    private static void inputData(int[] number, int length) {
        //user input data
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<length;i++)
        {
            System.out.print("Enter an integer["+i+"]: ");
            number[i] = scanner.nextInt();
        }


    }//inputData

}//class