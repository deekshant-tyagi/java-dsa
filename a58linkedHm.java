import java.util.*;

public class a58linkedHm {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        // linked hashmap maintains the insertion order
        lhm.put("India", 150);
        lhm.put("Usa", 100);
        lhm.put("China", 50);
        System.out.println(lhm);
        
        // TreeMap - keys maintains a sorted order
        TreeMap<String,Integer> tmp = new TreeMap<>();
        tmp.put("India", 150);
        tmp.put("Usa", 100);
        tmp.put("China", 50);
        tmp.put("Indonesia", 5);
        System.out.println(tmp);
    }
}
