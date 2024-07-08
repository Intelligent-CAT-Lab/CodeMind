import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String N = sc.next();

		for (int i = 0; i < 3; i++) {
var newVariable_0 = N.charAt(i);			if (newVariable_0 == '1') {
				System.out.print(9);

var newVariable_1 = N.charAt(i);			} else if (newVariable_1 == '9') {
				System.out.print(1);
			} else {
				System.out.print(N.charAt(i));
			}
		}

	}

}