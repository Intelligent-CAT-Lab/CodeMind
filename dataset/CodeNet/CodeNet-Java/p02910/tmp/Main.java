import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
System.out.println("[INST]5;N;sc.next();"+N);

		for (int i = 0; i < N.length(); i++) {
System.out.println("[INST]7;None;N.length();"+N.length());
			char c = N.charAt(i);
System.out.println("[INST]8;c;N.charAt(i);"+c);
			if (i % 2 == 0) {
				if (c =='L') {
					System.out.println("No");
					break;
				}
			}else {
				if (c =='R') {
					System.out.println("No");
					break;
				}
			}
			if (i == N.length() - 1) {
System.out.println("[INST]20;None;N.length();"+N.length());
				System.out.println("Yes");
			}
		}
	}

}