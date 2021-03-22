package loopIng;

import java.util.Scanner;

public class SeriesSum1 {
    public static void main(String[] args){
        int n=8;

        double sum=0;
        for(double i=1;i<=8;i++){

            sum=sum+(1/i);
            System.out.print("1/"+i+" + ");
        }
        System.out.println();
        System.out.println("sum="+sum);

    }

}
