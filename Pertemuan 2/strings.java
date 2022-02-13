import java.util.Scanner;
/**
 * <h1>String</h1>
 * This program is made for Sum the lengths of A and B, 
 * Determine if A is lexicographically larger than B, and
 * Capitalize the first letter in A and B and print them on a single line, separated by a
 * space.
 * @author fadhil
 *
 */
public class strings {
	/**
	 * 
	 * @param args
	 * @param stringA
	 * @param stringB
	 * @param stringANew
	 * @param stringBNew
	 * @param sum
	 */
	public static void main(String args[]) {
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.println("StringA : ");
			String stringA = keyboard.nextLine();
			System.out.println("StringB : ");
			String stringB = keyboard.nextLine();
			
			int sum = stringA.length() + stringB.length();
			System.out.println(sum);
			
			if (stringA.compareTo(stringB) > 0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
			String stringANew = stringA.substring(0, 1).toUpperCase() + stringA.substring(1);
			String stringBNew = stringB.substring(0, 1).toUpperCase() + stringB.substring(1);
			System.out.println(stringANew + " " + stringBNew);
		}
		
		
	}
	
}
