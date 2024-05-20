package array;
class arrayExample2{
    void minimum(){
        int arr[]={1,3,6,9,0,7,8};
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min){
                min=arr[i];

            }
        }
        System.out.println("minmum value is:"+min);

        
    }

}

public class minimumvalue {
    public static void main(String[] args) {
        arrayExample2 sc= new arrayExample2();
        sc.minimum();

    }
}
