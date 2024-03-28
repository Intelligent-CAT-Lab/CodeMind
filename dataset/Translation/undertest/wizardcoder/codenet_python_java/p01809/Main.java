import java.util.*;

public class p01809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, q, g, t, k;
        List<Integer> rr = new ArrayList<>();

        while (true) {
            p = sc.nextInt();
            q = sc.nextInt();
            g = Math.gcd(p, q);
            t = q / g;
            k = 1;
            if (t % 2 == 0) {
                k *= 2;
                while (t % 2 == 0) {
                    t /= 2;
                }
            }
            for (int i = 3; i * i <= t; i += 2) {
                if (t % i == 0) {
                    k *= i;
                    while (t % i == 0) {
                        t /= i;
                    }
                }
            }
            if (t > 1) {
                k *= t;
            }
            rr.add(t * k);

            break;
        }

        for (int i : rr) {
            System.out.println(i);
        }
    }
}