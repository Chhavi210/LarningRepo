package BitManupulation;

public class Swap {
    public static void main(String[] args){
        int a,b;
        a=5;
        b=8;
        System.out.println("before swapping a="+a+" b="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after swapping a="+a+" b="+b);

    }
}
