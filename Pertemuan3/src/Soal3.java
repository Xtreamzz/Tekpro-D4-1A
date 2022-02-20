/**
 * 
 * @author fadhil
 *
 */

import java.util.Scanner;
public class Soal3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		char op = input.next().charAt(0);
		int B = input.nextInt();
		
		switch(op) {
			case '+' : System.out.println(A + B);break;
			case '-' : System.out.println(A - B);break;
			case '*' : System.out.println(A * B);break;
			case '/' : System.out.println(A / B);break;
			case '%' : System.out.println(A % B);break;
		
		}
	}
}
