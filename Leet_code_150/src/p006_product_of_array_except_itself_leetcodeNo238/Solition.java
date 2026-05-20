package p006_product_of_array_except_itself_leetcodeNo238;

import java.util.Arrays;

public class Solition {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] array = productOfArrays(nums);
        System.out.println(Arrays.toString(array));

    }

    public static int[] productOfArrays(int[] nums){

        int[] result = new int[nums.length];
        Arrays.fill(result,1);
        int prev=1,post =1;

        for(int i=0; i<nums.length ; i++){
            result[i] = prev;
            prev = prev * nums[i];
            
        }

        for(int i = nums.length-1;i>=0;i--){
            result[i] = result[i]*post;
            post=post*nums[i];
        }

        return result;
    }
}
