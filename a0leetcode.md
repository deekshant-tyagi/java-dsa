<!-- leetcode Solutions. -->

1.<!-- 1137. N-th Tribonacci Number -->
class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }
        else{
            int firstNo = 0;
            int secondNo = 1;
            int thirdNo = 1;
            for(int i=1; i<=n; i++){
                int fourthNo = firstNo + secondNo + thirdNo;
                firstNo = secondNo;
                secondNo = thirdNo;
                thirdNo = fourthNo;
            }
            return firstNo;
        }
        
    }
}


2.<!-- 231. Power of Two -->
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1)
            return false;
        return (n & (n-1))==0;
    }
}


3.<!-- 1. Two Sum -->
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int end = nums.length-1;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
                else if(nums[end-i]+nums[end-j]==target){
                    return new int[]{end-i,end-j};
                }
            }
        }
        return new int[]{0,0};
    }
}

4.<!-- 1518. Water Bottles -->
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while(numBottles>=numExchange){
            int newBottles = numBottles / numExchange;
            int remBottles = numBottles % numExchange;
            ans = ans + newBottles;
            numBottles = remBottles + newBottles;
        }
        return ans;
    }
}

5.<!-- 9. Palindrome Number -->
class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int revNum = 0;
        while(n>0){
            revNum = (revNum*10)+(n%10);
            n = n/10;
        }
        if(revNum==x){
            return true;
        }
        return false;
    }
}

6.<!-- 509. Fibonacci Number -->
class Solution {
    public int fib(int n) {
        int firstNo = 0;
        int secondNo = 1;
        if (n==0) {
            return 0;
        }
        else if (n==1) {
            return 1;
        }
        else{
            for(int i=1; i<=n; i++){
                int thirdNo = firstNo + secondNo;
                firstNo = secondNo;
                secondNo=thirdNo;
            }
        }
        return firstNo;
    }
}