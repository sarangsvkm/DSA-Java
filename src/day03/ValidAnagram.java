package day03;

//Check if two strings are anagrams
//
//Input: "listen", "silent"


import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        if(s.length() != t.length()) {
            System.out.println(false);
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()) {
            if(!map.containsKey(c) || map.get(c) == 0) {
                System.out.println(false);
                return;
            }
            map.put(c, map.get(c) - 1);
        }

        System.out.println(true);
    }
}

//Output: true
//⏱ Complexity
//Time: O(n)
//Space: O(n)