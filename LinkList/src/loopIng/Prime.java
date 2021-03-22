package loopIng;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        int c=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                c=1;
                System.out.println("given number is not prime");
                break;

            }
        }
        if(n<2){
            System.out.println("number is not prime");
        }
       else if(c==0){
            System.out.println("given  number is prime");
        }

    }
}
