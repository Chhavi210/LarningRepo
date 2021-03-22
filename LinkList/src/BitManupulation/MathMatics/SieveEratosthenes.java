package BitManupulation.MathMatics;

import java.util.Arrays;

public class SieveEratosthenes {
    public static void main(String[] args){
        boolean[] answer=sieveOfEratosthenes(12);
        for(int i=0;i<=12;i++){
            System.out.print(i+" "+answer[i]+" ");
        }


    }
    static boolean[] sieveOfEratosthenes(int n){
        boolean[] isPrime=new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=isPrime[1]=false;
        for(int i=2;i*i<n;i++){
            for(int j=i*2;j<=n;j=j+i){
                isPrime[j]=false;
            }
        }
        return isPrime;
    }
}
