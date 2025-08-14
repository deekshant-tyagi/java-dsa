import java.util.Arrays;
import java.util.Comparator;
public class a54fracKnap {
    public static void main(String[] args) {
        int val[] = {120,100,60};
        int weight[] = {30,20,10};
        int W = 50;
        double ratio[][] = new double[val.length][2];
        // 0th col => idx, 1st col => ratio
        for(int i=0; i<val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double)val[i]/weight[i];
        }

        // sorting in ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalVal = 0;
        for(int i=ratio.length-1; i>=0; i--) {
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]) { // include full item
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {
                // include fractional item
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("Final value = " + finalVal);
    }
}

// Next - min absolute difference (already done on leetcode)