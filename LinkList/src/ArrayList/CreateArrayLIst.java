package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayLIst {

    public static void main(String[] args){
        List<Integer> arraylist= new ArrayList<>();
        // another method to implement the array list byusing ArrayList intead of List
        ArrayList<Integer> arr1=new ArrayList<>();

//        if (arraylist.isEmpty()) {
//            System.out.println("array is empty");
//        }
            arraylist.add(1);
             arraylist.add(2);
        arraylist.add(2);
        System.out.println(arraylist.get(0));
        arraylist.clear();
        if (arraylist.isEmpty()) {
            System.out.println("arrar is empty");
        }
        arraylist.add(0,34);
        System.out.println(arraylist);

    }
}
