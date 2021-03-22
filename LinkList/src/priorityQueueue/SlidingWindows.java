package priorityQueueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SlidingWindows {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of element ");
        int n=sc.nextInt();
        System.out.println("enter the windows size");
        int k=sc.nextInt();
        System.out.println("enter the element");

        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
        Solution sol=new Solution();
       int ans[]= sol.maxSlidingWindows(a,k);
       for(int e:ans){
           System.out.print(a[e]+" ");
       }



    }


      static class   Solution{
        public  int[] maxSlidingWindows(int[] a,int k) {
            Deque<Integer> dq=new LinkedList<>();
            int n=a.length;
            int ans[]=new int[n-k+1];
            int i=0;
             for(;i<k;i++){
                 while(!dq.isEmpty()&& a[dq.peekLast()]<=a[i]){
                     dq.removeLast();

                 }
                 dq.addLast(i);
             }
             for(;i<n;i++){
                 ans[i-k]=dq.peekFirst();
                 while(!dq.isEmpty()&&dq.peekFirst()<=i-k){
                     dq.removeFirst();
                 }
                 while(!dq.isEmpty()&& a[dq.peekLast()]<=a[i]){
                     dq.removeLast();

                 }
                 dq.addLast(i);
             }
             ans[i-k]=dq.peekFirst();


            return ans;

        }
    }


}
