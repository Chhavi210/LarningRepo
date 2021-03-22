package BitManupulation.MathMatics;

public class ModuloAirthmatic {
    public static void main(String[] args){
        System.out.println(fastPower(12,2,1000));
    }
    static long fastPower(long a,long b,int n){
        long result=0;
        while(b>0){
            if((b&1)!=0){
                result = (result* a%n)%n;
            }
            result=(a%n*a%n)%n;
            b=b>>1;
        }
        return result;
    }
}
