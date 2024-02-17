import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char[] c = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
		}
		int count = 0;
		for (int i = 1; i < s.length(); i++) {
			if (c[i] != c[i-1]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
