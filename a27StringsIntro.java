// variables goes in stack memory whereas objects(array,Strings) goes in heap memory

import java.util.Arrays;

public class a27StringsIntro {    

    public static void main(String[] args) {
        // 1- to print all subString of a string
        // printAllSubstring("abc");

        // 2-reverse a string
        // reverseString1("hello");
        // reverseString2("world");
        // reverseString3("helloworld");

        // 3-check palindrome
        boolean res = isPalindrome("NAMAN");
        // System.out.println(res);

        // 4-reverse words in a string (leetcode 151)
        // reverseWords("the sky is blue");
        // reverseWords1("the sky is blue");

        // 5-Check if two strings are anagram or not(leetcode242)
        boolean isAnagram = validAnagram("anagram","nagaram");
        // System.out.println(isAnagram);
        boolean validAnagramOpt = validAnagram("anagram","nagaram");
        System.out.println(validAnagramOpt);


    }
    // 1- to print all subString of a string
    static void printAllSubstring(String str){
        int n=str.length();
        for(int stIndx=0; stIndx<n; stIndx++){
            for(int endIndx=stIndx+1; endIndx<=n; endIndx++){
                System.out.println(str.substring(stIndx, endIndx));
            }
        }
    }

    // 2-reverse a string
    static void reverseString1(String str){
        String ans = "";
        for(int i=0; i<str.length(); i++){
            ans = str.charAt(i) + ans;
        }
        System.out.println(ans);
    }
    // reverseString2
    static void reverseString2(String str){
        int n = str.length();
        StringBuilder ans = new StringBuilder(str);
        for(int i=0; i<n/2; i++){
            char firstChar = ans.charAt(i);
            char lastChar = ans.charAt(n-1-i);
            ans.setCharAt(i, lastChar);
            ans.setCharAt(n-1-i, firstChar);
        }
        System.out.println(ans.toString());
    }
    // reverseString3
    static void reverseString3(String str){
        char[] ans = str.toCharArray();
        int n = ans.length;
        for(int i=0; i<n/2; i++){
            char temp = ans[i];
            ans[i] = ans[n-1-i];
            ans[n-1-i] = temp;
        }
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]);
        }
    }

    // 3-CheckPalindrome
    static boolean isPalindrome(String str){
        // if u want to make it case-insensitive
        // String str = s.toLowerCase();

        // by default it is case sensitive 
        int st = 0;
        int end = str.length()-1;
        while (st<end) {
            if (str.charAt(st) != str.charAt(end)) {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }

    // 4-reverse words in a string (leetcode 151)
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
    // without using split() mehtod[optimized]
    static void reverseWords1(String str){
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
        System.out.println(res.toString());
    }

    // 5-Check if two strings are anagrams or not
    //brute force approach.
    static boolean validAnagram(String s, String t){
        if (s.length()!=t.length()) {
            return false;
        }
        char[] arrA = s.toCharArray();
        char[] arrB = t.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        int len = arrA.length;
        int i = 0;
        while (i<len) {
            if (arrA[i]!=arrB[i]) {
                return false;
            }
            i++;
        }
        return true;
    }
    //optimized without sorting.
    static boolean validAnagramOpt(String s, String t){
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