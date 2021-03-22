package loopIng;

public class PowerOfNumber {
    public static void main(String[] args){
        int x=5;
        int y=4;
         int power=1;
         for(int i=1;i<=y;i++){
             power=power*x;
         }
         System.out.println("power of "+x+" to "+y+" is "+ power);
    }
}
