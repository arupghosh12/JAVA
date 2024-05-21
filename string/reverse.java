package string;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        String rev=" ";
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            rev+=c;
        }
        System.out.println(rev+"");
        
    }
    
}
