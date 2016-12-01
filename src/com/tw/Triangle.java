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
       for(int i = 0; i < n; i++)
           System.out.print("*");
       System.out.println(); //print end of line
   }


    /**
     * Prints n number of asterisk on new line
     * @param n
     */
   public static void printlnNAsterisk(int n){
       for(int i = 0; i < n; i++)
           System.out.println("*");
   }


    /**
     * Prints a right triangle with base of n asterisk
     * @param n
     */
    public static void printRightTrianlge(int n){
        String s = "*";
        for(int i = 0; i < n ; i++){
            System.out.println(s);
            s += "*";
        }
    }


    public static void main(){
        //some testing code
        System.out.println("Testing Triangle");
        Triangle.printOneAsterik();
        Triangle.printNAsterisk(3);
        Triangle.printlnNAsterisk(3);
        Triangle.printRightTrianlge(3);

    }
}
