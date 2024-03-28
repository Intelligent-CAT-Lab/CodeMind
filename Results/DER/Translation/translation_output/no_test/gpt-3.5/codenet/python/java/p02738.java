```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long M = scanner.nextLong();

        int l = n * 3 + 1;
        long[][] d = new long[l][n*5];
        d[0][0] = 1;
        
        for (int i = 1; i < l; i++) {
            int j = i - 1;
            int k = i - 2;
            long[] temp1 = new long[n*5];
            System.arraycopy(d[i-3], 0, temp1, 0, n*5);
            long[] temp2 = new long[n*5];
            System.arraycopy(d[k], 0, temp2, 0, n*5);
            temp2 = roll(temp2, -1, n);

            for (int m = 0; m < n*5; m++) {
                d[i][m] = ((temp1[m] * k + temp2[m]) * j + roll(d[j], 1, n)[m]) % M;
            }
        }

        long sum = 0;
        for (int k = 0; k < l; k++) {
            for (int m = 0; m < n*5; m++) {
                sum = (sum + d[k][m]) % M;
            }
        }
        
        System.out.println(sum);
    }

    private static long[] roll(long[] nums, int steps, int n) {
        long[] result = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[(i + steps + n*5) % (n*5)] = nums[i];
        }
        return result;
    }
}
```
