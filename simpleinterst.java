import java.util.Scanner;

public class simpleinterst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter principal");
        float p=sc.nextFloat();

        System.out.println("enter the rate");
        float r =sc.nextFloat();

        System.out.println("enter the time");
        float t=sc.nextFloat();

        float si=(p*r*t)/100;

        System.out.println("principal is:"+p);
        System.out.println("rate is:"+r);
        System.out.println("time is:"+t);
        System.out.println("simple interest is:"+si);





    }
    
}
