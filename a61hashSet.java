import java.util.*;
public class a61hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // add operation
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(5);
        set.add(9);
        System.out.println(set);

        // remove  operation
        // set.remove(2);
        // System.out.println(set);

        // contains operation
        if (set.contains(2)) {
            System.out.println("Element Present");
        }else{
            System.out.println("Not Present");
        }

        //size opr & isEmpty operation
        // System.out.println(set.size());
        // System.out.println(set.isEmpty());

        // Iteration on hashSet
        // 1 - Using Iterator
        // starts from null and goes on till end it.next() checks for next value if next value exists then print and store that value in it
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // 2 - using advance loop
        for (Integer no : set) {
            System.out.println(no);
        }

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        // Maintains order 
        lhs.add("India");
        lhs.add("Aus");
        lhs.add("Rus");
        lhs.add("China");
        System.out.println(lhs);
        TreeSet<String> ts = new TreeSet<>();
        // Maintains sorting order 
        ts.add("India");
        ts.add("Aus");
        ts.add("Rus");
        ts.add("China");
        System.out.println(ts);
    }
}
