import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
		int[] a = new int[4];
		for (int i = 0; i < 4; i++) {
			a[i] = (int)(s.charAt(i) - '0');
		}

		for (int i = 0; i < (1 << 3); i++) {
			int num = a[0];
			char[] op = new char[3];
			for (int j = 0; j < 3; j++) {
				if ((1 & (i >> j)) == 1) {
					num += a[j + 1];
					op[j] = '+';
				} else {
					num -= a[j + 1];
					op[j] = '-';
				}
			}

			if (num == 7) {
				String ans = "" + a[0];
				for (int j = 0; j < 3; j++) {
					ans += "" + op[j] + a[j + 1];
				}
				ans += "=7";
				System.out.println(ans);
				return;
			}
		}
	}
}
