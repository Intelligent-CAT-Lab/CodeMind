import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
System.out.println("[INST]6;sa;br.readLine().split(' ');"+sa);
System.out.println("[INST]6;None;br.readLine();"+br.readLine());
		int n = Integer.parseInt(sa[0]);
System.out.println("[INST]7;n;Integer.parseInt(sa[0]);"+n);
		int k = Integer.parseInt(sa[1]);
System.out.println("[INST]8;k;Integer.parseInt(sa[1]);"+k);
		br.close();

		long cnt = 0;
		for (int i = 1; i <= 11; i++) {
			for (int j = 1; j <= 5; j++) {
				int sum = 0;
				int base = 7 * i + j - 7;
				for (int x = 0; x < 3; x++) {
					for (int y = 0; y < 3; y++) {
						sum += base + 7 * x + y;
					}
				}
				if (sum % 11 == k) {
					cnt++;
				}
			}
		}
		n -= 2;
		long ans = n / 11 * cnt;
		n %= 11;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 5; j++) {
				int sum = 0;
				int base = 7 * i + j - 7;
				for (int x = 0; x < 3; x++) {
					for (int y = 0; y < 3; y++) {
						sum += base + 7 * x + y;
					}
				}
				if (sum % 11 == k) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
