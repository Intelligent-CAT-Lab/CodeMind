import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		int n = s.length();
		String left = s.substring(0, ((n + 1) / 2) - 1);
		String right = s.substring(((n + 3) / 2) - 1, n);
		if (function(s) && function(left) && function(right)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static boolean function(String s) {
		int len = s.length();
		int center = len / 2;
		if (len % 2 == 0) {
			String left = s.substring(0, center);
			String right = s.substring(center, len);
			right = reverse(right);
var newVariable_0 = left.equals(right);			return newVariable_0;
		} else {
			String left = s.substring(0, center + 1);
			String right = s.substring(center, len);
			right = reverse(right);
var newVariable_1 = left.equals(right);			return newVariable_1;
		}
	}

	public static String reverse(String s) {
		int len = s.length();
		StringBuilder sb = new StringBuilder();
		String[] ss = s.split("");
		for (int i = 0; i < len; i++) {
var newVariable_2 = sb.append(ss[len - 1 - i]);		}
var newVariable_3 = sb.toString();		return newVariable_3;
	}
}
