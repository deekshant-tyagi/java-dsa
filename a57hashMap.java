import java.util.*;

public class a57hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        // put operation in hashmap
        hm.put("India", 100);
        hm.put("China", 50);
        hm.put("Usa", 70);
        System.out.println(hm);

        // get operation in hashmap
        int population = hm.get("India");
        System.out.println(population);

        // contains operation in hashmap
        System.out.println(hm.containsKey("Usa"));

        // remove operation in hashmap
        System.out.println(hm.remove("Usa"));
        System.out.println(hm);

        // size of hashmap
        System.out.println("Size - " + hm.size());

        // isEmpty operation in hashmap
        System.out.println(hm.isEmpty());

        // clear operation in hashmap
        // hm.clear();
        // System.out.println("Hashmap - "+hm);

        // iteration on hashmap
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("keys : " + k + ", Value : " + hm.get(k));
        }
    }
}
