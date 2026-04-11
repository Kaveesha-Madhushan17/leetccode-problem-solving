package p002_validAnagram_leetcode_no_242;

public class validAnagram {

    // anagram is a word that can be created another word using same characters
    // there are 2,3 methods to solve this but best method is this
    // other methods like sorted 2 of the given words and compare both are equals using Array.equals() method but here it would take O(nlog(n)) time complexity
    // with this approach we could only get O(n) only

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";

        boolean result =  isAnagram(s,t);
        System.out.printf("is this anagram = %s", result ? "yes":"no");
    }

    public static boolean isAnagram(String s , String t){

        int[] arr = new int[26];

        //if the length doesn't equals then not a anagram
        if (s.length() != t.length()) return false;

        for (int i=0; i<s.length();i++){
            arr[s.charAt(i) - 'a']++; // add the number respected to the asccii value to the array
            arr[t.charAt(i) - 'a']--; // decrease the value in the arr when we are iterating
        }

        for(int i=0; i<arr.length;i++){
            if(arr[i]!=0) return false; // check all are zero because when we are incrementing the value and after decrementing them if the equals values came it would like (+value - value = 0) for all the slots
        }
        return true;
    }
}
