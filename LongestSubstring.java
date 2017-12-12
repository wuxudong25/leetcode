package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

//Given a string, find the length of the longest substring without repeating characters.
//
//Examples:
//
//Given "abcabcbb", the answer is "abc", which the length is 3.
//
//Given "bbbbb", the answer is "b", with the length of 1.
//
//Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

public class LongestSubstring {
	public int lengthOfLongestSubstring(String s) {
		// not completed yet
        //use a hashmap to collect the locations of each letter, 
		//the length should be the shortest one of each letter's longest gap
		//return zero if s is null, return s.length() if no duplicate letter
		Map<String, Set<Integer>> stringMap = new HashMap<>();
		Set<Integer> occuranceSet;
		for (int i=0;i<s.length();i++){
			String currentString = s.substring(i, i+1);
			if (!stringMap.containsKey(currentString)) {
				occuranceSet = new TreeSet<>();
				occuranceSet.add(new Integer(i));
			}
			else {
				occuranceSet = stringMap.get(currentString);
				occuranceSet.add(new Integer(i));
			}
			stringMap.put(currentString, occuranceSet);
		}
		
		Iterator iterator = stringMap.keySet().iterator();
		Integer location, preLocation, currentGap, gap;
		location = 0;
		preLocation = 0;
		currentGap = -1;
		gap = -1;
		while (iterator.hasNext()) {
			Object key = iterator.next();
			Set<Integer> currentSet = stringMap.get(key);
			Iterator setItrator = currentSet.iterator();
			location = 0;
			preLocation = 0;
			currentGap = -1;
			while (setItrator.hasNext()){
				preLocation = location;
				location = (Integer) setItrator.next();
				if (currentGap == -1) {
					currentGap = location;
				}
				else {
					currentGap = Integer.max(currentGap, location - preLocation);
				}
			}
			gap = gap == -1? currentGap : Integer.min(gap, currentGap);
		}
		
		return gap.intValue();
    }
	
	public static void main(String[] args) {
		String string = "abcabcde";
		LongestSubstring testSample = new LongestSubstring();
		System.out.println(testSample.lengthOfLongestSubstring(string));
	}
}
