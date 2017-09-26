//Audrey Williams CS2003
package lab5;
import java.util.Scanner;

public class isaPalindrome {
	
	
	public static boolean isaPalindrome(String s)
	{
		//removes spaces and special characters
		s = s.toLowerCase().replaceAll("\\W", "");
		
		//base case: if string is 0 or 1 length then its a palindrome
		if(s.length() == 0 || s.length() == 1)
			return true;
		
		//method to check for palindrome
		if(s.charAt(0) == s.charAt(s.length() - 1))
			return isaPalindrome(s.substring(1,  s.length() - 1));
		
		//or else its not a palindrome
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//user inputs their word/sentence
		System.out.println("Write the phrase here:");
		String pal = scanner.nextLine();
		
		//recursion says if it is or isn't palindrome
		if(isaPalindrome(pal))
				System.out.println(pal + " is a palindrome");
		else
			System.out.println(pal + " is not a palindrome");
		
//closing the scanner cuz eclipse yelled at me
scanner.close();
	}

}
