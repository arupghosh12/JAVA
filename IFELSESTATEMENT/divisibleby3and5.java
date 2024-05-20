package IFELSESTATEMENT;

import java.util.Scanner;

public class divisibleby3and5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        if(n%3==0||n%5==0)
        {
            System.out.println("the number is divisible");
        }
        else{
            System.out.println("the number is not divisible");
        }

    }
    
}
