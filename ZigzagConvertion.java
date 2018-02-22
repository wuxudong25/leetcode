package leetcode;

public class ZigzagConvertion
{
  public String convert(String s, int numRows) {
    if (numRows <= 1 || numRows >= s.length())
    {
      return s;
    }
    char[] char_array = s.toCharArray();
    char[] result_array = new char[char_array.length];
    int k = 0;
    for (int i=0;i<numRows;i++)
    {
      int j = i;
      while ( j < char_array.length )
      {
        result_array[k] = char_array[j];
        j += (numRows-i-1)*2;
        if ( (numRows-i-1)*2 > 0 )
        {
          k++;
        }
        if ( j < char_array.length )
        {
          result_array[k] = char_array[j];
          j += i*2;
          if ( i*2 > 0 )
          {
            k++;
          }
        }
      }
    }
    return new String( result_array );
  }
  
  public static void main( String[] args )
  {
    ZigzagConvertion example = new ZigzagConvertion();
    System.out.println( example.convert( "PAYPALISHIRING", 2 ) );
  }
}
