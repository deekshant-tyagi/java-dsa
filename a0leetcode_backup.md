# LeetCode Solutions - Organized by Topic

## Table of Contents

1. [Basic Implementation & Math](#basic-implementation--math)
2. [Arrays & Basic Array Operations](#arrays--basic-array-operations)
3. [String Manipulation](#string-manipulation)
4. [Binary Search](#binary-search)
5. [Sliding Window](#sliding-window)
6. [Bit Manipulation](#bit-manipulation)
7. [Stack & Queue](#stack--queue)
8. [Matrix Operations](#matrix-operations)
9. [Greedy Algorithms & Simulation](#greedy-algorithms--simulation)
10. [Mathematical & Number Theory](#mathematical--number-theory)

---

## Basic Implementation & Math

1. <!-- 2235. Add Two Integers -->
2. <!-- 2469. Convert the Temperature -->
3. <!-- 1450. Number of Students Doing Homework at a Given Time -->
4. <!-- 1518. Water Bottles -->
5. <!-- 2769. Find the Maximum Achievable Number -->

## Arrays & Basic Array Operations

6. <!-- 485. Max Consecutive Ones -->
7. <!-- 1550. Three Consecutive Odds -->
8. <!-- 283. Move Zeroes -->
9. <!-- 1. Two Sum -->
10. <!-- 268. Missing Number -->
11. <!-- 448. Find All Numbers Disappeared in an Array -->
12. <!-- 287. Find the Duplicate Number -->
13. <!-- 442. Find All Duplicates in an Array -->
14. <!-- 53. Maximum Subarray -->
15. <!-- 1051. Height Checker -->
16. <!-- 2037. Minimum Number of Moves to Seat Everyone -->
17. <!-- 1122. Relative Sort Array -->
18. <!-- 945. Minimum Increment to Make Array Unique -->
19. <!-- 2553. Separate the Digits in an Array -->
20. <!-- 11. Container With Most Water -->
21. <!-- 15. 3Sum -->
22. <!-- 16. 3Sum Closest -->
23. <!-- 56. Merge Intervals -->

## String Manipulation

24. <!-- 344. Reverse String -->
25. <!-- 3110. Score of a String -->
26. <!-- 242. Valid Anagram -->
27. <!-- 557. Reverse Words in a String III -->
28. <!-- 9. Palindrome Number -->
29. <!-- 409. Longest Palindrome -->
30. <!-- 2486. Append Characters to String to Make Subsequence -->
31. <!-- 1869. Longer Contiguous Segments of Ones than Zeros -->
32. <!-- 151. Reverse Words in a String -->

## Binary Search

33. <!-- 704. Binary Search -->
34. <!-- 35. Search Insert Position -->
35. <!-- 744. Find Smallest Letter Greater Than Target -->
36. <!-- 633. Sum of Square Numbers -->
37. <!-- 74. Search a 2D Matrix -->
38. <!-- 240. Search a 2D Matrix II -->
39. <!-- 162. Find Peak Element -->
40. <!-- 34. Find First and Last Position of Element in Sorted Array -->
41. <!-- 153. Find Minimum in Rotated Sorted Array -->
42. <!-- 154. Find Minimum in Rotated Sorted Array II -->
43. <!-- 33. Search in Rotated Sorted Array -->

## Sliding Window

44. <!-- 643. Maximum Average Subarray I -->
45. <!-- 1456. Maximum Number of Vowels in a Substring of Given Length -->
46. <!-- 209. Minimum Size Subarray Sum -->

## Bit Manipulation

47. <!-- 231. Power of Two -->
48. <!-- 191. Number of 1 Bits -->
49. <!-- 136. Single Number -->
50. <!-- 260. Single Number III -->
51. <!-- 1952. Three Divisors -->

## Stack & Queue

52. <!-- 20. Valid Parentheses -->
53. <!-- 921. Minimum Add to Make Parentheses Valid -->
54. <!-- 1963. Minimum Number of Swaps to Make the String Balanced -->
55. <!-- 735. Asteroid Collision -->
56. <!-- 901. Online Stock Span -->
57. <!-- Next Greater Element --> GFG
58. <!-- Help Classmates --> GFG
59. <!-- 503. Next Greater Element II -->

## Matrix Operations

60. <!-- 54. Spiral Matrix -->
61. <!-- 32. Longest Valid Parentheses -->

## Greedy Algorithms & Simulation

62. <!-- 846. Hand of Straights -->
63. <!-- 728. Self Dividing Numbers -->

## Mathematical & Number Theory

64. <!-- 509. Fibonacci Number -->
65. <!-- 1137. N-th Tribonacci Number -->
66. <!-- 258. Add Digits -->
67. <!-- 507. Perfect Number -->
68. <!-- 1342. Number of Steps to Reduce a Number to Zero -->
69. <!-- 2169. Count Operations to Obtain Zero -->
70. <!-- 1404. Number of Steps to Reduce a Number in Binary Representation to One -->
71. <!-- 2139. Minimum Moves to Reach Target Score -->
72. <!-- 2180. Count Integers With Even Digit Sum -->
73. <!-- 1281. Subtract the Product and Sum of Digits of an Integer -->
74. <!-- leetcode 172 -->

---

# Solutions

## Basic Implementation & Math

### 1. <!-- 2235. Add Two Integers -->

class Solution {
public int sum(int num1, int num2) {
return num1+num2;
}
}

### 2. <!-- 2469. Convert the Temperature -->

class Solution {
public double[] convertTemperature(double celsius) {
return new double[] {celsius+273.15 , celsius\*1.80+32.00};
}
}

### 3. <!-- 1450. Number of Students Doing Homework at a Given Time -->

class Solution {
public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
int student = 0;
for(int i=0; i<startTime.length; i++){
if(startTime[i]<=queryTime && endTime[i]>=queryTime){
student++;
}
}
return student;
}
}

### 4. <!-- 1518. Water Bottles -->

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

### 5. <!-- 2769. Find the Maximum Achievable Number -->

class Solution {
public int theMaximumAchievableX(int num, int t) {
return num + t\*2;
}
}

## Arrays & Basic Array Operations

### 6. <!-- 485. Max Consecutive Ones -->

class Solution {
public int findMaxConsecutiveOnes(int[] nums) {
int count=0 , sum=0;
for(int i=0; i<nums.length; i++){
if(nums[i]==1){
count++;
if(count>sum){
sum=count;
}
}
else{
count=0;
}
}
return sum;
}
}

12.<!-- 1869. Longer Contiguous Segments of Ones than Zeros -->
class Solution {
public boolean checkZeroOnes(String s) {
int onesCount = 0; // Count of consecutive 1's
int zerosCount = 0; // Count of consecutive 0's

        // Max lengths of consecutive 1's and 0's
        int maxOnes = 0;
        int maxZeros = 0;

        // Traverse through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);  // Current character

            // If current character is '1', increase the ones streak
            if (currentChar == '1') {
                onesCount++;
                zerosCount = 0;  // Reset zeros streak since it's broken
            }
            // If current character is '0', increase the zeros streak
            else {
                zerosCount++;
                onesCount = 0;  // Reset ones streak since it's broken
            }

            // Update maximum streak lengths
            maxOnes = Math.max(maxOnes, onesCount);
            maxZeros = Math.max(maxZeros, zerosCount);
        }

        // Return true if the longest streak of 1's is greater than the longest streak of 0's
        return maxOnes > maxZeros;
    }

}

13.<!-- 1404. Number of Steps to Reduce a Number in Binary Representation to One -->
class Solution {
static int BinaryToDecimal(int binaryNum,int base){
int resNum=0;
int power=0;
while (binaryNum>0) {
int rem = binaryNum%base;
resNum += rem \* Math.pow(2, power);
binaryNum = binaryNum/base;
power++;
}
return resNum;
}
public int numSteps(String s) {
int num = Integer.parseInt(s);
int newNum = BinaryToDecimal(num,10);
int steps = 0;
while(newNum!=1){
if(newNum%2==0){
newNum = newNum/2;
}
else{
newNum = newNum + 1;
}
steps++;
}
return steps;
}
}

14.<!-- 2139. Minimum Moves to Reach Target Score -->
class Solution {
public int minMoves(int target, int maxDoubles) {
int steps = 0;
while(target>1){
if(maxDoubles>0){
if(target%2==0){
target /= 2;
maxDoubles--;
}
else{
target--;
}
}
else{
target--;
}
steps++;
}
return steps;
}
}

15.<!-- 3110. Score of a String -->>
class Solution {
public int scoreOfString(String s) {
int score = 0;
for(int i=0; i<s.length()-1; i++){
int diff = s.charAt(i)-s.charAt(i+1);

<!-- when we use - it automatically converts char into int data type implicitly. -->

if(diff<0){
diff \*= -1;
}
score += diff;
}
return score;
}
}
<----------OR---------->
class Solution {
public int scoreOfString(String s) {
int score = 0;
for(int i=0; i<s.length()-1; i++){
int diff = Math.abs(s.charAt(i)-s.charAt(i+1));
score += diff;
}
return score;
}
}

16.<!-- 136. Single Number -->
class Solution {
public int singleNumber(int[] nums) {
// A ^ 0 = A , A ^ A = 0
int res=0;
for(int i=0; i<nums.length; i++){
res = res ^ nums[i];
}
return res;
}
}
<----------OR---------->
class Solution {
public int singleNumber(int[] nums) {
// A ^ 0 = A , A ^ A = 0
int res=nums[0];
for(int i=1; i<nums.length; i++){
res = res ^ nums[i];
}
return res;
}
}

17.<!-- 2769. Find the Maximum Achievable Number -->
class Solution {
public int theMaximumAchievableX(int num, int t) {
return num + t\*2;
}
}

18<!--2469. Convert the Temperature -->
class Solution {
public double[] convertTemperature(double celsius) {
return new double[] {celsius+273.15 , celsius\*1.80+32.00};
}
}

19.<!-- 2235. Add Two Integers -->
class Solution {
public int sum(int num1, int num2) {
return num1+num2;
}
}

20.<!-- 258. Add Digits -->
class Solution {
static int sumOfDigits(int num){
int sum = 0;
while(num>0){
int rem = num%10;
sum = sum + rem;
num = num/10;
}
return sum;
}
public int addDigits(int num) {
int newSum = sumOfDigits(num);
while(newSum>=10){
num = newSum;
newSum = 0;
newSum = sumOfDigits(num);
}
return newSum;
}
}

21.<!-- 344. Reverse String -->>
class Solution {
public void reverseString(char[] s) {
int n = s.length-1;
int left = 0;
int right = n;
while(left<right){
char rev = s[left];
s[left] = s[right];
s[right] = rev;
left++;
right--;
}
}
}

22.<!-- 2486. Append Characters to String to Make Subsequence -->>
class Solution {
public int appendCharacters(String s, String t) {
// to solve this question just find the first
// missing character.
int n = s.length();
int m = t.length();
int i = 0;
int j = 0;
while(i<n && j<m){
if(s.charAt(i)==t.charAt(j)){
i++;
j++;
}
else{
i++;
}
}
return(m-j);

    }

}

23.<!-- 846. Hand of Straights -->>
import java.util.Arrays;
class Solution {
static boolean nextSuccessor(int hand[], int groupSize, int i, int n){
int nextValue = hand[i]+1;
hand[i] = -1;
int count = 1;
i+=1;=
while(i<n && count<groupSize){
if(hand[i]==nextValue){
nextValue = hand[i]+1;
hand[i] = -1;
count++;
}
i++;
}
if(count!=groupSize)
return false;
else
return true;
}

    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if(n%groupSize!=0)
            return false;
        Arrays.sort(hand);
        for(int i=0; i<n; i++){
            if(hand[i]>=0){
                if(!nextSuccessor(hand, groupSize, i, n))
                    return false;
            }
        }
        return true;
    }

}

24.<!-- 260. Single Number III -->
class Solution {
public int[] singleNumber(int[] nums) {
int n = nums.length;
int res = 0;
for(int i=0; i<n; i++){
res = res ^ nums[i];
}
int bit=0,setBit=0;
while(res!=0){
if(((res>>bit)&1)!=0){
setBit = bit;
break;
}
bit++;
}
int res1=0;
for(int i=0; i<n; i++){
if(((nums[i]>>setBit)&1)!=0){
res1 = res1 ^ nums[i];
}
}
int num1 = res ^ res1;
int num2 = num1 ^ res;

        return new int[]{num1 , num2};
    }

} 25.<!-- 409. Longest Palindrome -->
class Solution {
public int longestPalindrome(String s) {
int[] count = new int[123];
for(char ch:s.toCharArray()){
count[ch]++;
}
int res = 0;
for(int i=0; i<123; i++){
int val = count[i];
res += (val/2)\*2;
if(res%2==0 && val%2==1){
res++;
}
}
return res;
}
}
<----------OR------------>
class Solution {
public int longestPalindrome(String s) {
int n = s.length();
int[] arrLower = new int[26];
int[] arrUpper = new int[26];
for (int i = 0; i < n; i++) {
char ch = s.charAt(i);
if (ch - 97 >= 0) {
arrLower[ch - 97]++;
} else {
arrUpper[ch - 65]++;
}
}
int ans = 0;
boolean isFirstOdd = false;
for (int i = 0; i < 26; i++) {
if (arrLower[i] % 2 == 0) {
ans += arrLower[i];
} else {
if (isFirstOdd == false) {
ans += arrLower[i];
isFirstOdd = true;
} else {
ans += arrLower[i] - 1;
}
}
if (arrUpper[i] % 2 == 0) {
ans += arrUpper[i];
} else {
if (isFirstOdd == false) {
ans += arrUpper[i];
isFirstOdd = true;
} else {
ans += arrUpper[i] - 1;
}
}
}
return ans;
}
}

<----------OR------------>
class Solution {
public int longestPalindrome(String s) {
int arrLower[] = new int[26];
int arrUpper[] = new int[26];
for(char c: s.toCharArray()){
if(c>='a'){
arrLower[c-'a']++;
}
else{
arrUpper[c-'A']++;
}
}
int ans = 0;
boolean onePresent = false;
for(int i=0; i<26; i++){
if(arrLower[i]%2==0){
ans += arrLower[i];
}
else{
ans += arrLower[i]-1;
onePresent = true;
}
if(arrUpper[i]%2==0){
ans += arrUpper[i];
}
else{
ans += arrUpper[i]-1;
onePresent = true;
}
}
return onePresent?ans+1:ans;
}
}

26.<!-- 1051. Height Checker -->
class Solution {
public int heightChecker(int[] heights) {
int n = heights.length;
int[] sortedHeight = heights.clone();
Arrays.sort(sortedHeight);
int count = 0;
for(int i=0; i<n; i++){
if(heights[i]!=sortedHeight[i]){
count++;
}
}
return count;
}
}

27.<!-- 1122. Relative Sort Array -->
class Solution {
public int[] relativeSortArray(int[] arr1, int[] arr2) {
int n = arr1.length;
int m = arr2.length;
int max=0;
for(int i=0; i<n; i++){
max = Math.max(max,arr1[i]);
}
int[] count = new int[max+1];
for(int i=0; i<n; i++){
int element = arr1[i];
count[element]++;
}
int[] result = new int[n];
int index=0;
for(int i=0; i<m; i++){
int element = arr2[i];
while(count[element]>0){
result[index] = element;
index++;
count[element]--;
}
}
for(int i=0; i<count.length; i++){
while(count[i]>0){
result[index] = i;
count[i]--;
index++;
}
}
return result;
}
}

28.<!-- 2037. Minimum Number of Moves to Seat Everyone -->
class Solution {
public int minMovesToSeat(int[] seats, int[] students) {
// Brute Force h bhaiii :)
Arrays.sort(seats);
Arrays.sort(students);
int n = students.length;
int moves=0;
for(int i=0; i<n; i++){
while(students[i]!=seats[i]){
if(seats[i]>students[i]){
students[i]++;
moves++;
}
else{
students[i]--;
moves++;
}
}
// or
// moves += Math.abs(seats[i]-students[i]);
}
return moves;
}
}

29.<!-- 945. Minimum Increment to Make Array Unique -->
class Solution {
public int findMaxElem(int arr[]){
int max = 0;
for(int i=0; i<arr.length; i++){
max = Math.max(max,arr[i]);
}
return max;
}
public int minIncrementForUnique(int[] nums) {
int n = nums.length;
int maxEl = findMaxElem(nums);
int[] countArr = new int[n+maxEl];
//finding freq
for(int num:nums){
countArr[num]++;
}
// finding min moves
int moves = 0;
for(int i=0; i<countArr.length; i++){
if(countArr[i]<=1) continue;
int extra = countArr[i] - 1;
moves+=extra;
countArr[i+1]+=extra;
countArr[i] = 1;
}
return moves;
}
}

30.<!-- 74. Search a 2D Matrix -->
class Solution {
public boolean searchMatrix(int[][] matrix, int target) {
for(int i=0; i<matrix.length; i++){
for(int j=0; j<matrix[i].length; j++){
if(matrix[i][j]==target){
return true;
}
}
}
return false;
}
} 31.<!-- 240. Search a 2D Matrix II -->
same solution but we have to optimized it, will do later.

32.<!-- 35. Search Insert Position -->
class Solution {
public int searchInsert(int[] nums, int target) {
for(int i=0; i<nums.length; i++){
if(nums[i]==target){
return i;
}
}
int index=0;
for(int i=0; i<nums.length; i++){
if(nums[i]<target){
index++;
}
}
return index;
}
}

33.<!-- 633. Sum of Square Numbers -->
class Solution {
public boolean judgeSquareSum(int c) {
long a = 0;
long b = (long)Math.sqrt(c);
while(a<=b){
long t = a*a + b*b;
if(t==c)
return true;
else if(t<c)
a++;
else
b--;
}
return false;
}
}

34.<!-- 34. Find First and Last Position of Element in Sorted Array -->
class Solution {
public int[] searchRange(int[] nums, int target) {
int startOcc = FLbinarySearch(nums,target,true);
int lastOcc = FLbinarySearch(nums,target,false);
return new int[]{startOcc,lastOcc};
}
static int FLbinarySearch(int arr[], int target, boolean isFirst){
int ans = -1;
int start = 0;
int end = arr.length-1;
while (start<=end) {
int mid = start + (end-start)/2;
if (arr[mid]==target) {
ans = mid;
if (isFirst) {
end = mid-1;
}
else{
start = mid+1;
}
}
else if (arr[mid]<target) {
start = mid+1;
}
else{
end = mid-1;
}
}
return ans;
}
}

35.<!-- 744. Find Smallest Letter Greater Than Target -->
class Solution {
public char nextGreatestLetter(char[] letters, char target) {
char res = BinarySearchCeil(letters,target);
return res;
}
public static char BinarySearchCeil(char arr[], char target){
char ans = '$';
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (arr[mid]<=target) {
                start = mid+1;
            }
            else{
                end = mid-1;
                ans = arr[mid];
            }
        }
        if(ans=='$'){
return arr[0];
}else{
return ans;
}
}
} 36.<!-- 1550. Three Consecutive Odds -->
class Solution {
public boolean threeConsecutiveOdds(int[] arr) {
int count = 0;
for(int i=0; i<arr.length; i++){
if(arr[i]%2!=0){
count++;
if(count==3){
return true;
}
} else{
count = 0;
}
}
return false;
}
}

37.<!-- 162. Find Peak Element -->
class Solution {
public int findPeakElement(int[] nums) {
int peak = 0;
for(int i=0; i<nums.length-1; i++){
if(nums[i]<nums[i+1])
peak = i+1;
}
return peak;
}
}
OR
class Solution {
public int findPeakElement(int[] arr) {
int start = 0;
int end = arr.length-1;
while(start<end){
int mid = start + (end - start)/2;
if(arr[mid]>arr[mid+1]){
end = mid;
} else{
start = mid+1;
}
}
return end;
}
}

38.<!-- 1450. Number of Students Doing Homework at a Given Time -->
class Solution {
public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
int student = 0;
for(int i=0; i<startTime.length; i++){
if(startTime[i]<=queryTime && endTime[i]>=queryTime){
student++;
}
}
return student;
}
}

39.<!-- 1952. Three Divisors -->
class Solution {
public boolean isThree(int n) {
int counter = 1;
int num = (int)Math.sqrt(n);
int flag = 0;
while(counter<=num){
if(n%counter==0){
flag++;
int otherNum = n/counter;
if(otherNum!=counter){
flag++;
}
}
counter++;
}
if(flag==3){
return true;
}
return false;
}
} 40.<!-- 153. Find Minimum in Rotated Sorted Array -->
class Solution {
public int findMin(int[] nums) {
int min = minElement(nums);
return nums[min];
}
static int minElement(int arr[]){
int start = 0;
int end = arr.length-1;
while(start<end){
int mid = start + (end-start) / 2;
if(mid>0 && arr[mid]<arr[mid-1]){
return mid;
} else if(arr[mid]<arr[end]){
end = mid-1;
}else{
start = mid+1;
}
}
return start;
}
}

41.<!-- 154. Find Minimum in Rotated Sorted Array II -->
class Solution {
public int findMin(int[] nums) {
int min = minElement(nums);
return nums[min];
}
static int minElement(int arr[]){
int start = 0;
int end = arr.length-1;
while(start<end){
int mid = start + (end-start) / 2;
if(arr[start]==arr[mid] && arr[mid]==arr[end]){
start++;
end--;
}
else if(mid>0 && arr[mid]<arr[mid-1]){
return mid;
} else if(arr[mid]<=arr[end]){
end = mid-1;
}else{
start = mid+1;
}
}
return start;
}
}

42.<!-- 33. Search in Rotated Sorted Array -->
class Solution {
public int search(int[] nums, int target) {
int index = searchInRotatedSA(nums,target);
return index;
}
static int searchInRotatedSA(int arr[], int target){
int start = 0;
int end = arr.length-1;
while(start<=end){
int mid = start + (end-start) / 2;
if(target==arr[mid]){
return mid;
}
else if(arr[start]<=arr[mid]){
if(arr[start]<=target && target<arr[mid]){
end = mid - 1;
} else{
start = mid+1;
}
}
else{
if(arr[end]>=target && target> arr[mid]){
start = mid + 1;
} else{
end = mid - 1;
}
}
}
return -1;
}
}

43.<!-- 268. Missing Number -->
class Solution {
public int missingNumber(int[] arr) {
int n = arr.length;
int res=0;
int sum = n \* (n+1)/2;
for(int i=0; i<n; i++){
res = res + arr[i];
}
return sum-res;
}
} 44.<!-- 209. Minimum Size Subarray Sum -->
class Solution {
public int minSubArrayLen(int target, int[] nums) {
//initially taking minLen as infinite(maximum)
int minLen = Integer.MAX_VALUE;
int curSum = 0;
// taking high low to track size of min subarray
int high = 0 , low = 0;
while(high<nums.length){
curSum += nums[high];
high++;
// when curSum >= targer find the len of that subarray
while(curSum>=target){
int curLen = high-low;
//consider as a minLen then try reducing the len of subarray further
if(curLen<minLen){
minLen = curLen;
}
curSum -= nums[low];
low++;
}
}
return (minLen==Integer.MAX_VALUE)?0:minLen;
}
} 45.<!-- 643. Maximum Average Subarray I -->
class Solution {
public double findMaxAverage(int[] nums, int k) {
//finding sum for starting window size of k(4)
int sum = 0;
for(int i = 0; i<k; i++){
sum += nums[i];
}
//consider first sum as a maximum sum
int maxSum = sum;
//taking start and end index to further move window size by 1
int startIndex = 0;
int endIndex = k;
while(endIndex<nums.length){
//at first sub the first element
sum -= nums[startIndex];
startIndex++;
//and then adding the next element to find max sum
sum += nums[endIndex];
endIndex++;
//checking previous sum with the current sum
maxSum = Math.max(sum,maxSum);
}
return (double)maxSum/k;
}
} 46.<!-- 1456. Maximum Number of Vowels in a Substring of Given Length -->
// i-> passes 100+ test cases but fails some.
class Solution {
public int maxVowels(String s, int k) {
int startIndex = 0;
int endIndex = k;
int maxVow = 0;
char[] str = s.toCharArray();
while(endIndex<=str.length){
int vow = 0;
for(int i=startIndex; i<endIndex; i++){
if(str[i]=='a' || str[i]=='o' || str[i]=='i' || str[i]=='e' || str[i]=='u'){
vow++;
}
}
maxVow = Math.max(vow,maxVow);
startIndex++;
endIndex++;
}
return maxVow;
}
}
<----------------OR------------------------>
class Solution {
public int maxVowels(String s, int k) {
int maxVow = 0 , winVow = 0;
Set<Character> vowels = new HashSet<>();
vowels.add('a');
vowels.add('e');
vowels.add('i');
vowels.add('o');
vowels.add('u');

        //count the no of vowels in first window.
        for(int i=0; i<k; i++){
            if(vowels.contains(s.charAt(i))){
                winVow++;
            }
        }
        maxVow = winVow;
        //Slide the window and update the maximum no of vowels.
        for(int i=k; i<s.length(); i++){
            if(vowels.contains(s.charAt(i - k)))
                winVow--;
            if(vowels.contains(s.charAt(i)))
                winVow++;
            maxVow = Math.max(winVow,maxVow);
        }
        return maxVow;
    }

} 47.<!-- 15. 3Sum -->
class Solution {
public List<List<Integer>> threeSum(int[] arr) {
// checkind edge cases bcz we want only triplets
if(arr == null || arr.length<3) return new ArrayList<>();
// now sort the elements;
Arrays.sort(arr);
//Create set to store list of integers
Set<List<Integer>> result = new HashSet<>();
//Loop till length-2 bcz we have to return a triplet
for(int i=0; i<arr.length-2; i++){
// we have to fix the first value so left starts from i+1
int left = i+1;
int right = arr.length-1;
while(left<right){
int sum = arr[i]+arr[left]+arr[right];
if(sum==0){
result.add(Arrays.asList(arr[i],arr[left],arr[right]));
left++;
right--;
} else if(sum<0){
left++;
} else{
right--;
}
}
}
return new ArrayList<>(result);
}
} 48.<!-- 16. 3Sum Closest -->
class Solution {
public int threeSumClosest(int[] arr, int target) {
Arrays.sort(arr);
// consider this sum as final
int resultSum = arr[0] + arr[1] + arr[2];
// finding minimum diff because min diff is the closest one to the target
int minDiff = Math.abs(resultSum - target);
for (int i = 0; i < arr.length - 2; i++) {
int left = i + 1;
int right = arr.length - 1;
while (left < right) {
int sum = arr[i] + arr[left] + arr[right];
if (sum == target) {
return sum;
} else if (sum < target) {
left++;
} else {
right--;
}
// checking if the current sum is smaller then the min one if it is then take it.
int diffToTarget = Math.abs(sum - target);
if (diffToTarget < minDiff) {
resultSum = sum;
minDiff = diffToTarget;
}
}
}
return resultSum;
}
} 49.<!-- 56. Merge Intervals -->
class Solution {
public int[][] merge(int[][] intervals) {
// If there is only one interval or no intervals, return the input as no merging is needed
if (intervals.length <= 1) {
return intervals;
}

        // Sort intervals based on the start times (interval[0])
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        // List to store the merged intervals
        List<int[]> result = new ArrayList<>();

        // Start with the first interval
        int[] newInterval = intervals[0];
        result.add(newInterval);

        // Iterate through all intervals
        for (int[] interval : intervals) {
            // If the current interval overlaps with the last added interval, merge them
            if (interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            } else {
                // Otherwise, add the current interval as a new interval
                newInterval = interval;
                result.add(newInterval);
            }
        }

        // Convert the list to an array and return the merged intervals
        return result.toArray(new int[result.size()][]);
    }

} 50.<!-- 11. Container With Most Water -->
class Solution {
public int maxArea(int[] height) {
int maxAr = 0;
int start = 0;
int end = height.length-1;
while(start<end){
int h = Math.min(height[start],height[end]);
int breadth = end - start;
int area = h \* breadth;
maxAr = Math.max(area,maxAr);
if(height[start]<height[end]){
start++;
}else{
end--;
}
}
return maxAr;
}
} 51.<!-- 54. Spiral Matrix -->
class Solution {
public List<Integer> spiralOrder(int[][] matrix) {
// Create a list to store the spiral order
ArrayList<Integer> spiral = new ArrayList<Integer>();

        // Initialize row and column boundaries
        int rb = 0;            // Starting row index
        int re = matrix.length - 1; // Ending row index
        int cb = 0;            // Starting column index
        int ce = matrix[0].length - 1; // Ending column index

        // Continue while there are rows and columns left to process
        while (rb <= re && cb <= ce) {
            // Traverse from left to right across the top row
            for (int i = cb; i <= ce; i++)
                spiral.add(matrix[rb][i]);
            rb++; // Move the top boundary down

            // Traverse from top to bottom down the right column
            for (int i = rb; i <= re; i++)
                spiral.add(matrix[i][ce]);
            ce--; // Move the right boundary left

            // Check if there are remaining rows before traversing from right to left
            if (rb <= re) {
                // Traverse from right to left across the bottom row
                for (int i = ce; i >= cb; i--)
                    spiral.add(matrix[re][i]);
                re--; // Move the bottom boundary up
            }

            // Check if there are remaining columns before traversing from bottom to top
            if (cb <= ce) {
                // Traverse from bottom to top up the left column
                for (int i = re; i >= rb; i--)
                    spiral.add(matrix[i][cb]);
                cb++; // Move the left boundary right
            }
        }

        // Return the spiral order as a list
        return spiral;
    }

}

52.<!-- 151. Reverse Words in a String -->
// using stringBuilder and normal method using split() method.
static void reverseWords(String str){
String arr[] = str.split(" ");
// String res = "";
StringBuilder res = new StringBuilder();
for(int i=arr.length-1; i>=0; i--){
if (arr[i].length()==0) {
continue;
}
if (res.length()==0) {
// res += arr[i];
res.append(arr[i]);
}else{
// res += " " + arr[i];
res.append(" ");
res.append(arr[i]);
}
}
System.out.println(res.toString());
}
<--------------OR------------------>
class Solution {
public String reverseWords(String str) {
StringBuilder res = new StringBuilder();
int stIndx = str.length()-1;
while (stIndx>=0) {
while (stIndx>=0 && str.charAt(stIndx)==' ') {
stIndx--;
}
if (stIndx<0) {
break;
}
int endIndx = stIndx;
while (stIndx>=0 && str.charAt(stIndx) != ' ') {
stIndx--;
}
if (res.length()==0) {
res.append(str.substring(stIndx+1, endIndx+1));
}else{
res.append(" ");
res.append(str.substring(stIndx+1, endIndx+1));
}
}
return res.toString();
}
}

53.<!-- 242. Valid Anagram -->
class Solution {
public boolean isAnagram(String s, String t) {
if (s.length()!=t.length()) {
return false;
}
int[] freq = new int[26];
int indxA = 0;
int indxB = 0;
int len = s.length();
while (indxA<len && indxB<len) {
char charA = s.charAt(indxA);
int freqA = charA-97;
freq[freqA]++;
char charB = t.charAt(indxB);
int freqB = charB-97;
freq[freqB]--;

            indxA++;
            indxB++;

        }
        for(int i=0; i<26; i++){
            if (freq[i]!=0) {
                return false;
            }
        }
        return true;
    }

}

54.<!-- 557. Reverse Words in a String III -->
class Solution {
static void reverWords(char arr[],int st, int end){
while(st<end){
char temp = arr[st];
arr[st] = arr[end];
arr[end] = temp;
st++;
end--;
}
}
public String reverseWords(String s) {
char[] arr = s.toCharArray();
int len = arr.length;
int stPointer = 0;
for(int endPointer = 0; endPointer<=len; endPointer++){
if(endPointer == len || arr[endPointer] == ' '){
reverWords(arr,stPointer,endPointer-1);
stPointer = endPointer+1;
}
}
return new String(arr);
}
}

55.<!-- 507. Perfect Number -->
class Solution {
public boolean checkPerfectNumber(int num) {
if(num==1)
return false;
int counter = 1;
int sqRoot = (int)Math.sqrt(num);
int sum=0;
while(counter<=sqRoot){
if(num%counter==0){
sum+=counter;
int otherNo = num/counter;
if(otherNo!=num && otherNo!=counter){
sum+=otherNo;
}
}
counter++;
}
if(sum==num){
return true;
}
return false;
}
}

56.<!-- 2180. Count Integers With Even Digit Sum -->
class Solution {
public int countEven(int num) {
int count = 0;
for(int i=1; i<=num; i++){
int sum = 0;
int temp = i;
while(temp>0){
int rem = temp%10;
sum += rem;
temp = temp/10;
}
if(sum%2==0){
count++;
}
}
return count;
}
}

57.<!-- 2553. Separate the Digits in an Array -->
class Solution {
public int[] separateDigits(int[] nums) {
ArrayList<Integer> result = new ArrayList<>();
for(int i=nums.length-1; i>=0; i--){
int temp = nums[i];
while(temp>0){
int rem = temp%10;
result.add(rem);
temp = temp/10;
}
}
int arr[] = new int[result.size()];
int k=0;
for(int i=result.size()-1; i>=0; i--){
arr[k] = result.get(i);
k++;
}
return arr;
}
}

58.<!-- 728. Self Dividing Numbers -->
class Solution {
public List<Integer> selfDividingNumbers(int left, int right) {
ArrayList<Integer> result = new ArrayList<>();
for(int i=left; i<=right; i++){
if(i<10){
result.add(i);
}
int temp = i;
if(temp>9){
while(temp>0){
int rem = temp%10;
if(rem>0 && i%rem==0){
temp /= 10;
}else{
break;
}
}
}
if(temp<=0)
result.add(i);
}
return result;
}
}

59.<!-- 20. Valid Parentheses -->
class Solution {
public boolean isValid(String s) {
int n = s.length();
if(n%2!=0){
return false;
}
Stack<Character> stack = new Stack<>();
for(int i=0; i<n; i++){
char ch = s.charAt(i);
if(ch=='(' || ch=='[' || ch=='{'){
stack.push(ch);
}else{
if(stack.isEmpty())
return false;
char top = stack.peek();
if(ch==')' && top!='(')
return false;
else if(ch==']' && top!='[')
return false;
else if(ch=='}' && top!='{')
return false;
else
stack.pop();
}
}
return stack.size()==0;
}
}

60.<!-- 921. Minimum Add to Make Parentheses Valid -->
class Solution {
public int minAddToMakeValid(String s) {
int n = s.length();
int open = 0 , close = 0;
for(int i=0; i<n; i++){
char ch = s.charAt(i);
if(ch=='('){
open++;
}else{
if(ch==')' && open<=0){
close++;
}else{
open--;
}
}
}
return open+close;

    }

}
<----------------------------OR using stack----------------------------------->
class Solution {
public int minAddToMakeValid(String s) {
Stack<Character> stack = new Stack<>();
for(int i=0; i<s.length(); i++){
char ch = s.charAt(i);
if(ch=='('){
stack.push(ch);
}else{
if(stack.isEmpty() || stack.peek()==')'){
stack.push(ch);
}else{
stack.pop();
}
}
}
return stack.size();
}
}

61.<!-- 1963. Minimum Number of Swaps to Make the String Balanced -->
class Solution {
public int minSwaps(String s) {
int open = 0 , close = 0;
int n = s.length();
for(int i=0; i<n; i++){
char ch = s.charAt(i);
if(ch=='['){
open++;
}else{
if(open<=0 && ch==']'){
close++;
}else{
open--;
}
}
}
return (close+1)/2;
}
}

62.<!-- 735. Asteroid Collision -->
class Solution {
public int[] asteroidCollision(int[] asteroids) {
// Stack to keep track of the asteroids' states after collisions
Stack<Integer> stack = new Stack<>();

        // Iterate over all asteroids in the input array
        for (int i = 0; i < asteroids.length; i++) {
            // If the stack is empty or the current asteroid is moving to the right (positive value)
            if (stack.isEmpty() || asteroids[i] > 0) {
                // Push the asteroid onto the stack as no collision happens
                stack.push(asteroids[i]);
            } else {
                // Handle a collision scenario where the current asteroid is moving left (negative value)
                while (!stack.isEmpty()) {
                    int top = stack.peek();  // Get the top asteroid from the stack

                    // If the top of the stack is also moving left (negative), push the current asteroid
                    if (top < 0) {
                        stack.push(asteroids[i]);
                        break;
                    }

                    // Get the absolute value of the current asteroid (moving left)
                    int modVal = Math.abs(asteroids[i]);

                    // If the top of the stack is equal in size but opposite in direction, both explode
                    if (modVal == top) {
                        stack.pop(); // Remove the top asteroid from the stack
                        break;
                    }
                    // If the current asteroid is smaller, it explodes, no further action needed
                    else if (modVal < top) {
                        break;
                    }
                    // If the current asteroid is larger, the top asteroid explodes
                    else {
                        stack.pop(); // Remove the smaller right-moving asteroid from the stack
                        // If stack becomes empty, push the current asteroid (no more collisions)
                        if (stack.isEmpty()) {
                            stack.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }

        // Transfer the remaining asteroids from the stack to the result array
        int len = stack.size();
        int[] newArr = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            newArr[i] = stack.pop(); // Populate the array in reverse order
        }

        return newArr; // Return the final state of asteroids after all collisions
    }

}

63.<!-- 901. Online Stock Span -->
class StockSpanner {
Stack<Integer> stack; // Stack to store indices of previous prices
ArrayList<Integer> list; // List to store all stock prices

    // Constructor to initialize the stack and list
    public StockSpanner() {
        stack = new Stack<>();
        list = new ArrayList<>();
    }

    // Method to calculate stock span for the given price
    public int next(int price) {
        list.add(price);  // Add current price to the list
        // Pop elements from stack while top of stack is less than or equal to current price
        while(!stack.isEmpty() && list.get(stack.peek()) <= price){
            stack.pop();
        }
        // If stack is empty, there is no previous greater element
        int prevGreaterEle = (stack.isEmpty()) ? -1 : stack.peek();
        int currEle = list.size() - 1;  // Current index
        int ans = currEle - prevGreaterEle;  // Calculate span
        stack.push(currEle);  // Push current index to stack
        return ans;  // Return span
    }

}

64.<!-- Next Greater Element --> GFG
class Solution
{
// Function to find the next greater element for each element of the array.
public static long[] nextLargerElement(long[] arr, int n)
{
Stack<Long> stack = new Stack<>(); // Stack to keep track of next greater elements
long[] res = new long[n]; // Array to store results

        // Traverse the array from right to left
        for(int i = n-1; i>=0; i--){

            // Remove elements from stack smaller or equal to the current element
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }

            // If stack is empty, no greater element, otherwise get top of stack
            if(stack.isEmpty()){
                res[i] = -1;  // No greater element found
            }else{
                res[i] = stack.peek();  // Next greater element is on top of the stack
            }

            // Push the current element into the stack
            stack.push(arr[i]);
        }

        return res;  // Return the array with next greater elements
    }

}

65.<!-- Help Classmates --> GFG
class Solution
{
//Function to find the next greater element for each element of the array.
public static long[] nextLargerElement(long[] arr, int n)
{
Stack<Long> stack = new Stack<>();
long[] res = new long[n];
for(int i = n-1; i>=0; i--){
while(!stack.isEmpty() && stack.peek()<=arr[i]){
stack.pop();
}
if(stack.isEmpty()){
res[i] = -1;
}else{
res[i] = stack.peek();
}
stack.push(arr[i]);
}
return res;
}
}

66.<!-- 503. Next Greater Element II -->
class Solution {
// Function to find the next greater element in a circular array.
public int[] nextGreaterElements(int[] arr) {
int n = arr.length; // Get the length of the array
Stack<Integer> stack = new Stack<>(); // Stack to track next greater elements
int[] res = new int[n]; // Result array to store next greater elements

        // Traverse the array twice to simulate the circular behavior
        for (int i = n * 2 - 1; i >= 0; i--) {

            // Remove elements from stack smaller or equal to the current element
            while (!stack.isEmpty() && stack.peek() <= arr[i % n]) {
                stack.pop();
            }

            // If we are in the first pass, assign results
            if (i < n) {
                // If stack is empty, no greater element; otherwise, get the top of the stack
                if (stack.isEmpty()) {
                    res[i] = -1;  // No greater element found
                } else {
                    res[i] = stack.peek();  // Next greater element is on top of the stack
                }
            }

            // Push the current element into the stack (using mod to simulate circular array)
            stack.push(arr[i % n]);
        }

        return res;  // Return the array with next greater elements
    }

}

67.<!-- 32. Longest Valid Parentheses -->
class Solution {
// Function to find the length of the longest valid parentheses substring
public int longestValidParentheses(String s) {
Stack<Integer> stack = new Stack<>(); // Stack to store indices of parentheses
int max = 0; // Variable to store the maximum length of valid parentheses
stack.push(-1); // Push a base index to handle edge cases

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If current character is '(', push its index onto the stack
            if (ch == '(') {
                stack.push(i);
            } else {
                // If current character is ')', pop from the stack
                stack.pop();

                // If stack is empty, push current index to mark the new base
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    // Calculate the length of the valid parentheses and update max
                    max = Math.max(max, i - stack.peek());
                }
            }
        }
        return max;  // Return the length of the longest valid parentheses substring
    }

} 68.<!-- 1281. Subtract the Product and Sum of Digits of an Integer -->
class Solution {
public int subtractProductAndSum(int num) {
int sum = 0;
int prod = 1;
while(num>0){
int rem = num%10;
sum += rem;
prod \*= rem;
num /= 10;
}
return prod - sum;

    }

} 69.<!-- 704. Binary Search -->
class Solution {
public int search(int[] nums, int target) {
int start = 0 , end = nums.length-1;
while(start<=end){
int mid = start + (end-start)/2;
if(nums[mid]==target){
return mid;
}else if(nums[mid]<target){
start = mid+1;
}else{
end = mid-1;
}
}
return -1;
}
}

70.<!-- 53. Maximum Subarray -->
class Solution {
// Method to find the maximum sum subarray
public int maxSubArray(int[] nums) {
// Initialize currMax and maxSoFar with the first element of the array
int currMax = nums[0];
int maxSoFar = nums[0];

        // Iterate through the array starting from the second element
        for(int i = 1; i < nums.length; i++) {
            // Update currMax to the maximum of current element or current element + currMax
            currMax = Math.max(nums[i], (currMax + nums[i]));
            // Update maxSoFar to the maximum of currMax or maxSoFar
            maxSoFar = Math.max(currMax, maxSoFar);
        }

        // Return the maximum sum subarray found
        return maxSoFar;
    }

}

71.<!-- 283. Move Zeroes -->
class Solution {
// Method to move all zeros to the end of the array
public void moveZeroes(int[] arr) {
int insertPos = 0; // Position to insert non-zero elements

        // Iterate through the array
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) { // Check if the current element is non-zero
                arr[insertPos] = arr[i]; // Insert the non-zero element at insertPos
                insertPos++; // Increment insertPos
            }
        }

        // Fill the rest of the array with zeros
        while(insertPos < arr.length) {
            arr[insertPos++] = 0;
        }
    }

}

72.<!-- 448. Find All Numbers Disappeared in an Array -->
class Solution {
// Method to find all numbers that disappeared in an array
public List<Integer> findDisappearedNumbers(int[] nums) {
List<Integer> result = new ArrayList<>(); // List to store the missing numbers

        // Mark each number's corresponding index as visited by making it negative
        for(int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1; // Calculate index
            if(nums[idx] < 0) {
                continue; // Skip if already marked
            }
            nums[idx] *= -1; // Mark as visited
        }

        // Collect all indices that are still positive (unvisited)
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0) {
                continue; // Skip if marked
            }
            result.add(i + 1); // Add the missing number to the result list
        }

        return result; // Return the list of missing numbers
    }

}
<--------------------------OR-------------------------------------->
class Solution {
static void swap(int arr[],int idx1, int idx2){
int temp = arr[idx1];
arr[idx1] = arr[idx2];
arr[idx2] = temp;
}
static void cycleSort(int arr[]){
int index = 0;
int n = arr.length;
while(index<n){
int element = arr[index];
int actualPos = element-1;
if(arr[index]!=arr[actualPos]){
swap(arr,index,actualPos);
}else{
index++;
}
}
}
public List<Integer> findDisappearedNumbers(int[] nums) {
List<Integer> result = new ArrayList<>();
cycleSort(nums);
for(int i=0; i<nums.length; i++){
if(nums[i]!=i+1){
result.add(i+1);
}
}
return result;
}
}

73.<!-- 287. Find the Duplicate Number -->
class Solution {
public int findDuplicate(int[] nums) {
for(int i=0; i<nums.length; i++){
int element = Math.abs(nums[i]);
int actualIdx = element - 1;
if(nums[actualIdx]<0){
return element;
}
nums[actualIdx] = nums[actualIdx] _ -1;
}
return -1;
}
}
<-----------------------OR----------------------------->
class Solution {
static void swap(int arr[],int idx1, int idx2){
int temp = arr[idx1];
arr[idx1] = arr[idx2];
arr[idx2] = temp;
}
static void cycleSort(int arr[]){
int index = 0;
int n = arr.length;
while(index<n){
int element = arr[index];
int actualPos = element-1;
if(arr[index]!=arr[actualPos]){
swap(arr,index,actualPos);
}else{
index++;
}
}
}
public int findDuplicate(int[] nums) {
cycleSort(nums);
for(int i=0; i<nums.length; i++){
if(nums[i]!=i+1){
return nums[i];
}
}
return -1;
}
} 74.<!-- 442. Find All Duplicates in an Array -->
class Solution {
public List<Integer> findDuplicates(int[] nums) {
List<Integer> result = new ArrayList<>();
for(int i=0; i<nums.length; i++){
int element = Math.abs(nums[i]);
int actualIdx = element - 1;
if(nums[actualIdx]<0){
result.add(element);
}
nums[actualIdx] = nums[actualIdx] _ -1;
}
return result;
}
}
<--------------------------OR-------------------------->
class Solution {
static void swap(int arr[],int idx1, int idx2){
int temp = arr[idx1];
arr[idx1] = arr[idx2];
arr[idx2] = temp;
}
static void cycleSort(int arr[]){
int index = 0;
int n = arr.length;
while(index<n){
int element = arr[index];
int actualPos = element-1;
if(arr[index]!=arr[actualPos]){
swap(arr,index,actualPos);
}else{
index++;
}
}
}
public List<Integer> findDuplicates(int[] nums) {
List<Integer> result = new ArrayList<>();
cycleSort(nums);
for(int i=0; i<nums.length; i++){
if(nums[i]!=i+1){
result.add(nums[i]);
}
}
return result;
}
}
