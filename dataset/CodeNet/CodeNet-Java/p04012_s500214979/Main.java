import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String w = scan.next();
		char[] c = new char[w.length()];
		for (int i = 0; i < w.length(); i++) {
			c[i] = w.charAt(i);
		}
		int[] a = new int[1000];
		for (int i = 0; i < w.length(); i++) {
			a[c[i]]++;
		}
		boolean flag = true;
		for (int i = 0; i < 1000; i++) {
			if (a[i]%2==1) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Yes");			
		}
		else {
			System.out.println("No");
		}
	}
}
