package VectorAndStack;

import LinkList.SinglyLinklistImplementation.MylinkList;

public class MyStackByLinkList<E> {
    Node<E> head;
    static class Node<E>{
        E data;
        Node<E> next;
        public Node(E data){
            this.data=data;
            next=null;

        }

    }
    void push(E data){
        Node<E> add=new Node(data);
        if(head==null){
            head=add;
            return;

        }
        Node<E> temp=head;
        head=add;
        head.next=temp;


    }
    E pop(){
        if(head==null){
            System.out.println("stack is inn underflow");
            return (E)head.data;
        }
        Node<E> temp=head;
        head=head.next;
        temp.next=null;
        return (E) temp.data;
    }
    E peek(){
        if(head==null){
            System.out.println("sorry nothing in the list");
            return (E)head;
        }
        return (E)head.data;
    }
    void print(){
        Node<E> temp=head;
        while(temp!=null){
            System.out.print(temp.data+" , ");
            temp=temp.next;
        }

    }
}
