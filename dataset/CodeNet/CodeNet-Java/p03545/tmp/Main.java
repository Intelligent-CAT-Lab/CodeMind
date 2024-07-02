

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
System.out.println("[INST]8;str;sc.next();"+str);
		String[] ch = new String[4];

		for (int i = 0; i < 4; i++) {
			ch[i] = str.substring(i, i + 1);
System.out.println("[INST]12;None;str.substring(i, i + 1);"+str.substring(i, i + 1));
		}

		int a = Integer.parseInt(ch[0]);
System.out.println("[INST]15;a;Integer.parseInt(ch[0]);"+a);
		int b = Integer.parseInt(ch[1]);
System.out.println("[INST]16;b;Integer.parseInt(ch[1]);"+b);
		int c = Integer.parseInt(ch[2]);
System.out.println("[INST]17;c;Integer.parseInt(ch[2]);"+c);
		int d = Integer.parseInt(ch[3]);
System.out.println("[INST]18;d;Integer.parseInt(ch[3]);"+d);

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
