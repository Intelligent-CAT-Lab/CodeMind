import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
System.out.println("[INST]7;a;sc.nextInt();"+a);
		int b = sc.nextInt();
System.out.println("[INST]8;b;sc.nextInt();"+b);
		int c = sc.nextInt();
System.out.println("[INST]9;c;sc.nextInt();"+c);

		boolean flag = false;

		if (a == b && b != c) {
			flag = true;
		} else if (b == c && c != a) {
			flag = true;
		} else if (c == a && a != b) {
			flag = true;
		}

		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
