import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
System.out.println("[INST]5;n;sc.nextInt();"+n);
		long k = sc.nextInt();
System.out.println("[INST]6;k;sc.nextInt();"+k);
		long ans;
		if (k % 2 == 0) {
			ans = (n / k) * (n / k) * (n / k);
			n += k / 2;
			ans += (n / k) * (n / k) * (n / k);
		} else {
			ans = (n / k) * (n / k) * (n / k);
		}
		System.out.println(ans);
	}
}
