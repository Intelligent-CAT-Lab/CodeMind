import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> rr = new ArrayList<>();

        while (true) {
            int p = sc.nextInt();
            int q = sc.nextInt();
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

            break;
        }

        for (int i : rr) {
            System.out.println(i);
        }
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}