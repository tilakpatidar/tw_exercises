package com.tw;

import java.util.ArrayList;

/**
 * Prints prime factors
 * Created by tilak on 2/12/16.
 */
final public class PrimeFactors {

    public static ArrayList<Integer> getPrimeFactors(int n){
        if(n < 1){
            throw new IllegalArgumentException("n must be greater or equal to 1");
        }
        ArrayList<Integer> li = new ArrayList<>();

        boolean first = true;
        while (n%2==0)
        {
            if(first){
                li.add(2);
                first = false;
            }
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            // While i divides n, print i and divide n
            while (n%i == 0)
            {
                li.add(i);
                n /= i;
            }
        }

        if (n > 2)
            li.add(n);
        return li;
    }
    public static void main(String[] args){
        System.out.println("Testing Prime factors");
        System.out.println(PrimeFactors.getPrimeFactors(30).toString());

        try{
            System.out.println("Test case 1");
            System.out.println(PrimeFactors.getPrimeFactors(0).toString());
            System.out.println("[FAIL] Test case 1");

        }catch(IllegalArgumentException e){
            System.out.println("[SUCCESS] Test case 1");
        }
    }
}
