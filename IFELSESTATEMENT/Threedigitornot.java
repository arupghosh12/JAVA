package IFELSESTATEMENT;

import java.util.Scanner;

public class Threedigitornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the digit");
        int digit=sc.nextInt();
        if(digit>99 && digit<1000)
        {
            System.out.println("it is three digit number");
        }
        else{
            System.out.println("it is not three digit number");
        }
    }
}
