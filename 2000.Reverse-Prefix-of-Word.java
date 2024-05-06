import java.util.*;
import java.io.*;

//https://leetcode.com/submissions/detail/1250456596/
public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    char ch = scn.next().charAt(0);
    System.out.println(reversePrefix(str, ch));
  }

  public static String reversePrefix(String word, char ch) {
    char[] wordArray = word.toCharArray();

    int sz = wordArray.length;
    int foundIndex = -1;
    for (int i = 0; i < sz; i++) {
      char currentChar = wordArray[i];
      if (currentChar == ch) {
        foundIndex = i;
        break;
      }
    }
    if (foundIndex == -1) {
      return word;
    }
    // swap 
    int lastIndex = foundIndex / 2;

    for (int i = 0; i <= (lastIndex); i++) {

      char temp = wordArray[i];
      wordArray[i] = wordArray[foundIndex - i];
      wordArray[foundIndex - i] = temp;
    }
    return new String(wordArray);

  }
}
