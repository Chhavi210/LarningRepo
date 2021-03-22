package BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class faltu {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        BigInteger no1=sc.nextBigInteger();
        BigInteger no2=sc.nextBigInteger();
         System.out.println(no1.add(no1));
         System.out.println(no1.subtract(no2));
         System.out.println(no1.multiply(no2));
         System.out.println(no1.divide(no2));
         System.out.println(no1.mod(no2));
         System.out.println(no1.remainder(no2));
         System.out.println(no1.abs());
         if(no1.compareTo(new BigInteger("80"))>=0){
              System.out.println("hii"+no2);

         }

    }
}
