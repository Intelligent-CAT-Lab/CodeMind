import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
System.out.println("[INST]7;s;sc.next();"+s);
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
System.out.println("[INST]10;None;s.length();"+s.length());
			if (s.charAt(i) == '+') {
System.out.println("[INST]11;None;s.charAt(i);"+s.charAt(i));
				count++;
			} else {
				count--;
			}
		}

		System.out.print(count);
	}
}