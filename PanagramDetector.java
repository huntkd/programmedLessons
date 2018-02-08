import java.io.*;
import java.util.*;

class PanagramDetector
{

  public static void main (String[] args) 
  {
  	System.out.println("Write a sentence:");

    Scanner scan = new Scanner(System.in);
    String sentence = scan.nextLine();
    sentence = sentence.toLowerCase();
    boolean panagramTrue = detectPanagram(sentence);

    if (panagramTrue) {
     System.out.println("Panagram");
    } else {
      System.out.println("Not panagram");
    } 
  }

  private static boolean detectPanagram(String sentence) {
    if (sentence.length() < 26)
       return false;
    else {
      for (char ch = 'a'; ch <= 'z'; ch++) {
         if (sentence.indexOf(ch) < 0) {
           return false;
          } 
      }
    } 
    return true;
  }
    

}      