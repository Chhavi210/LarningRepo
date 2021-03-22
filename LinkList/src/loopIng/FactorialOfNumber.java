package loopIng;

public class FactorialOfNumber {
    public static void main(String[] args){
        int factOf=0;
        if(factOf==0){
            System.out.println(1);
        }
        else
        {
            int fact=1;
             for(int i=1;i<=factOf;i++){
                 fact=fact*i;

             }
             System.out.println("factorial of "+factOf +" is "+fact);
        }
    }

}
