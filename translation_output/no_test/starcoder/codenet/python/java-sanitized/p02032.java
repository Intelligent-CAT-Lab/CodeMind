import java.util.*;
import java.io.*;

public class p02032 {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.setIn(new ByteArrayInputStream("".getBytes()));
        System.setOut(new PrintStream(new ByteArrayOutputStream()));
        System.setErr(new PrintStream(new ByteArrayOutputStream()));
        System.out.println(this.solve(n));
    }

    public int solve(int n) {
        int ans = 1;
        Map<Integer, Integer> primeFactors = this.primeFactorization(n);
        for (int v : primeFactors.values()) {
            ans *= (v + 1);
        }
        return ans - 1;
    }

    public Map<Integer, Integer> primeFactorization(int n) {
        Map<Integer, Integer> primeFactors = new HashMap<>();
        for (int i = 2; i <= n; i++) {
            int cnt = 0;
            while (n % i == 0) {
                cnt++;
                n /= i;
            }
            if (cnt > 0) {
                primeFactors.put(i, cnt);
            }
        }
        return primeFactors;
    }
}