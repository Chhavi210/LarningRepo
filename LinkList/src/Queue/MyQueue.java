package Queue;

import LinkList.SinglyLinklistImplementation.MylinkList;

public class MyQueue<E> {
    private MylinkList.Node<E> head,rear;
    public void enqueue(E e){
        MylinkList.Node<E> toAdd=new MylinkList.Node<>(e);
        if(head==null){
            head=rear=toAdd;
            return;

        }
        rear.next=toAdd;
        rear=rear.next;

    }
    public E dequeue(){

        MylinkList.Node<E> temp=head;
        if(head==rear){
            head=rear=null;

        }
        head=head.next;
        temp.next=null;
        return (E) temp;

    }

}
