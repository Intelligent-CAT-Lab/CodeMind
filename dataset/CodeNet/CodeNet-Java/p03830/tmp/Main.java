import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final long MOD = 1000000007;
		int N = sc.nextInt();
System.out.println("[INST]8;N;sc.nextInt();"+N);
		int[] cnt = new int[N+1];
		for(int i=2; i<=N; i++) {
			int temp = i;
			for(int j=2; j*j<=temp; j++) {
				while(temp%j==0) {
					cnt[j]++;
					temp/=j;
				}
			}
			if(temp>1)
				cnt[temp]++;
		}
		
		long ans = 1;
		for(int i=2; i<=N; i++)
			ans = (ans * (cnt[i]+1))%MOD;
		
		System.out.println(ans);
		sc.close();
	}
}
