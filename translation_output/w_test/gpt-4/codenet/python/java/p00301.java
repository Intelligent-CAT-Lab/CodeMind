Here is the Java translation of the provided Python code:

```java
import java.util.Scanner;

public class TernaryRepresentation {
    static final int BIG_NUM = 2000000000;
    static final long HUGE_NUM = 99999999999999999L;
    static final int MOD = 1000000007;
    static final double EPS = 0.000000001;
    static final int SIZE = 15;

    static final int[] POW = new int[SIZE];
    static char[] ans;
    static char[] work;
    static int max_digit;
    static int W;

    static {
        POW[0] = 1;
        for (int i = 1; i < SIZE; i++) {
            POW[i] = POW[i - 1] * 3;
        }
    }

    public static void recursive(int digit, int tmp_sum) {
        if (digit == -1) {
            if (tmp_sum == W) {
                for (int i = 0; i <= max_digit; i++) {
                    ans[i] = work[i];
                }
            }
            return;
        }
        work[digit] = '0';
        recursive(digit - 1, tmp_sum);
        work[digit] = '+';
        recursive(digit - 1, tmp_sum + POW[digit]);
        if (tmp_sum > 0) {
            work[digit] = '-';
            recursive(digit - 1, tmp_sum - POW[digit]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        W = scanner.nextInt();

        max_digit = -1;
        for (int i = 0; i < SIZE; i++) {
            if ((POW[i] - 1) / 2 >= W) {
                max_digit = i;
                break;
            }
        }

        ans = new char[max_digit + 1];
        work = new char[max_digit + 1];

        recursive(max_digit, 0);

        boolean isFirst = true;
        StringBuilder output = new StringBuilder();
        for (int i = max_digit; i >= 0; i--) {
            if (ans[i] == '0') {
                if (isFirst) {
                    continue;
                } else {
                    output.append("0");
                }
            } else if (ans[i] == '+') {
                isFirst = false;
                output.append("+");
            } else { // ans[i] == '-'
                isFirst = false;
                output.append("-");
            }
        }
        System.out.println(output.toString());
        scanner.close();
    }
}
```

To compile and run this Java code using the given test input, you can save the Java code in a file named `TernaryRepresentation.java`, then execute the following commands:

```shell
javac TernaryRepresentation.java
echo 25 | java TernaryRepresentation
```

The expected output would be `+0-+`, according to the given testcase.
