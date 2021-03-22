package BitManupulation.Masking;

public class Conver_a_to_B {
    public static void main(String[] args){
        int a=2;
        int b=16;
        int d=a^b;
        int cout=0;
        while(d>0){
            cout++;
            d=(d&(d-1));
        }
        System.out.println("number of bit change is "+cout);
    }

}
