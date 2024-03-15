```java
import java.util.*;

public class Main {
	
	static int n, a, b;
	static int p = 1000000007;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		
		int[] xs0 = new int[n+1];
		int[] os0 = new int[n+1];
		
		os0[0] = 1;
		
		for (int i = b; i <= a-1; i++) {
			for (int j = b; j <= i; j++) {
				xs0[i] += os0[i-j];
				xs0[i] %= p;
			}
			for (int j = 1; j <= i; j++) {
				os0[i] += xs0[i-j];
				os0[i] %= p;
			}
		}
		
		int[] os = new int[a];
		
		for (int i = b; i <= a-2; i++) {
			for (int j = 2; j <= a-i; j++) {
				os[i+j] += xs0[i] * (j-1);
			}
		}
		
		int[] x = new int[n+1];
		int[] o = new int[n+1];
		
		for (int i = b+1; i < a; i++) {
			for (int j = b; j < i; j++) {
				o[i] += xs0[j];
				o[i] %= p;
			}
		}
		
		x[0] = 1;
		o[0] = 1;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < Math.min(b, i+1); j++) {
				x[i] += o[i-j];
			}
			for (int j = 1; j < Math.min(a, i+1); j++) {
				o[i] += x[i-j];
			}
			for (int j = b+2; j < Math.min(a, i+1); j++) {
				o[i] += x[i-j] * os[j];
			}
			x[i] %= p;
			o[i] %= p;
		}
		
		for (int i = b+1; i < a; i++) {
			for (int j = b; j < i; j++) {
				o[n] += xs0[j] * x[n-i];
				o[i] %= p;
			}
		}
		
		int ans = o[n] + x[n];
		ans %= p;
		
		int[] beki2 = new int[5001];
		beki2[1] = 1;
		
		for (int i = 1; i <= 5000; i++) {
			beki2[i] = beki2[i-1] * 2 % p;
		}
		
		ans = beki2[n] - ans;
		ans += p;
		ans %= p;
		
		System.out.println(ans);
	}
}
```
