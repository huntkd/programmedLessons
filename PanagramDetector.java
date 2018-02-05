import java.io.* ;

class PanagramDetector
{

  public static void main (String[] args) 
  {
  	System.out.println("Write a sentence:");

    String sentence = args;
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".ToCharArray();
    int[] letterCount = new int[26];
    int letters = 0;

    for (int index=0; index < sentence.length();) {
    	for (int letter = 0; letter < 27; letter++) {
        char l = alphabet[letter];
        if (l.equals(sentence.charAt(index))) {
          index++;
          if (index < 26) {

          }
        } 
        System.out.println("This sentence is not a panagram!");

      }
    }


  }
}      