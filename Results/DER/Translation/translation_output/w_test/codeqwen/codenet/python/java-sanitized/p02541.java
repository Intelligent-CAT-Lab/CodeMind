import java.util.*;
import java.io.*;

public class p02541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> divisors = makeDivisors(2 * n);

        int ans = n-1;
        if (n % 2 == 0) {
            ans = 2 * n - 1;
        }
        for (int x : divisors) {
            int y = n * 2 / x;
            if (y == 1) {
                continue;
            }
            int[] r = {0, y-1};
            int[] m = {x, y};
            int[] remMod = crt(r, m);
            if (remMod[0] == remMod[1] && remMod[0] == 0) {
                continue;
            }
            ans = Math.min(ans, remMod[0]);
        }

        System.out.println(ans);
    }

    public static List<Integer> makeDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }

    public static int[] invGcd(int a, int b) {
        a = (a + b) % b;
        if (a == 0) {
            return new int[]{b, 0};
        }
        int s = b, t = a;
        int m0 = 0, m1 = 1;

        while (t != 0) {
            int u = s / t;