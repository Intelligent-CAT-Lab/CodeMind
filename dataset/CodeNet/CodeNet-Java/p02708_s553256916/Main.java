import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        // String s = sc.next();
        long[] min = new long[n + 1];
        long[] max = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            min[i] = min[i - 1] + i;
        }
        max[0] = n;
        for (int i = 1; i <= n; i++) {
            max[i] = max[i - 1] + (n - i);
        }

        long ans = 0;

        for (int i = k - 1; i <= n; i++) {
            ans += max[i] - min[i] + 1;
        }

        System.out.println(ans % 1000000007);
        sc.close();
    }

}