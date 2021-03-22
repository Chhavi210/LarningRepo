package BitManupulation.Masking;

public class Find_ith_Bit {
    public static void main(String[] args){
        int i=1;
        int a=9;//binary of 9 is 1001
        int mask=1;//binary==00001
        mask=mask<<i;//after 1shift 00010
        int d=(a&mask);//mask=0000
        if(d>0){
            System.out.println(1);
        }
        else
            System.out.println(0);

    }

}
