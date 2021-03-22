package SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CreateSet {
    public static void main(String[] args){
        Set<Integer> s1=new HashSet<>();//operation is in constant time
        Set<Integer> s2=new LinkedHashSet<>();//operation is same as linked =list and order of element is same as enter
        Set<Integer> s3=new TreeSet<>();//sorted order
        Set<Integer> s4=new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);
        s1.addAll(s4);//it is union of set basically all the element is added to s1 set
         s1.retainAll(s4);//it is intersection all the element are remove from s1 that are not present in s4
        s1.containsAll(s4);//it is for subset it return boolean value  it check all the element of s4 is present in s1 or not
        System.out.println(s1.add(6));

        System.out.println(s1.add(1));//it return false b/c 1 is already added and simply add return truee when the element is not present
         System.out.println(s1);
    }

}
