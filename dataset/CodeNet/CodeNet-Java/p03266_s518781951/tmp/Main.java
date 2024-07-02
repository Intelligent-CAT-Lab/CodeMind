import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
*/public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskC solver = new TaskC();
		solver.solve(1, in, out);
		out.close();
	}
static class TaskC   {
public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
System.out.println("[INST]21;N;in.nextInt();"+N);
        int K = in.nextInt();
System.out.println("[INST]22;K;in.nextInt();"+K);
        long ans = (long)Math.pow(N/K, 3);
System.out.println("[INST]23;None;Math.pow(N/K, 3);"+Math.pow(N/K, 3));
        if(K%2 == 0 && N%K < K/2) ans += Math.pow(N/K, 3);
System.out.println("[INST]24;ans;Math.pow(N/K, 3);"+ans);
        else if(K%2 == 0 && N%K >= K/2) ans += Math.pow(N/K+1, 3);
System.out.println("[INST]25;ans;Math.pow(N/K+1, 3);"+ans);
        out.println(ans);
    }

}
}

