package Deque;

public class MyDeque<E> {
    Node<E> head=null;
    Node<E> tail=null;
    public void addToHead(E data){
        Node<E> addTo=new Node<>(data);
        if(head==null&&tail==null){
            head=tail=addTo;
            return;
        }
        head.next=addTo;
        addTo.prev=head;
        head=head.next;
    }
    public E removeFromHead(){
        if(head==null){
            return null;
        }
        Node<E> temp=head;
        if(head==tail){
            head=tail=null;
            return (E)temp.data;

        }
        head=head.prev;
        head.next=null;
        temp.prev=null;
        return temp.data;
    }
    public void toAddTail(E data) {
        Node<E> addTo=new Node<>(data);
        if(head==null&&tail==null){
            head=tail=addTo;
            return;
        }
        tail.prev=addTo;
        addTo.next=tail;
        tail=tail.prev;
    }
    public E removeFromTail(){
        if(tail==null){
            return null;
        }
        Node<E> temp=tail;
        if(tail==head){
            tail=head=null;
            return (E)temp.data;

        }
        tail=tail.next;
        tail.prev=null;
        temp.next=null;
        return (E)temp.data;
    }
    public E peekFromHead(){
        if(head==null){
            return null;
        }
        return head.data;

    }
    public E peekFromTail(){
        if(tail==null){
            return null;
        }
        return tail.data;
    }
    public static class Node<E>{
        E data;
        Node<E> next,prev;
        Node(E data){
            this.data=data;
            this.next=this.prev=null;
        }
    }
}
