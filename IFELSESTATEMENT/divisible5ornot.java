package IFELSESTATEMENT;
 //Check if given number is divisible by 5 but not 3

import java.util.Scanner;

public class divisible5ornot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        if(num%5==0||num%3==0)
        {
            System.out.println("it is divisible 5");
        }
        else{
            System.out.println("it is not divisible 5");
        }
    }
    
}
