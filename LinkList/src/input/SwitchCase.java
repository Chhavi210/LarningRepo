package input;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args){
        int a=2;
        int c=3;
        int f;
        Scanner sc=new Scanner(System.in);
        char d=sc.nextLine().charAt(0);
        switch(d){
            case '+':
                f=a+c;
                break;
            default:
                f=a*c;

        }
        System.out.println(f);

    }
}
