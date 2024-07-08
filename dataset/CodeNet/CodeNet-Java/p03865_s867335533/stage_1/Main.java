import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
var newVariable_0 = s.length();		if (newVariable_0 % 2 == 0) {
var newVariable_1 = s.charAt(0);var newVariable_2 = s.charAt(s.length() - 1);var newVariable_3 = s.length();			if (s.charAt(0) == s.charAt(newVariable_3 - 1)) {
				System.out.println("First");
			} else {
				System.out.println("Second");
			}
		} else {
var newVariable_4 = s.charAt(0);var newVariable_5 = s.charAt(s.length() - 1);var newVariable_6 = s.length();			if (s.charAt(0) == s.charAt(newVariable_6 - 1)) {
				System.out.println("Second");
			} else {
				System.out.println("First");
			}
		}

	}
}
