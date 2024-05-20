package IFELSESTATEMENT;

import java.util.Scanner;

public class divisibleornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
       int num= sc.nextInt();
       if(num%5==0)
       {
        System.out.println("yes, it is divisible by 5");
       }
       else {
        System.out.println("it is not divisible 5");
       }
    }
    
}
