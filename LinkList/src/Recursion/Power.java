package Recursion;

public class Power {
    public static void main(String[] args){
        System.out.println(Pow(2,7));
        System.out.println(FastPow(2,7));
    }
    static  int Pow(int a,int b){
        if(b==0){
            return 1;
        }
        else
            return Pow(a,b-1)*a;
    }
    static int FastPow(int a,int b){
        if(b==0) return 1;
        if(b%2==0){
            return  FastPow(a*a,b/2);
        }
        else
            return a*FastPow(a,b-1);
    }

}
