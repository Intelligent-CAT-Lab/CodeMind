
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s;
		String sd = "abcdefghijklmnopqrstuvwxyz";
		String sdnum = "0123456789";
		s = sc.next();
System.out.println("[INST]11;s;sc.next();"+s);
		int count[];
		int countnum[];
		count = new int[26];
		countnum = new int[10];

		for (int i = 0; i < s.length(); ++i) {
System.out.println("[INST]17;None;s.length();"+s.length());
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
System.out.println("[INST]18;None;s.charAt(i);"+s.charAt(i));
System.out.println("[INST]18;None;s.charAt(i);"+s.charAt(i));
				++countnum[s.charAt(i) - '0'];
System.out.println("[INST]19;None;s.charAt(i);"+s.charAt(i));
			}
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
System.out.println("[INST]21;None;s.charAt(i);"+s.charAt(i));
System.out.println("[INST]21;None;s.charAt(i);"+s.charAt(i));
				++count[s.charAt(i) - 'a'];
System.out.println("[INST]22;None;s.charAt(i);"+s.charAt(i));
			}
		}

		int ans = 0;
		for (int i = 26; i >= 3; --i) {
			for (int j = 0; j <= 26 - i; ++j) {
				int tmp = 10000;
				for (int k = j; k < j + i; ++k) {
					tmp = Math.min(tmp, count[k]);
System.out.println("[INST]31;tmp;Math.min(tmp, count[k]);"+tmp);
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
System.out.println("[INST]47;tmp;Math.min(tmp, countnum[k]);"+tmp);
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

