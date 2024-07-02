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
System.out.println("[INST]12;N;sc.nextInt();"+N);
		int K = sc.nextInt();
System.out.println("[INST]13;K;sc.nextInt();"+K);
		int S = sc.nextInt();
System.out.println("[INST]14;S;sc.nextInt();"+S);

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
System.out.println("[INST]70;None;sb.append(a[i]);"+sb.append(a[i]));
			sb.append(delimiter);
System.out.println("[INST]71;None;sb.append(delimiter);"+sb.append(delimiter));
		}
		return sb.substring(0, Math.max(sb.length() - delimiter.length(), 0));
System.out.println("[INST]73;None;sb.substring(0, Math.max(sb.length() - delimiter.length(), 0));"+sb.substring(0, Math.max(sb.length() - delimiter.length(), 0)));
System.out.println("[INST]73;None;Math.max(sb.length() - delimiter.length(), 0);"+Math.max(sb.length() - delimiter.length(), 0));
System.out.println("[INST]73;None;sb.length();"+sb.length());
System.out.println("[INST]73;None;delimiter.length();"+delimiter.length());
	}
}
