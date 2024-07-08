import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
var newVariable_0 = s.length();		char[] c = new char[newVariable_0];
var newVariable_1 = s.length();		for (int i = 0; i < newVariable_1; i++) {
var newVariable_2 = s.charAt(i);			c[i] = newVariable_2;
		}
		int count = 0;
var newVariable_3 = s.length();		for (int i = 1; i < newVariable_3; i++) {
			if (c[i] != c[i-1]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
