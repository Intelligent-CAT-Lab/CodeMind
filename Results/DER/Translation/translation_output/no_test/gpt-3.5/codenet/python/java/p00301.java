```java
import java.util.Scanner;

public class Main {
    static int BIG_NUM = 2000000000;
    static int HUGE_NUM = 999999999;
    static int MOD = 1000000007;
    static double EPS = 0.000000001;

    static int SIZE = 15;
    static int[] POW = new int[SIZE];

    static int W;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        W = scanner.nextInt();

        POW[0] = 1;
        for (int i = 1; i < SIZE; i++) {
            POW[i] = POW[i-1]*3;
        }

        int max_digit = -1;
        for (int i = 0; i < SIZE; i++) {
            if ((POW[i]-1)/2 >= W) {
                max_digit = i;
                break;
            }
        }

        char[] ans = new char[max_digit + 1];
        char[] work = new char[max_digit + 1];
        recursive(max_digit, 0, ans, work);

        boolean isFirst = true;
        for (int i = max_digit; i >= 0; i--) {
            if (ans[i] == '0') {
                if (isFirst) {
                    continue;
                } else {
                    System.out.print("0");
                }
            } else if (ans[i] == '+') {
                isFirst = false;
                System.out.print("+");
            } else { // ans[i] == '-'
                isFirst = false;
                System.out.print("-");
            }
        }
    }

    static void recursive(int digit, int tmp_sum, char[] ans, char[] work) {
        if (digit == -1) {
            if (tmp_sum == W) {
                for (int i = 0; i <= work.length-1; i++) {
                    ans[i] = work[i];
                }
            }
            return;
        }
        work[digit] = '0';
        recursive(digit-1, tmp_sum, ans, work);
        work[digit] = '+';
        recursive(digit-1, tmp_sum + POW[digit], ans, work);
        if (tmp_sum > 0) {
            work[digit] = '-';
            recursive(digit-1, tmp_sum - POW[digit], ans, work);
        }
    }
}
```

