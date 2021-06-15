package com.prashant.codechef.problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClearWaterPerfectSubString {

	
	public static void main(String[] args) {
		System.out.println("Count of perfect subStrings are : " + perfectSubstring("1102021222", 2)); //return 6
		System.out.println("Count of perfect subStrings are : " +
		    perfectSubstring("13434", 7));//return 0
    	System.out.println("Count of perfect subStrings are : " +
	    perfectSubstring("113222", 2));//return 4
		
	}
	
	static int perfectSubstring(String s, int k) {

        int finalCount = 0;

        /*
         * Set the initial starting index for the subarray as 0, and increment it with
         * every iteration, till the last index of the string is reached.
         */
        for (int start = 0; start < s.length(); start++) {

            /*
             * Use a HashMap to store the count of every character in the subarray. We'll
             * start with an empty map everytime we update the starting index
             */
            Map<Character, Integer> frequencyMap = new HashMap<>();

            /*
             * Set the initial ending index for the subarray equal to the starting index and
             * increment it with every iteration, till the last index of the string is
             * reached.
             */
            for (int end = start; end < s.length(); end++) {
                /*
                 * Get the count of the character at end index and increase it by 1. If the
                 * character is not present in the map, use 0 as the default count
                 */
                 
                 //1102021222
                char c = s.charAt(end); //1
                int count = frequencyMap.getOrDefault(c, 0);
                frequencyMap.put(c, count + 1); //(1,1)

                /*
                 * Check if the length of the subarray equals the desired length. The desired
                 * length is the number of unique characters we've seen so far (size of the map)
                 * multilied by k (the number of times each character should occur). If the
                 * length is as per requiremets, check if each element occurs exactly k times
                 */
                 
                 //1102021222 
                // if (frequencyMap.size() * k == (end - start + 1)) { //3* 2 ==(end-start +1)
                    if (check(frequencyMap, k)) {
                        finalCount++;
                    }
                //}
            }
        }
        return finalCount;
    }

    /**
     * Returns true if every value in the map is equal to k
     * 
     * @param map The map whose values are to be checked
     * @param k   The required value for keys in the map
     * @return true if every value in the map is equal to k
     */
    static boolean check(Map<Character, Integer> map, int k) {
        /*
         * Iterate through all the values (frequency of each character), comparing them
         * with k
         */
        for (Integer i : map.values()) {
            if (i != k) {
                return false;
            }
        }
        return true;
    }
