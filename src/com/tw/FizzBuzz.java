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
        if(n < 1){
            throw new IllegalArgumentException("n must be greater than 1");
        }
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

        try{
            System.out.println("Testing boundary condition");
            System.out.println("Test case 1");
            FizzBuzz.printFizzBuzz(-2);
            System.out.println("[FAIL] Test case 1");
        }catch(IllegalArgumentException e){
            System.out.println("[SUCCESS] Test case 1");
        }
        try{
            System.out.println("Test case 2");
            FizzBuzz.printFizzBuzz(0);
            System.out.println("[FAIL] Test case 2");
        }catch(IllegalArgumentException e){
            System.out.println("[SUCCESS] Test case 2");
        }

    }
}
