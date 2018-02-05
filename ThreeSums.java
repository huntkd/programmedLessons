import java.io.* ;

class ThreeSums
{

  public static void main ( String[] args ) 
  {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
    
    // declare and initialize three sums
    int sumAll = 0;
    int sumOdd = 0;
    int sumEven = 0;
    
    // compute the sums
    for ( int index=0; index < data.length; index++)
    {
      sumAll = sumAll + data[index];
    }
    for ( int index=0; index < data.length; index+=2)
    {
      sumOdd = sumOdd + data[index];
    }
    for ( int index=1; index < data.length; index+=2)
    {
      sumEven = sumEven + data[index];
    }
      
    // write out the three sums
    System.out.println("Sum of all numbers: " + sumAll);
    System.out.println("Sum of all odd numbers: " + sumOdd);
    System.out.println("Sum of all even numbers: " + sumEven);

  }
}      