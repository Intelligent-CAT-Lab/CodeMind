import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
System.out.println("[INST]6;S;sc.next();"+S);
		char[] c = S.toCharArray();
System.out.println("[INST]7;c;S.toCharArray();"+c);
		if (c[0] != 'A') {
			System.out.println("WA");
			return;
		}
		int count = 0;
		int index = 0;
		for (int i = 2; i < c.length - 1; i++) {
			if (c[i] == 'C') {
				count++;
				index = i;
			}
		}
		if (count != 1) {
			System.out.println("WA");
			return;
		}

		for (int i = 0; i < c.length; i++) {
			if (i == 0 || i == index) {
				continue;
			}
			if (c[i] >= 'A' && c[i] <= 'Z') {
				System.out.println("WA");
				return;
			}
		}
		System.out.println("AC");
		sc.close();
	}
}