Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] six = new int[]{6, 36, 216, 1296, 7776, 46656, 279936, 1679616};
        int[] nine = new int[]{9, 81, 729, 6561, 59049, 531441, 4782969, 43046721};
        System.out.println(DP(N, six, nine));
    }

    public static int DP(int n, int[] six, int[] nine) {
        if (n < 6) {
            return n;
        }
        int tmp = n;
        int count6 = 0;
        int count9 = 0;
        for (int sixx : six) {
            if (sixx <= n) {
                n -= sixx;
                count6 = 1;
                break;
            }
        }
        count6 += DP(n, six, nine);
        n = tmp;
        if (n < 9) {
            return count6;
        }
        for (int ninee : nine) {
            if (ninee <= n) {
                n -= ninee;
                count9 = 1;
                break;
            }
        }
        count9 += DP(n, six, nine);
        n = tmp;
        return Math.min(count6, count9);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, creates two arrays for powers of 6 and 9, and then calls the `DP` function to calculate the minimum number of 6s and 9s needed to represent the input number. The `DP` function uses recursion to calculate the result.
