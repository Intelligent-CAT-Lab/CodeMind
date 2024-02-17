

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		String[] ch = new String[4];

		for (int i = 0; i < 4; i++) {
			ch[i] = str.substring(i, i + 1);
		}

		int a = Integer.parseInt(ch[0]);
		int b = Integer.parseInt(ch[1]);
		int c = Integer.parseInt(ch[2]);
		int d = Integer.parseInt(ch[3]);

		String[] ans = new String[3];

		if (a + b + c + d == 7) {
			ans[0] = "+";
			ans[1] = "+";
			ans[2] = "+";
		} else if (a + b + c - d == 7) {
			ans[0] = "+";
			ans[1] = "+";
			ans[2] = "-";
		} else if (a + b - c + d == 7) {
			ans[0] = "+";
			ans[1] = "-";
			ans[2] = "+";
		} else if (a - b + c + d == 7) {
			ans[0] = "-";
			ans[1] = "+";
			ans[2] = "+";
		} else if (a + b - c - d == 7) {
			ans[0] = "+";
			ans[1] = "-";
			ans[2] = "-";
		} else if (a - b + c - d == 7) {
			ans[0] = "-";
			ans[1] = "+";
			ans[2] = "-";
		} else if (a - b - c + d == 7) {
			ans[0] = "-";
			ans[1] = "-";
			ans[2] = "+";
		} else if (a - b - c - d == 7) {
			ans[0] = "-";
			ans[1] = "-";
			ans[2] = "-";
		}

		System.out.println(a + ans[0] + b + ans[1] + c + ans[2] + d + "=7");
	}

}
