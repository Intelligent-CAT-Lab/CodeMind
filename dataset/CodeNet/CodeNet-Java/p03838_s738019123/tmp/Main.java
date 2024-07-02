import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
System.out.println("[INST]11;str;br.readLine().split(' ');"+str);
System.out.println("[INST]11;None;br.readLine();"+br.readLine());

		long x = Long.parseLong(str[0]);
System.out.println("[INST]13;x;Long.parseLong(str[0]);"+x);
		long y = Long.parseLong(str[1]);
System.out.println("[INST]14;y;Long.parseLong(str[1]);"+y);

		long ans = Long.MAX_VALUE;
		if (x <= y)
			ans = Math.min(ans, y - x);
System.out.println("[INST]18;ans;Math.min(ans, y - x);"+ans);
		if (-x <= y)
			ans = Math.min(ans, y + x + 1);
System.out.println("[INST]20;ans;Math.min(ans, y + x + 1);"+ans);
		if (x <= -y)
			ans = Math.min(ans, -y - x + 1);
System.out.println("[INST]22;ans;Math.min(ans, -y - x + 1);"+ans);
		if (-x <= -y)
			ans = Math.min(ans, -y + x + 2);
System.out.println("[INST]24;ans;Math.min(ans, -y + x + 2);"+ans);
		System.out.println(ans);
	}
}
