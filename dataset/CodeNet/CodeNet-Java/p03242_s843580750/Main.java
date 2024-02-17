import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String N = sc.next();

		for (int i = 0; i < 3; i++) {
			if (N.charAt(i) == '1') {
				System.out.print(9);

			} else if (N.charAt(i) == '9') {
				System.out.print(1);
			} else {
				System.out.print(N.charAt(i));
			}
		}

	}

}