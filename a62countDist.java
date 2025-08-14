import java.util.*;
public record a62countDist() {
    public static void main(String[] args) {
        int nums[] = {4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> set = new HashSet<>();
        for (int no : nums) {
            set.add(no);
        }
        System.out.println("Ans-"+set.size());
    }
}
