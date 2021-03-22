package Recursion;

public class FloodFill {
    public static void main(String[ ] args){
        int a[][]={{1,1,1,1,1,1,1,1},
                   {1,1,1,1,1,1,0,0},
                   {1,0,0,1,1,0,1,0},
                   {1,2,2,2,2,0,1,0},
                   {1,1,1,2,2,0,1,0},
                   {1,1,1,2,2,2,2,0},
                   {1,1,1,1,1,2,1,1},
                   {1,1,1,1,1,2,2,1}};
        Fill(a,3,4,1,7);



    }
    static void Fill(int a[][],int r,int c,int toFill,int prevFill){
        int rows=a.length;
        int cols=a[0].length;
         if(r<0||r>=rows||c<0||c>=cols){
             return;
         }
         if(a[r][c]!=prevFill){
             return;
         }
         a[r][c]=toFill;
        Fill(a,r,c-1,toFill,prevFill);
        Fill(a,r-1,c,toFill,prevFill);
        Fill(a,r,c+1,toFill,prevFill);
        Fill(a,r+1,c,toFill,prevFill);
    }
}
