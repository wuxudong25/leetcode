package leetcode;

public class ReverseInteger
{
  public int reverse(int x) {
    int y = 0;
    int n = 0;
    while (x != 0)
    {
        n = x%10;
        if (y>214748364 || y< -214748364)
        {
            return 0;
        }
        y = y*10;
        y += n;
        x = x / 10;
    }
    return y;
  }
  
  public static void main( String[] args )
  {
    ReverseInteger example = new ReverseInteger();
    System.out.println( example.reverse( 120000 ) );
  }
}
