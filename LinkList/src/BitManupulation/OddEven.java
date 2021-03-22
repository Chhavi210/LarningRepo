package BitManupulation;

public class OddEven {
    public static void main(String[]args){
        System.out.println(OddEen(99));

    }
    static String OddEen(int a){
        if((a & 1) == 0)return "even";
        else return "odd";
    }

}
