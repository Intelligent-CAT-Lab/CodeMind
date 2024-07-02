import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
System.out.println("[INST]6;s;scan.next();"+s);
		char[] c = new char[s.length()];
System.out.println("[INST]7;None;s.length();"+s.length());
		for (int i = 0; i < s.length(); i++) {
System.out.println("[INST]8;None;s.length();"+s.length());
			c[i] = s.charAt(i);
System.out.println("[INST]9;None;s.charAt(i);"+s.charAt(i));
		}
		int count = 0;
		for (int i = 1; i < s.length(); i++) {
System.out.println("[INST]12;None;s.length();"+s.length());
			if (c[i] != c[i-1]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
