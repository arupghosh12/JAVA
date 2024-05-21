package array;

import java.util.Scanner;

public class countOccurance {
    static void countOccurance(int []arr,int x)
    {
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==x)
            {
                count ++;
            }
            return ;
        }
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ARRAY SIZE");
        int n=sc.nextInt();
        int [] arr=new int[n];

        System.out.println("enter the element");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println("enter the element are");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("the pariticular elements are");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println();
        }


    }
    
}
