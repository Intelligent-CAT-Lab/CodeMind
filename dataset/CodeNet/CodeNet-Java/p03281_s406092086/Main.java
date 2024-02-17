
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for(int i = 1; i < n + 1; i++) {
			if(i % 2 == 1) {
				int tmp = i;
				int[] div = new int[n + 1];
				for(int j = 1; j < n + 1; j++) {
					div[j] = 0;
				}
				while(tmp != 1) {
					for(int j = 2; j < tmp + 1; j++) {
						if(tmp % j == 0) {
							div[j]++;
							tmp /= j;
							break;
						}
					}
				}
				int count = 1;
				for(int j = 2; j < n + 1; j++) {
					count *= div[j] + 1;
				}
				if(count == 8) {
					ans++;
				}
			}
		}
		System.out.println(ans);

	}

}
