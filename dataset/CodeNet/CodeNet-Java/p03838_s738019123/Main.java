import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		long x = Long.parseLong(str[0]);
		long y = Long.parseLong(str[1]);

		long ans = Long.MAX_VALUE;
		if (x <= y)
			ans = Math.min(ans, y - x);
		if (-x <= y)
			ans = Math.min(ans, y + x + 1);
		if (x <= -y)
			ans = Math.min(ans, -y - x + 1);
		if (-x <= -y)
			ans = Math.min(ans, -y + x + 2);
		System.out.println(ans);
	}
}
