```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int L = S.length();
        boolean[][] dp = new boolean[L + 1][L + 1];

        for (int i = 0; i <= L; i++) {
            dp[i][i] = true;
        }

        for (int w = 3; w <= L; w += 3) {
            for (int left = 0; left <= L - w; left++) {
                int right = left + w;
                if (S.charAt(left) != 'm' || S.charAt(right - 1) != 'w') continue;
                for (int mid = left + 1; mid < right; mid++) {
                    if (S.charAt(mid) == 'e' && dp[left + 1][mid] && dp[mid + 1][right - 1]) {
                        dp[left][right] = true;
                        break;
                    }
                }
            }
        }

        System.out.println(dp[0][L] ? "Cat" : "Rabbit");
    }
}
```

