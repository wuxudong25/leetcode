package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger
{
  public int romanToInt( String s )
  {
    //the count should be started from the end of string, 
    // as the 1 based elements only mean minus when shown before the same level of 5or10 based elements
    int num = 0;
    Map<String, Integer> romanMap = new HashMap<>();
    romanMap.put( "I", 1 );
    romanMap.put( "V", 5 );
    romanMap.put( "X", 10 );
    romanMap.put( "L", 50 );
    romanMap.put( "C", 100 );
    romanMap.put( "D", 500 );
    romanMap.put( "M", 1000 );
    String lastValue = "", previousValue = "";
    while ( !s.isEmpty() )
    {
      lastValue = s.substring( s.length() - 1, s.length() );
      if ( previousValue.concat( lastValue ) == "IV" || "IX" || "XL" || "XC" || "CD" || "CM" )
      {
        num -= romanMap.get( lastValue );
      }
      else
      {
        num += romanMap.get( lastValue );
      }
      s = s.substring( 0, s.length() - 1 );
      previousValue = lastValue;
    }
  }

  public static void main( String[] args )
  {

  }
}
