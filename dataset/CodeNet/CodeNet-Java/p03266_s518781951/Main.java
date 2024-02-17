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
        int K = in.nextInt();
        long ans = (long)Math.pow(N/K, 3);
        if(K%2 == 0 && N%K < K/2) ans += Math.pow(N/K, 3);
        else if(K%2 == 0 && N%K >= K/2) ans += Math.pow(N/K+1, 3);
        out.println(ans);
    }

}
}

