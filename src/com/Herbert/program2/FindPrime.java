package com.Herbert.program2;

public class FindPrime {
    public boolean findprime(int num) {
        boolean isPrime;

        if (num<2) isPrime = false;
        else isPrime = true;

        for (int i=2; i <= num/i; i++){
            if ((num%i)==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
