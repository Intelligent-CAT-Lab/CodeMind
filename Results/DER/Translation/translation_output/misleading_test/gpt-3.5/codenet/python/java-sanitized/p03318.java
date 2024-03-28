import java.util.*;
import java.io.*;

public class p03318 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        D();
    }

    public static void D() throws IOException {
        int K = Integer.parseInt(br.readLine());
        int ans = 1;
        int i = 0;

        while (K > 0) {
            System.out.println(ans);
            K--;
            i += check(ans, i);
            ans += Math.pow(10, i);
        }
    }

    public static double sunuke(int a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return (double)a / sum;
    }

    public static int check(int a, int i) {
        return sunuke(a + (int)Math.pow(10, i)) > sunuke(a + (int)Math.pow(10, i + 1)) ? 1 : 0;
    }
}