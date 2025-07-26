package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmaps {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        //put
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        System.out.println("Initial Map: " + map);

        //keyset
        Set<Integer> keys = map.keySet();
        System.out.println("Keys in the map: " + keys);

        //entrySet
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("Entries in the map:");
        for (Map.Entry<Integer, String> entry : entries) {      
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
