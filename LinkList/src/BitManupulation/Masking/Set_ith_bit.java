package BitManupulation.Masking;

public class Set_ith_bit {
    public static void main(String[] args){
        int n=12;
        int setBit=1;
        int mask=1;
        mask=mask<<setBit;
        int j=n|mask;
        System.out.println("aft er the the set of bit is "+j);
    }

}
