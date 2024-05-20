package IFELSESTATEMENT;

import java.util.Scanner;

public class sqareornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the length");
        int length=sc.nextInt();

        System.out.println("enter the breadth");
        int breadth=sc.nextInt();
        
        if(length==breadth){
            int sqare=length*breadth;
            System.out.println("the  sqare is:"+sqare);

        }
        else{
            System.out.println("it is not sqare");
        }
    



        
    }
}
