import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String w = scan.next();
System.out.println("[INST]5;w;scan.next();"+w);
		char[] c = new char[w.length()];
System.out.println("[INST]6;None;w.length();"+w.length());
		for (int i = 0; i < w.length(); i++) {
System.out.println("[INST]7;None;w.length();"+w.length());
			c[i] = w.charAt(i);
System.out.println("[INST]8;None;w.charAt(i);"+w.charAt(i));
		}
		int[] a = new int[1000];
		for (int i = 0; i < w.length(); i++) {
System.out.println("[INST]11;None;w.length();"+w.length());
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
