package p003_GroupAnagrams_leetcode_no_49;

import java.util.*;

public class GroupAnagram {

    public static void main(String[] args) {

        // these are some strings but not in the order we have to grouped them
        String[] strs = {"eat", "ten", "tan", "ate", "nat" , "bat"};

        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        // if the length is zero of the strs array return an empty array
        if (strs.length == 0) {
            return new ArrayList<>();
        }

        // create a hashmap for the store the each string in the strs array with having same key value
        Map<String, List<String>> map = new HashMap<>();
        int[] count = new int[26];

        for(int i=0;i<strs.length;i++){

            // get an count array and fill it as zeros in all the iteration through the all the strings in the strs array
            Arrays.fill(count,0);

            //get the character one by one from the one string of the strs array
            for(char chr : strs[i].toCharArray()){
                count[chr-'a']++; // add the count array and have a unique code for the count array
            }
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<26;j++){
               sb.append("#"); // to identify the each value seperately like 11 and 1 and 1
               sb.append(count[j]); // add the count j th value in the string builder object
            }
            String key = sb.toString(); // finally generate a string
            if(!map.containsKey(key)) map.put(key,new ArrayList<>()); // if there is no key seen before add new key and empty array list
            map.get(key).add(strs[i]); // get the key and add the strs[i] th string to the array list of that key
        }
        return new ArrayList<>(map.values()); // finally return the values as an array list
    }
}
