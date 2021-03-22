package Recursion;

public class PathMatrix {
    public static void main(String[] args){
        System.out.println(path(3,3));

 }
    static int path(int m,int n){

        if(m==1||n==1)return 1;
        else
            return path(m-1,n)+path(m,n-1);
    }
}
