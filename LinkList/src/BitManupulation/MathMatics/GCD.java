package BitManupulation.MathMatics;

public class GCD {
    public static void main(String[] args){
        System.out.println(Gcd(0,12));

    }
    static int Gcd(int a,int b){
        if(b==0) return a;
        return Gcd(b,a%b);

    }
}
