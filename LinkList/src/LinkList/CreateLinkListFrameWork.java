package LinkList;

import java.util.LinkedList;
import java.util.List;

public class CreateLinkListFrameWork {
    public static void main(String[] args){
        List<Integer> ll=new LinkedList<>();

        ll.add(12);
        ll.add(13);
        ll.add(14);
        ll.add(15);
        System.out.println("our linked list is "+ll);
        System.out.println("get the element at the 3rd position "+ll.get(2));
        System.out.println("get the array "+ll.toArray());
    }
}
