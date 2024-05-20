package array;
class arrayExample3{
     void searchArray(){
        int arr[]={4,3,5,2,1,6};
        int ans=-1;
        int x=2;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x){
                ans=i;
            }

        }
        System.out.println("found "+x+"at index "+ans);
     }

}

public class searchIndexArray {
    public static void main(String[] args) {
        arrayExample3 sc= new arrayExample3();
        sc.searchArray();

    }
    
}
