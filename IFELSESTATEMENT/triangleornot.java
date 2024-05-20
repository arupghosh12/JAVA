package IFELSESTATEMENT;

import java.util.Scanner;

public class triangleornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a three number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b>c&&a+c>b&&b+c>a)
        {
            System.out.println("it is a triangle");
        }
        else{
            System.out.println("it is not a triangle");
        }

        

    }
}
