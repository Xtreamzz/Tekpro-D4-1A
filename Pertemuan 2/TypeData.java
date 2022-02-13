package typedata;
import java.io.*;
import java.util.Scanner;

/**
 * <h1>Define Data Type!</h1>
 * The TypeData program determines 
 * which primitive data types are capable of storing 
 * the input correctly.
 * @author Fadhil
 * @version 1.0
 * @since 2022-02-13
 */

public class TypeData {
	
	public void typedata(double num) {
		if(num >= -128 && num <= 127) {
			System.out.println((long)num + " can be fitted in:");
			System.out.println("* byte\n* short\n* int\n* long");
		}
		
		else if(num >= -32768 && num <= 32767) {
			System.out.println((long) num + " can be fitted in:");
			System.out.println("* short\n* int\n* long");
		}
		
		else if(num >= -2147483648 && num <= 2147483647) {
			System.out.println((long) num + " can be fitted in:");
			System.out.println("* int\n* long");
		}
		
		else if(num >= -9223372036854775808L && num <= 9223372036854775807L) {
			System.out.println((long) num + " can be fitted in:");
			System.out.println("* long");
		}
		
		else {
			System.out.println( num + " can't be fitted anywhere.");
		}
	}
	
	public static void main(String args[]) {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Masukkan angka: ");
			double num = input.nextDouble();
			TypeData a = new TypeData();
			a.typedata(num);
		}
	}
}
