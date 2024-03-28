import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class p03830 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n+1];
        for (int i = 1; i <= n; i++) {
            int[] factors = factorization(i);
            for (int j = 0; j < factors.length; j++) {
                d[factors[j]]++;
            }
        }
        int r = 1;
        for (int i = 1; i <= n; i++) {
            r *= d[i] + 1;
            r %= 1000000007;
        }
        System.out.println(r);
    }

    public static int[] factorization(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        int c = 0;
        int m = n;
        while (m % 2 == 0) {
            c++;
            m /= 2;
        }
        if (c > 0) {
            factors.add(2);
            factors.add(c);
        }
        c = 0;
        m = n;
        while (m % 3 == 0) {
            c++;
            m /= 3;
        }
        if (c > 0) {
            factors.add(3);
            factors.add(c);
        }
        int x = 5;
        while (m >= x * x) {
            c = 0;
            while (m % x == 0) {
                c++;
                m /= x;
            }
            if (c > 0) {
                factors.add(x);
                factors.add(c);
            }
            if (x % 6 == 5) {
                x += 2;
            } else {
                x += 4;
            }
        }
        if (m > 1) {
            factors.add(m);
            factors.add(1);
        }
        int[] result = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) {
            result[i] = factors.get(i);
        }
        return result;
    }
}