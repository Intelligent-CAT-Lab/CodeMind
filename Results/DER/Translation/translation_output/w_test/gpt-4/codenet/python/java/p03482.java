```java
import java.util.Scanner;

public class Main {
    static final long mod = 1000000007; // 10**9 + 7
    static final long INF = 1000000000000000000L; // 10**18
    static final double eps = 0.0000001; // 10**-7

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int N = S.length();
        int ans = N;
        int ans2 = N;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == '1') {
                ans = Math.min(ans, Math.max(N - i - 1, i));
            } else {
                ans2 = Math.min(ans2, Math.max(N - i - 1, i));
            }
        }
        System.out.println(Math.max(ans, ans2));
        scanner.close();
    }
}
```

To test this Java code with an input of `010`, you would simply run this Java program and input `010` when prompted. The program will then output `2` as expected.
