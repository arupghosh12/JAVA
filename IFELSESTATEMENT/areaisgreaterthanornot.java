package IFELSESTATEMENT;

import java.util.Scanner;

public class areaisgreaterthanornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the length");
        int length=sc.nextInt();

        System.out.println("enter the breadth");
        int breadth=sc.nextInt();
        int  area=length*breadth;
        int parimeter=2*(length+breadth);
        if(area>parimeter){
            System.out.println("area is greater than parimeter");
        }
        else{
            System.out.println("parimeter is greater than area");
        }
    }
    
}
