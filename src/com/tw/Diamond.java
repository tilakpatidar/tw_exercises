package com.tw;

/**
 * Prints different types of Diamonds
 * Created by tilak on 2/12/16.
 */
final public class Diamond {
    /**
     * Repeats a char n times
     * @param c
     * @param n
     * @return
     */
    private static String nString(Character c, int n){
        String k = "";
        for(int i = 0; i < n; i++){
            k += c;
        }

        return k;
    }

    /**
     * Creates a triangle of height n
     * @param n
     * @return
     */
    private static String[] createTriangle(int n){
        String[] output = new String[n];
        int spaces = ((2 * n) - 2);
        int asterisk = 1;
        for(int i = 0 ; i < n ; i++){
            String line = Diamond.nString(' ', spaces/2 ) + Diamond.nString('*', asterisk) + Diamond.nString(' ', spaces/2);
            output[i] = line;
            asterisk += 2;
            spaces -= 2;
        }
        return output;
    }
    /**
     * Prints an isosceles triangle with h height
     * @param n -  Height of the triangle
     */
    public static void printIsoscelesTriangle(int n){
        String[] arr = Diamond.createTriangle(n);
        for(String line : arr){
            System.out.println(line);
        }
    }

    /**
     * Prints a diamond of height 2n
      * @param n
     */
    public static void printDiamond(int n){
        String[] upper = Diamond.createTriangle(n);
        for(String line : upper){
            System.out.println(line);
        }
        for(int i = upper.length - 2; i >= 0 ; i--){
            System.out.println(upper[i]);
        }

    }

    /**
     * Prints diamond with name in center
     * @param n
     * @param name
     */
    public static void printDiamondWithName(int n, String name){

        String[] upper = Diamond.createTriangle(n);
        for(int k = 0; k < upper.length - 1; k++){
            System.out.println(upper[k]);
        }

        if(upper[upper.length - 1].length() > name.length()){
            int diff = upper[upper.length-1].length() - name.length();
            name = Diamond.nString(' ', diff/2) + name + Diamond.nString(' ', n/2);
        }

        System.out.println(name);

        for(int i = upper.length - 2; i >= 0 ; i--){
            System.out.println(upper[i]);
        }
    }

    public static void main(String[] args){

        System.out.println("Testing Diamond class");
        System.out.println("Printing Isosceles Triangle");
        Diamond.printIsoscelesTriangle(5);
        System.out.println("Printing Diamond Triangle");
        Diamond.printDiamond(3);
        System.out.println("Printing Diamond with name");
        Diamond.printDiamondWithName(5, "Tilak");

    }


}
