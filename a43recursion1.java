public class a43recursion1 {
    // Tiling problem (2xn) board.
    public static int tilingProb(int n){
        // Base Case
        if (n==0 || n==1) {
            return 1;
        }
        // vertical choice
        int fnm1 = tilingProb(n-1);
        System.out.println("vertical ways"+fnm1);
        // horizontal choice
        int fnm2 = tilingProb(n-2);
        System.out.println("horizontal ways"+fnm2);
        int totalWays = fnm1 + fnm2;
        System.out.println("total ways-"+totalWays);
        return totalWays;
    }

    // Remove duplicates 
    public static void removeDup(String str, int idx, StringBuilder newStr,boolean map[]){
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar-'a']==true) {
            removeDup(str, idx+1, newStr, map);
        } else {
            map[currChar-'a'] = true;
            removeDup(str, idx+1, newStr.append(currChar), map);
        }
    }

    // friends pairing problem
    public static int friendsPairingProb(int n){
        // now base case
        if (n==1 || n==2) {
            return n;
        }
        // for single case
        // int fnm1 = friendsPairingProb(n-1);
        // // for pair
        // int fnm2 = friendsPairingProb(n-2);
        // int totPairWays = (n-1)*fnm2;

        // return fnm1 + totPairWays;
        return friendsPairingProb(n-1) + (n-1)*friendsPairingProb(n-2);
    }

    //Binary String Problem
    static void BinaryProb(int n,int lastPlace,String str){
        if (n==0) {
            System.out.println(str);
            return;
        }
        // if (lastPlace == 0) {
        //     BinaryProb(n-1, 0, str+'0');
        //     BinaryProb(n-1, 1, str+'1');
        // }else{
        //     BinaryProb(n-1, 0, str+'0');
        // }
        // Simplified
        BinaryProb(n-1, 0, str+'0');
        if (lastPlace == 0) {
            BinaryProb(n-1, 1, str+'1');
        }
    }

    public static void main(String[] args) {
        int n = 4;
        // System.out.println(tilingProb(n));
        boolean map[] = new boolean[26];
        StringBuilder sb = new StringBuilder();
        removeDup("bcdebcdea", 0, sb, map);
        // System.out.println(friendsPairingProb(3));

        // BinaryProb(3,0,"");
    }
}
