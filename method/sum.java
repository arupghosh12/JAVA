import java.util.Scanner;

class algebra{
    int add(int a,int b)
    {
        int sum=a+b;
        return sum;

    }
}
public class sum {
    public static void main(String[] args) {
        algebra obj=new algebra();
        
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter a two number ");
       int x= sc1.nextInt();
       int y= sc1.nextInt();
       
       int sumoftwonumber= obj.add(x,y);
       System.out.println(sumoftwonumber);

    }
}
