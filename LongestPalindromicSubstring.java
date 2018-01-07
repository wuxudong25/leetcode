package leetcode;

//Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
//
//Example:
//
//Input: "babad"
//
//Output: "bab"
//
//Note: "aba" is also a valid answer.
//Example:
//
//Input: "cbbd"
//
//Output: "bb"

public class LongestPalindromicSubstring {
	// to do, still got out of bound exception, need more investigate
	public String longestPalindrome(String s) {
		if (s.length() <= 1) {
			return s;
		}
		String str = new String("");
		String longest = new String("");

		for (int i = 0; i < s.length(); i++) {
			str = getPalindrome(s, i, i);
			if (longest.length() < str.length()) {
				longest = str;
			}
			str = getPalindrome(s, i, i + 1);
			if (longest.length() < str.length()) {
				longest = str;
			}
		}

		return longest;
	}

	public String getPalindrome(String s, int left, int right) {
		while (left >= 0 && right < s.length()-1 && s.substring(left, left + 1).equals(s.substring(right, right + 1))) {
			left--;
			right++;
		}
		return s.substring(left+1, right-left+1);
	}

	public static void main(String[] args) {
		LongestPalindromicSubstring example = new LongestPalindromicSubstring();
		System.out.println(example.longestPalindrome("abacdfgdcaba"));
	}
}
