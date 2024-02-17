import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int S = sc.nextInt();

		sc.close();

		int[] ans = new int[N];
		
		for(int i=0;i<ans.length;i++) {
			if(i<K) {
				ans[i] = S;
			}else {
				ans[i] = S==1000000000 ? 1 : S+1;
			}
		}
		
//		if (N == K) {
//			for (int i = 0; i < ans.length; i++) {
//				ans[i] = S;
//			}
//		}else if(K == 0) {
//			for(int i=0;i<ans.length;i++) {
//				ans[i] = S+1;
//			}
//		} else if(S==1) {
//			for(int i=0;i<ans.length;i++) {
//				if(i<K) {
//					ans[i] = 1;
//				}else {
//					ans[i] = 100;
//				}
//			}
//		} else {
//			for (int i = 0; i < ans.length; i++) {
//				if (i <= K) {
//					if (i % 2 == 0) {
//						ans[i] = 1;
//					} else {
//						ans[i] = S - 1;
//					}
//				} else {
//					ans[i] = S + 1;
//				}
//			}
//		}

		out.println(join(" ", ans));
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private String join(String delimiter, int[] a) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < a.length; i++) {
			sb.append(a[i]);
			sb.append(delimiter);
		}
		return sb.substring(0, Math.max(sb.length() - delimiter.length(), 0));
	}
}
