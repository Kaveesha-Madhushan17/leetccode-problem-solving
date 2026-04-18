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
        if (strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
        int[] count = new int[26];

        for(int i=0;i<strs.length;i++){
            Arrays.fill(count,0);
            for(char chr : strs[i].toCharArray()){
                count[chr-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<26;j++){
               sb.append("#");
               sb.append(count[j]);
            }
            String key = sb.toString();
            if(!map.containsKey(key)) map.put(key,new ArrayList<>());
            map.get(key).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
