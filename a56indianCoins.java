import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class a56indianCoins {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        int amount = 5590;
        Arrays.sort(coins, Comparator.reverseOrder());

        ArrayList<Integer> ans = new ArrayList<>();
        int countOfCoins = 0;
        for(int i=0; i<coins.length; i++){
            if (coins[i]<=amount) {
                while (coins[i]<=amount) {
                    countOfCoins++;
                    amount -= coins[i];
                    ans.add(coins[i]);
                }
            }
        } 
        System.out.println("Total coins used : "+countOfCoins);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
