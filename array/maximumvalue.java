package array;
class arrayExample1{
    void  maximum(){
        int arr[]={4,3,5,2,1,6};
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("max is:"+max);
    }
}

public class maximumvalue {
    public static void main(String[] args) {
        arrayExample1 sc=new arrayExample1();
        sc.maximum();
        
    }
}
