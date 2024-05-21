import java.util.*;
import java.io.*;

public class p01809 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int p = Integer.parseInt(input[0]);
        int q = Integer.parseInt(input[1]);
        int gcd = gcd(p, q);
        int t = q / gcd;
        int k = 1;
        if (t % 2 == 0) {
            k *= 2;
            while (t % 2 == 0) {
                t /= 2;
            }
        }
        for (int i = 3; i <= Math.sqrt(t); i += 2) {
            if (t % i > 0) {
                continue;
            }
            k *= i;
            while (t % i == 0) {
                t /= i;
            }
        }
        System.out.println(t * k);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}