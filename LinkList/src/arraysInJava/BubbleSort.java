package arraysInJava;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element ");
        int n= sc.nextInt();
        System.out.println("enter the element");
        int [] sort= new int[n];
        for(int i=0;i<n;i++){
            sort[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(sort[j+1]<sort[j]){
                    int temp=sort[j+1];
                    sort[j+1]=sort[j];
                    sort[j]=temp;
                }
            }
        }
        for(int item: sort){
            System.out.println(item+" ");
        }
    }
}
