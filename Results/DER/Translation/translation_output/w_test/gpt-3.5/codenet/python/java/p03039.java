```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);
        long ans = 0;
        long INF = (long) Math.pow(10, 9) + 7;

        if (n <= m) {
            long M = -(m - 1) * m * (2 * m - 1) / 3 + m * m * (m - 1);
            long Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            M = M % INF;
            Ms = Ms % INF;

            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans += Ms;
                    } else {
                        int d = j - i;
                        ans += d * Math.pow(m, 2) + M;
                    }
                    ans = ans % INF;
                }
            }
        } else {
            int temp = n;
            n = m;
            m = temp;

            long M = -(m - 1) * m * (2 * m - 1) / 3 + m * m * (m - 1);
            long Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            M = M % INF;
            Ms = Ms % INF;

            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans += Ms;
                    } else {
                        int d = j - i;
                        ans += d * Math.pow(m, 2) + M;
                    }
                    ans = ans % INF;
                }
            }
        }

        ans = (factorial(n * m - 2) / (factorial(n * m - k) * factorial(k - 2))) * ans;
        ans = ans % INF;
        System.out.println(ans);
    }

    public static long factorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}
```

