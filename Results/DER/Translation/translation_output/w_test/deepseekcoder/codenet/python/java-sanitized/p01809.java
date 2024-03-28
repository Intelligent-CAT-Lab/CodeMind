import java.util.*;
import java.lang.*;

public class p01809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> rr = new ArrayList<>();

        while (scanner.hasNext()) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            int g = gcd(p, q);
            int t = q / g;
            int k = 1;
            if (t % 2 == 0) {
                k *= 2;
                while (t % 2 == 0) {
                    t /= 2;
                }
            }
            for (int i = 3; i <= Math.sqrt(t) + 2; i += 2) {
                if (t % i > 0) {
                    continue;
                }
                k *= i;
                while (t % i == 0) {
                    t /= i;
                }
            }
            rr.add(t * k);
        }

        for (int r : rr) {
            System.out.println(r);
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}