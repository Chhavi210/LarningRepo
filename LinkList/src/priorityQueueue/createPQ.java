package priorityQueueue;

import java.util.PriorityQueue;

public class createPQ {
    public static void main(String[] args){
        PriorityQueue<String> pq1=new PriorityQueue<>();
        pq1.add("Apple");
        pq1.add("Mango");
        pq1.add("Banana");
        pq1.add("guava");
        System.out.println(pq1);
        System.out.println(pq1.remove());
        System.out.println(pq1);
        System.out.println(pq1.remove());
        System.out.println(pq1.remove());
        System.out.println(pq1.remove());
    }
}
