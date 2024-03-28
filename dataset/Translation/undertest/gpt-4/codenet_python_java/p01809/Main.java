import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class p01809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            int g = gcd(p, q);
            int t = q / g;
            int k = 1;
            if (t % 2 == 0) {
                k *= 2;
                while (t % 2 == 0) {
                    t /= 2;
                }
            }
            for (int i = 3; i <= Math.sqrt(t) + 1; i += 2) {
                if (t % i > 0) {
                    continue;
                }
                k *= i;
                while (t % i == 0) {
                    t /= i;
                }
            }
            out.println(t * k);
            break;
        }

        out.flush();
        out.close();
    }

    public static int gcd(int a, int b) {
        // Euclidean algorithm for GCD
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}