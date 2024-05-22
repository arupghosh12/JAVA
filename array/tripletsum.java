package array;

import java.util.Scanner;

public class tripletsum {
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
        System.out.print("enter the target sum");
        int target=sc.nextInt();
        System.out.println(tripletsum(arr,target));
    }

    public static int tripletsum(int[] arr, int target) {
        int ans=0;
        for(int i=0;i<arr.length;i++)//first number
        {
            for(int j=i+1;j<arr.length;j++)//second number
            {
                for(int k=j+1;k<arr.length;k++)//third number
                {
                    if(arr[i]+arr[j]+arr[k]==target)
                    {
                        ans++;
                    }
                }

            }
        }
        return ans;
        
    }

    
}
