package leetcode;

public class PalindromeNumber
{
  public boolean isPalindrome(int x) {
    //I choose another way that different from reverse integer, while after all I found reverse integer is the better solution
    if (x<0 || x==Integer.MAX_VALUE)
    {
      return false;
    }
    int[] big_array = {9,99,999,9999,99999,999999,9999999,99999999,999999999,Integer.MAX_VALUE};
    int xLength = 0;
    for (int i=0;i<big_array.length;i++)
    {
      if (Math.abs( x )<=big_array[i])
      {
        xLength = i+1;
        break;
      }
    }
      
    int[] result_array = new int[xLength/2];
    
    for (int i=0;i<xLength/2;i++)
    {
      result_array[i] = x%10;
      x = x/10;
    }
    if (xLength%2 == 1)
    {
      x=x/10;
    }
    
    for (int i=0;i<xLength/2;i++)
    {
      if (result_array[xLength/2-i-1] != x%10)
      {
        return false;
      }
      x = x/10;
    }
    return true;
  }
  
  public static void main( String[] args )
  {
    PalindromeNumber example = new PalindromeNumber();
    System.out.println( example.isPalindrome( 1000000001 ) );
  }
}
