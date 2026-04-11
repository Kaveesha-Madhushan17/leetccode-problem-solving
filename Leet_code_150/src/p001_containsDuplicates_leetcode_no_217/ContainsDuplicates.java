package p001_containsDuplicates_leetcode_no_217;
import java.util.HashSet;

class ContainsDuplicates {

    // this is leet code problem no 217 and , we can do this using 1st sort the array and after go through it to find
    // any adjacent equal numbers but it would take atleast O(nlogn) therefore this method using here
    // which is that we get the number list and when we found the new number we add it to a hash set fast lookup O(1)  and if again iterating we could check the
    // if already the hash set includes next numbers and if it is we simply say we found a duplicate it would take only O(n) time

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 4};
        boolean result = isDuplicate(nums);
        System.out.printf("The array has duplicate : %s", result ? "yes" : "no");

    }
    public static boolean isDuplicate(int[] nums) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int num : nums) {
            if (uniqueNumbers.contains(num)) {
                return true;
            }
            uniqueNumbers.add(num);
        }
        return false;
    }
}