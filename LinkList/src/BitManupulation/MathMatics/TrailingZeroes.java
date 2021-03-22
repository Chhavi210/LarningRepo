package BitManupulation.MathMatics;

public class TrailingZeroes {
    public static void main(String[] args){
        System.out.println(TrailingZ(10));

    }
    static int TrailingZ(int n){
        int result=0;
        for(int i=5;i<=n;i=i*5){
            result=result+(n/i);
        }
        return result;
    }
}
