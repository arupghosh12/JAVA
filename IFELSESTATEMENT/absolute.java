package IFELSESTATEMENT;

import java.net.SocketPermission;
import java.util.Scanner;

public class absolute {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  number");
        int num=sc.nextInt();
        if(num<0)
        {
            num=num*(-1);
            System.out.println("absoute value is:"+num);
        }
        else{
            System.out.println("absoute value is :"+num);
        }
       
    }
    
}
