package BitManupulation.Masking;

public class Clear_Bits {
    public static void main(String[] args){
        int n=12;
        int clearBit=2;
        int mask=1;
        mask=mask<<clearBit;
        mask=~mask;
        int k=n&mask;
        System.out.println(k);
    }
}
