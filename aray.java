package Arays;

import java.util.Scanner;

public class aray {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[]  myIntegers = integervalues(5);
        for(int i =0; i<myIntegers.length;i++) {
            System.out.println("Element " + i + ",typed value was " + myIntegers[i]);


        }
        System.out.println(" avarage is "+getavarage(myIntegers));

    }
    public static int[] integervalues(int number){
        System.out.println("Enter "+number+" value is \r");
         int[] values = new  int[number];
         for(int i = 0 ; i< values.length;i++){
             values[i]=scanner.nextInt();
         }
         return values;

    }
    public static double getavarage(int[] aray){
        int sum = 0;
        for (int i = 0; i<aray.length;i++){
            sum +=aray[i];
        }
        return (double) sum/(double) (aray.length);
    }
}
