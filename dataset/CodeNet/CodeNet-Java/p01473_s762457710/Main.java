import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int n = s.length;
		int[] a = new int[128];
		for(int i=0;i<n;i++) {
			a[s[i]]++;
		}
		int odd = 0;
		int sum = 0;
		for(int i=0;i<128;i++) {
			if (a[i] % 2 == 1) {
				odd++;
				a[i]--;
			}
			a[i] /= 2;
			sum += a[i];
		}
		if (odd >= 2) {
			System.out.println(0);
			return;
		}
		long[] fact = new long[41];
		fact[0] = 1;
		for(int i=1;i<=40;i++) {
			fact[i] = fact[i-1] * i;
		}
		long ans = fact[sum];
		for(int i=0;i<128;i++) {
			ans /= fact[a[i]];
		}
		System.out.println(ans);
	}

}