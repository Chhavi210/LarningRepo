package VectorAndStack;

import LinkList.SinglyLinklistImplementation.MylinkList;

public class AnotherStack<E> {
    Node<E> head;
    Boolean isEmpty(){
        if(head==null){
            return true;
        }
        else
            return false;

    }
    static class Node<E>{
        E data;
        Node<E> next;
        public Node(E data){
            this.data=data;
            next=null;

        }

    }
    void push(E data){
        Node<E> toAdd =new Node<E>(data);
//if list is empty
        if(head==null){
            head=toAdd;
            return;
        }
        Node<E> temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=toAdd;
    }
    E pop() throws Exception{

        if(head==null){
           throw new Exception("cannot remove last elemet from empty stack");

        }
        Node<E> temp=head;
        if(temp.next==null){

            head=null;
            return (E) temp.data;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        Node<E> temp1=head;
        temp1=temp.next;
        temp.next=null;
        return (E) temp1.data;
    }
    E peek() throws Exception{
        if(head==null){
            throw new Exception("cannot remove last elemet from empty stack");

        }
        Node<E> temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        return (E) temp.data;

    }
}
