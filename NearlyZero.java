import java.io.* ;

class NearlyZero
{

  public static void main ( String[] args )
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    // declare and initialize variables
    int closestToZero = data[0];
    int difference = java.lang.Math.abs(0 - data[0]);
  
    
    // find the element nearest to zero
    for (int index=1; index < data.length; index++)
    {
      if (difference > java.lang.Math.abs(0 - data[index])) {
        closestToZero = data[index];
        difference = java.lang.Math.abs(0 - data[0]);
      }
    }
      
    // write out the element nearest to zero
    System.out.println("The closest number to zero is: " + closestToZero);

  }
}  