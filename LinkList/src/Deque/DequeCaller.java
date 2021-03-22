package Deque;

public class DequeCaller {
    public static void main(String[] args){
        MyDeque<Integer> queue=new MyDeque<>();
        for(int i=0;i<6;i++){
            queue.addToHead(i);
        }
        for(int i=3;i>0;i--){
            queue.toAddTail(i);
        }

        System.out.println(queue.removeFromHead());
        System.out.println(queue.removeFromHead());
        System.out.println(queue.removeFromTail());
        System.out.println(queue.removeFromTail());
        System.out.println(queue.peekFromHead());
        System.out.println(queue.peekFromTail());

    }
}
