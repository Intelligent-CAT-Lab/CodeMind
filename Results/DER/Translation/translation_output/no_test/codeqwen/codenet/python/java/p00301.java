Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int max_digit = 0;
        int[] POW = new int[15];
        POW[0] = 1;
        for (int i = 1; i < 15; i++) {
            POW[i] = POW[i - 1] * 3;
        }
        for (int i = 0; i < 15; i++) {
            if ((POW[i] - 1) / 2 >= W) {
                max_digit = i;
                break;
            }
        }
        char[] ans = new char[max_digit + 1];
        char[] work = new char[max_digit + 1];
        recursive(max_digit, 0, ans, work, POW, W);
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
            } else { //ans[i] == '-'
                isFirst = false;
                System.out.print("-");
            }
        }
        System.out.println();
    }

    public static void recursive(int digit, int tmp_sum, char[] ans, char[] work, int[] POW, int W) {
        if (digit == -1) {
            if (tmp_sum == W) {
                for (int i = max_digit; i >= 0; i--) {
                    ans[i] = work[i];
                }
            }

