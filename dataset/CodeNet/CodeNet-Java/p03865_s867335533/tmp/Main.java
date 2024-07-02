import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
System.out.println("[INST]5;s;sc.next();"+s);
		if (s.length() % 2 == 0) {
System.out.println("[INST]6;None;s.length();"+s.length());
			if (s.charAt(0) == s.charAt(s.length() - 1)) {
System.out.println("[INST]7;None;s.charAt(0);"+s.charAt(0));
System.out.println("[INST]7;None;s.charAt(s.length() - 1);"+s.charAt(s.length() - 1));
System.out.println("[INST]7;None;s.length();"+s.length());
				System.out.println("First");
			} else {
				System.out.println("Second");
			}
		} else {
			if (s.charAt(0) == s.charAt(s.length() - 1)) {
System.out.println("[INST]13;None;s.charAt(0);"+s.charAt(0));
System.out.println("[INST]13;None;s.charAt(s.length() - 1);"+s.charAt(s.length() - 1));
System.out.println("[INST]13;None;s.length();"+s.length());
				System.out.println("Second");
			} else {
				System.out.println("First");
			}
		}

	}
}
