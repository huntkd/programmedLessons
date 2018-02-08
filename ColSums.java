import java.io.* ;

public class ColSums
{

  public static void main ( String[] args ) 
  {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };
    
    int longest = 0;
    for ( int row=0; row < data.length; row++)
    {
      if (data[row].length > longest) {
        longest = data[row].length;
      }
    }
   
    int[] colSum = new int[longest];

    for ( int row=0, col=0; row < data.length; row++) {
      if (col > data.length) { 
      } else {
       for (; col < data[row].length;) {
        colSum[col] += data[row][col];
       }
       System.out.println(colSum[col]);
       col++;
      }
    }

    // for (int i=0; i < colSum.length; i++) {
      
    // }
  }
}      