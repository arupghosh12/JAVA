package array;

import java.util.Scanner;

public class reverseanArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE ARARY SIZE");
       int n= sc.nextInt();
       System.out.println("ENTER THE ARRAY ELEMENTS");
       int [ ] arr= new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
       reverse(arr);

    
    }
    static void reverse(int [] arr)
    {
        for(int i=arr.length-1;i>0;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
