import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class p01809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> rr = new ArrayList<>();

        while (true) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int g = BigInteger.valueOf(p).gcd(BigInteger.valueOf(q)).intValue();
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

        for (int i = 0; i < rr.size(); i++) {
            System.out.println(rr.get(i));
        }
    }
}