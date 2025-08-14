import java.util.ArrayList;
public class a47arrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list1 = new ArrayList<>();

        // add operation O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        // another add operation to add ele on specified index O(n)
        list.add(2,11);
        System.out.println(list);

        // remove element
        list.remove(2);
        System.out.println(list);

        // get element
        int ele = list.get(2);
        System.out.println(ele);

        // set ele at index
        list.set(2, 11);
        System.out.println(list);

        // contains ele - true or false
        System.out.println(list.contains(11));

        // size of Al
        System.out.println(list.size());

        // print Al
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        // Reverse an Al
        for(int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        //find max ele in Al
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            // if (max < list.get(i)) {
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println("Max Element is : "+max);
    }
}
