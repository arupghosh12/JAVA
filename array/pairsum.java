package array;

import java.util.Scanner;

public class pairsum {
    public static int pairsum(int []arr, int target)
    {
        int ans=0;
        for(int i=0;i<arr.length;i++)//first number
        {
            for(int j=i+1;j<arr.length;j++) //second number
            {
                if(arr[i]+arr[j]==target){
                    ans++;
                }
               
             }
            }
            return ans;
        }

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
        System.out.println(pairsum(arr,target));
    }
    
}
