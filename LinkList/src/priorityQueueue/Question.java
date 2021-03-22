package priorityQueueue;
//take an number of input throw k highest number of output

import java.util.*;

public class Question {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of input");
        int n=sc.nextInt();//it is number of total element
        int k=sc.nextInt();//it is number of element throw
        System.out.println("Enter the element :");
        int a[] =new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            if(i<k){
                pq.add(a[i]);
            }else{
                if(pq.peek()<a[i]){
                    pq.poll();
                    pq.add(a[i]);
                }
            }
        }
        ArrayList<Integer> answer=new ArrayList<>(pq);
        Collections.sort(answer,Collections.reverseOrder());
        for(int e:answer){
            System.out.println(e+" ");
        }
    }
}
