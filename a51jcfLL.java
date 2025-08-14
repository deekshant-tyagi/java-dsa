import java.util.LinkedList;

public class a51jcfLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        // add
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        // remove
        ll.removeLast();
        //print
        System.out.println(ll); 
        // and many more func which are already optimized.
    }
}
