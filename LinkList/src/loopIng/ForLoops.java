package loopIng;

public class ForLoops {
    public static void main(String[] args){
        int sum=0;
        for(int i=1;i<=100;i++){
            System.out.print(i+",");
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
