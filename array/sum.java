package array;
class arrayExample{
    void sum(){
        int arr[]={1,2,5,6};
        int sum=0;
        for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
        }
        System.out.println(sum);

        
    }

}

public class sum {
    public static void main(String[] args) {
        arrayExample sc=new arrayExample();
        sc.sum();

    }
    
}
