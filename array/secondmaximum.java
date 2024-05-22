package array;

import java.util.Scanner;

public class secondmaximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        /*  System.out.println("the array elements are:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }*/
        System.out.println("second maximum number is:");
        System.out.println(secondmaximum(arr));
        
    }

    public static int secondmaximum(int[] arr) {
        int temp;
       for(int i=0;i<arr.length;i++)
       {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]<arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

       }
       return arr[1];
    }
    
}
