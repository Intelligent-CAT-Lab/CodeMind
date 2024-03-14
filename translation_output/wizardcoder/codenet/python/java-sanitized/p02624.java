import java.util.*;

public class p02624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DSumOfDivisors solver = new DSumOfDivisors();
        solver.solve(sc);
    }

    public void solve(Scanner sc) {
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int d = divCount(i);
            sum += d * i;
        }

        System.out.println(sum);
    }

    public int divCount(int n) {
        int[] hh = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (hh[i] == 0) continue;
            for (int j = i * 2; j <= n; j += i) {
                hh[j] = 0;
            }
        }

        int total = 1;
        for (int i = 2; i <= n; i++) {
            if (hh[i] == 1) {
                int count = 0;
                while (n % i == 0) {
                    n /= i;
                    count++;
                }
                total *= (count + 1);
            }
        }

        return total;
    }
}