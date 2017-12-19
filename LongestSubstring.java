package leetcode;

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
	  // iterator the string and retrieve the no-repeat substring, 
	  // when there is a repeat character, start from the following letter of the old duplicate letter
	  String subString = "";
	  int longestLength = 0;
	  if (s == null || s.length() == 0) 
	  {
        return 0;
      }
	  if (s.length() ==1 )
	  {
	    return 1;
	  }
	  for (int i=0;i<s.length();i++){
        String currentLetter = s.substring( i, i+1 );
        if ( subString.contains( currentLetter ) )
        {
          subString = subString.substring( subString.indexOf( currentLetter ) + 1 ) + currentLetter;
          longestLength = Integer.max( longestLength, subString.length() );
        }
        else
        {
          subString = subString + currentLetter;
          longestLength = Integer.max( longestLength, subString.length() );
        }
      }
      
      return longestLength;
	}
	
	public static void main(String[] args) {
		String string = "dvdf";
		LongestSubstring testSample = new LongestSubstring();
		System.out.println(testSample.lengthOfLongestSubstring(string));
	}
}
