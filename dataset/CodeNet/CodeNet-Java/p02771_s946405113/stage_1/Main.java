import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

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
