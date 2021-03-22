package LinkList.SinglyLinklistImplementation;

public class MylinkList<E> {

    Node<E> head;
    //addtohead fn take data
    //and add the node to the head of the list
    void addToHead(E data){
       //if list is empty
        Node<E> toAdd= new Node<E>(data);
        if(head==null){
            head=toAdd;
            return;
        }
        toAdd.next=head;
        head=toAdd;

    }

    //add fn take data
    //create a node add to the end of the list
    void add(E data){
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
    void  removeHead(){
        if(head==null){
            System.out.println("Sorry your list is mpty");
            return;
        }
        Node temp=head;
        head=head.next;
        temp.next=null;
        System.out.println("element is removed is "+temp.data);
        temp=null;


    }
    void print(){
        Node<E> temp=head;
        while(temp!=null){
            System.out.print(temp.data+" , ");
            temp=temp.next;
        }

    }

  public   static class Node<E>{
        E data;
       public Node<E> next;
        public Node(E data){
            this.data=data;
            next=null;

        }

    }
}
