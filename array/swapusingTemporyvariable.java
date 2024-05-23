package array;

import java.util.Scanner;

public class swapusingTemporyvariable {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the two numbers before swapping");
        int a=sc.nextInt();
        int b=sc.nextInt();
        swapping(a,b);
    }
    public  static  void swapping(int a,int b){
   
        int temp;
        temp=a;
        a=b;
        b=temp;
         System.out.println("enter the two numbers after swapping");


         System.out.println(a);
    System.out.println(b);

    }
    
    
}
