package com.tw;

/**
 * FizzBuzz printing exercise
 * Created by tilak on 2/12/16.
 */
public class FizzBuzz {

    /**
     * Prints fizz buzz till n
     * @param n
     */
    public static void printFizzBuzz(int n){
        int i = 1;
        for( ; i <= n ; i++){
            if(i%3 == 0){
                System.out.print("Fizz");
            }
            if(i%5 == 0){
                System.out.print("Buzz");
            }

            if(i%3 !=0 && i%5 != 0){
                System.out.print(i);
            }

            System.out.println();
        }
    }
    public static void main(String[] args){
        System.out.println("Testing FizzBuzz class");
        FizzBuzz.printFizzBuzz(100);

    }
}
