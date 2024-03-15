
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int l = s.length();
        int[][] dp = new int[l + 1][l + 1];
        dp[0][l] = 1;
        int mod = (int) 1e9 + 7;
        int ans = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j <= l; j++) {
                int p = dp[i][j];
                if (p == 0) {
                    continue;
                }
                for (int k = 0; k < 26; k++) {
                    int x = bl(memo[k], i);
                    int y = br(memo[k], j - 1) - 1;
                    if (x > y) {
                        continue;
                    }
                    ans += p;
                    if (x < y) {
                        int mx = memo[k][x];
                        int my = memo[k][y];
                        dp[mx + 1][my] = (dp[mx + 1][my] + p) % mod;
                    }
                    ans = ans % mod;
                }
            }
        }
        ans = (ans + sum(dp) + mod - 1) % mod;
        System.out.println(ans);
    }

    static int bl(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    static int br(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr[mid] <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    static int sum(int[][] dp) {
        int ans = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                ans += dp[i][j];
            }
        }
        return ans;
    }
}
```

## 2.

### 2.1.

### 2.2.

### 2.3.

### 2.4.

### 2.5.

### 2.6.

### 2.7.

### 2.8.

### 2.9.

### 2.10.

### 2.11.

### 2.12.

### 2.13.

### 2.14.

### 2.15.

### 2.16.

### 2.17.

### 2.18.

### 2.19.

### 2.20.

### 2.21.

### 2.22.

### 2.23.

### 2.24.

### 2.25.

### 2.26.

### 2.27.

### 2.28.

### 2.29.

### 2.30.

### 2.31.

### 2.32.

### 2.33.

### 2.34.

### 2.35.

### 2.36.

### 2.37.

### 2.38.

### 2.39.

### 2.40.

### 2.41.

### 2.42.

### 2.43.

### 2.44.

### 2.45.

### 2.46.

### 2.47.

### 2.48.

### 2.49.

### 2.50.

### 2.51.

### 2.52.

### 2.53.

### 2.54.

### 2.55.

### 2.56.

### 2.57.

### 2.58.

### 2.59.

### 2.60.

### 2.61.

### 2.62.

### 2.63.

### 2.64.

### 2.65.

### 2.66.

### 2.67.

### 2.68.

### 2.69.

### 2.70.

### 2.71.

### 2.72.

### 2.73.

### 2.74.

### 2.75.

### 2.76.

### 2.77.

### 2.78.

### 2.79.

### 2.80.

### 2.81.

### 2.82.

### 2.83.

### 2.84.

### 2.85.

### 2.86.

### 2.87.

### 2.88.

### 2.89.

### 2.90.

### 2.91.

### 2.92.

### 2.93.

### 2.94.

### 2.95.

### 2.96.

### 2.97.

### 2.98.

### 2.99.

### 2.100.

### 2.101.

### 2.102.

### 2.103.

### 2.104.

### 2.105.

### 2.106.

### 2.107.

### 2.108.

### 2.109.

### 2.110.

### 2.111.

### 2.112.

### 2.113.

### 2.114.

### 2.115.

### 2.116.

### 2.117.

### 2.118.

### 2.119.

### 2.120.

###
