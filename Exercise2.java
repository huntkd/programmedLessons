class Exercise2
{
  public static void main ( String[] args )
  {
    int[] val = {13, -4, 82, 17}; 
    
    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
    // Construct an array object for twice.

    int[] twice = new int[4];
    // Put values in twice that are twice the
    // corresponding values in val.

    twice[0] = val[0] * 2;
    twice[1] = val[1] * 2;
    twice[2] = val[2] * 2;
    twice[3] = val[3] * 2;

    System.out.println( "New Array: " 
        + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
   }
}
