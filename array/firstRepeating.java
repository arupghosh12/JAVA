package array;

import java.util.Scanner;

public class firstRepeating {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE ARRAY SIZE");
         int n=sc.nextInt();
         System.out.println("enter the array element");
         int arr[]= new int[n];
        // System.out.println("the array elements are");
         for(int i=0;i<n;i++)
         {
            arr[i]=sc.nextInt();
            
         }
         System.out.println(firstRepeating(arr));

    }

    public static int firstRepeating(int[] arr) {
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    return arr[i];
                }
            }

            
        }
        return -1;
    
    }
    
}
