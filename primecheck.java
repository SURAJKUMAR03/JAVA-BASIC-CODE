package BASIC;

import java.util.Scanner;

public class primecheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number for check whether the number is prime or not:");
        int number=sc.nextInt();
        boolean tru=isPrime(number);
        if(tru)
            System.out.println("this number is prime number:");
        else
            System.out.println("its is not prime number ");
        
    }
    
    public static boolean isPrime(int num){
        if(num==0||num==1){
            return false;
        }
        if (num==2) {
            return true;
        } 
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;
    }

    
}

