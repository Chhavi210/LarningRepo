package Recursion;

public class SumOfNnNautralNumber {
    public static void main(String[] args){
        System.out.println(SumNNatural(2));

    }
    public static int SumNNatural(int n){
        if(n==1)return 1;
        else return SumNNatural(n-1)+n;

    }
}
