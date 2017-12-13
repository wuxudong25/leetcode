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
		// iterator the string and retrieve the no-repeat substring, start a new one when there is a repeat character, then return the longest length
	  
		
    }
	
	public static void main(String[] args) {
		String string = "abcabcdebcaaa";
		LongestSubstring testSample = new LongestSubstring();
		System.out.println(testSample.lengthOfLongestSubstring(string));
	}
}
