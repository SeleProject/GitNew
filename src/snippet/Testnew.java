package snippet;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] inputStrings = {"Apple","Bat","Cat","Orange"}; 
//		String str;
//        System.out.println("Enter the string:");
//        Scanner in = new Scanner(System.in);
//        str=in.nextLine();
        // Regex to check starting character 
        String regexPattern = "^(?i)[aeiou].*"; 
        
        // Checking all the elements in Array 
      for (String Temp : inputStrings) { 
          if (Temp.matches(regexPattern)) { 
              System.out.println(Temp+" starts with Vowel"); 
          } 
          else { 
              System.out.println(Temp+" does not start with a vowel."); 
          } 
	}

	}}
