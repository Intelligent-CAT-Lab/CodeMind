
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s;
		String sd = "abcdefghijklmnopqrstuvwxyz";
		String sdnum = "0123456789";
		s = sc.next();
		int count[];
		int countnum[];
		count = new int[26];
		countnum = new int[10];

		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				++countnum[s.charAt(i) - '0'];
			}
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				++count[s.charAt(i) - 'a'];
			}
		}

		int ans = 0;
		for (int i = 26; i >= 3; --i) {
			for (int j = 0; j <= 26 - i; ++j) {
				int tmp = 10000;
				for (int k = j; k < j + i; ++k) {
					tmp = Math.min(tmp, count[k]);
				}
				ans += tmp * 3;
				for (int k = j; k < j + i; ++k) {
					count[k] -= tmp;
				}
			}
		}
		for (int i = 0; i < 26; ++i) {
			ans += count[i];
		}

		for (int i = 10; i >= 3; --i) {
			for (int j = 0; j <= 10 - i; ++j) {
				int tmp = 10000;
				for (int k = j; k < j + i; ++k) {
					tmp = Math.min(tmp, countnum[k]);
				}
				ans += tmp * 3;
				for (int k = j; k < j + i; ++k) {
					countnum[k] -= tmp;
				}
			}
		}
		for (int i = 0; i < 10; ++i) {
			ans += countnum[i];
		}

		System.out.println(ans);
		sc.close();
	}

}

