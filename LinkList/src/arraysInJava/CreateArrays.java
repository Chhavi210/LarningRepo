package arraysInJava;

import java.util.Scanner;

public class CreateArrays {
    public static void main(String[] args){
        int [] arra;
        arra = new int[7];
        int [] arr2 =new int[9];
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<2;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=1;i<=8 ;i++){
            System.out.println(arr2[i]);
        }

    }
}
