import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
System.out.println("[INST]10;str;br.readLine().split(' ');"+str);
System.out.println("[INST]10;None;br.readLine();"+br.readLine());

		int n = Integer.parseInt(str[0]);
System.out.println("[INST]12;n;Integer.parseInt(str[0]);"+n);
		int k = Integer.parseInt(str[1]);
System.out.println("[INST]13;k;Integer.parseInt(str[1]);"+k);

		long num[] = new long[k];

		for (int i = 1; i <= n; i++) {
			num[i % k]++;
		}

		long res = 0;
		for (int a = 0; a < k; ++a) {
			int b = (k - a) % k;
			int c = (k - a) % k;
			if ((b + c) % k != 0)
				continue;
			res += num[a] * num[b] * num[c];
		}

		System.out.println(res);
	}
}
