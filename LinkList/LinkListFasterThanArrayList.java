package LinkList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkListFasterThanArrayList {
    public static void main(String[] args){
        List<Integer> arr=new ArrayList<>();
        List<Integer> ll=new LinkedList<>();
        getTimeDifference(arr);
        getTimeDifference(ll);

    }
    public static void getTimeDifference(List<Integer> list){
        long start=System.currentTimeMillis();
        long S=System.currentTimeMillis();
        for(int i=0;i<99999;i++){
            list.add(0,i);
        }
         long end= System.currentTimeMillis();
        System.out.println(list.getClass().getName()+"--->"+(end-start)+"milliSecond");

    }
}
