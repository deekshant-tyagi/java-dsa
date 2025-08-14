import java.util.*;;
public class a63unionAndInt {
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        // union part
        HashSet<Integer> set = new HashSet<>();
        for (int no : arr1) {
            set.add(no);
        }
        for (int no : arr2) {
            set.add(no);
        }
        System.out.println("Union - "+set.size());

        // Intersection part
        set.clear();
        for (int no : arr1) {
            set.add(no);
        }
        int count = 0;
        for(int no : arr2){
            if (set.contains(no)) {
                count+=1;
                set.remove(no);
            }
        }
        System.out.println("Intersection - "+ count);
    }
}
