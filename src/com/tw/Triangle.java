package com.tw;

/**
 * Class contains static methods for implementing Triangle assignment
 */
final public class Triangle {

    /**
     * Prints just one asterisk
     */
   public static void printOneAsterik(){
       Triangle.printNAsterisk(1);
   }

    /**
     * Prints n number of asterisk in one line
     * @param n
     */
   public static void printNAsterisk(int n){
       if(n <= 0){
           throw new IllegalArgumentException("N must be greater than 0");
       }
       for(int i = 0; i < n; i++)
           System.out.print("*");
       System.out.println(); //print end of line
   }


    /**
     * Prints n number of asterisk on new line
     * @param n
     */
   public static void printlnNAsterisk(int n){
       if(n <= 0){
           throw new IllegalArgumentException("N must be greater than 0");
       }


       for(int i = 0; i < n; i++)
           System.out.println("*");
   }


    /**
     * Prints a right triangle with base of n asterisk
     * @param n
     */
    public static void printRightTriangle(int n){

       if(n <= 0){
           throw new IllegalArgumentException("N must be greater than 0");
       }


        String s = "*";
        for(int i = 0; i < n ; i++){
            System.out.println(s);
            s += "*";
        }
    }


    public static void main(String[] args){
        //some testing code
        System.out.println("Testing Triangle");
        Triangle.printOneAsterik();
        Triangle.printNAsterisk(3);
        Triangle.printlnNAsterisk(3);
        Triangle.printRightTriangle(3);

        try{
            Triangle.printNAsterisk(-2);
            System.out.println("Test 1 failed");
        }catch (IllegalArgumentException e){
            System.out.println("Test 1 passed");
        }

        try{
            Triangle.printlnNAsterisk(-6);
            System.out.println("Test 2 failed");
        }catch (IllegalArgumentException e){
            System.out.println("Test 2 passed");
         }
        try{
            Triangle.printRightTriangle(-8);
            System.out.println("Test 3 failed");
        }catch (IllegalArgumentException e){
            System.out.println("Test 3 passed");
        }


    }
}
