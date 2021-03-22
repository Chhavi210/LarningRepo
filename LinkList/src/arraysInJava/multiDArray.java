package arraysInJava;

import java.util.Scanner;

public class multiDArray {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter  number of row");
        int n=sc.nextInt();
        System.out.println("enter the element in matrix 1");
        int[][] student=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                student[i][j]=sc.nextInt();

            }
        }
        System.out.println("enter the element in matrix 2");
        int[][] student2=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                student2[i][j]=sc.nextInt();

            }
        }
       // System.out.println("enter the element in matrix 2");
        int[][] student3=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                student3[i][j]=student[i][j]+student2[i][j];

            }
        }
        System.out.println("after the addition of matrix");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(student3[i][j]+" ");

            }
            System.out.println();
        }
    }
}
