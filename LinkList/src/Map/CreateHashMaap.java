package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CreateHashMaap {
    public static void main(String[] args){
        Map<String,Integer> nummber = new HashMap<>();
        nummber.put("one",1);
        nummber.put("two",2);
        nummber.put("four",4);
        nummber.put("one",10);
        nummber.putIfAbsent("five ",5);
        nummber.putIfAbsent("five ",45);
        System.out.println(nummber.get("five "));
        System.out.println(nummber.getOrDefault("five ",45));
        System.out.println(nummber);

        Set<Map.Entry<String,Integer>> entries=nummber.entrySet();
//        for(Map.Entry<String,Integer> entr:entries){
//
//            entr.setValue(entr.getValue()*10);
//            System.out.println(nummber);
//
//        }
    }
}
