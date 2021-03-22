package loopIng;

public class FibbonacciNumber {
    public static void main(String[] args){
        int n=9;
        int a=0;
        int b=1;
         System.out.println(a+"  "+b+" ");
         for(int i=0;i<=n-2;i++){
             int c=a+b;
             System.out.print(c+" ");
             a=b;
             b=c;
         }
    }
}
