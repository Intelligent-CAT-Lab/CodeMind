import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String w = scan.next();
var newVariable_0 = w.length();		char[] c = new char[newVariable_0];
var newVariable_1 = w.length();		for (int i = 0; i < newVariable_1; i++) {
var newVariable_2 = w.charAt(i);			c[i] = newVariable_2;
		}
		int[] a = new int[1000];
var newVariable_3 = w.length();		for (int i = 0; i < newVariable_3; i++) {
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
