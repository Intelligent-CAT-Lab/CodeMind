import java.util.Scanner;

/**
 * My Number
 */
public class Main {

	static int[] num = new int[12];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		for (int i = 0, j = 11; i < 12; i++, j--) {
var newVariable_0 = S.charAt(i);			if (newVariable_0 == '?') {
				num[j] = -1;
			} else {
var newVariable_1 = S.charAt(i);				num[j] = newVariable_1 - '0';
			}
		}

		int count = 0;
		int ans = 0;

		for (int i = 0; i < 12; i++) {
			if (num[i] == -1) {
				for (int j = 0; j <= 9; j++) {
					num[i] = j;
					if (check()) {
						count++;
						ans = j;
					}
					num[i] = -1;
				}
			}
		}

		if (count > 1) {
			System.out.println("MULTIPLE");
		} else {
			System.out.println(ans);
		}
	}

	static boolean check() {

		int digit = 0;

		for (int i = 11; i >= 1; i--) {
			if (i >= 7) {
				digit += num[i] * (i - 5);
			} else {
				digit += num[i] * (i + 1);
			}
		}

		digit %= 11;

		if (digit <= 1) {
			digit = 0;
		} else {
			digit = 11 - digit;
		}

		return digit == num[0];
	}
}
