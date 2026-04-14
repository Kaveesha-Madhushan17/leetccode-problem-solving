package p004_Twosums_leetcode_no_01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = findTwoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findTwoSum(int[] nums ,int target) {

        // get the hash table and add the values included in the nums , while adding them we check the target will find using the O(1) property of the hashtable
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length; i++){
            int  complement = target - nums[i]; // find the relevent number is in the hashtable
            if(map.containsKey(complement)) return new int[] {map.get(complement), i}; // is found we get the answer -> target = nums[i] + complement
            map.put(nums[i] , i);
        }
        return new  int[] {};
    }
}
