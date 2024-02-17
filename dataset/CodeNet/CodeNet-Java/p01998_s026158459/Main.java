import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MAX = 10000002;

        boolean[] isPrime = new boolean[MAX + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i <= MAX; i++) {
            if ( !isPrime[i] ) {
                continue;
            }
            for (int j = i + i; j <= MAX; j += i) {
                isPrime[j] = false;
            }
        }

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int ans = 0;

            for (int p = 3; p <= N; p++) {
                if ( !isPrime[p] ) {
                    continue;
                }

                if ( isPrime[p + 2] ) {
                    ans += 2;
                }
            }

            System.out.println(ans);
        }
    }
}

