```java
import java.util.Scanner;

public class Main {
    
    static final int SIZE = 15;
    static final long[] POW = new long[SIZE];
    
    static int W;
    static int maxDigit;
    static Character[] ans;
    static Character[] work;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        W = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < SIZE; i++) {
            POW[i] = (i == 0) ? 1 : POW[i - 1] * 3;
        }

        maxDigit = 0;
        for (int i = 0; i < SIZE; i++) {
            if ((POW[i] - 1) / 2 >= W) {
                maxDigit = i;
                break;
            }
        }

        ans = new Character[maxDigit + 1];
        work = new Character[maxDigit + 1];

        recursive(maxDigit, 0);

        boolean isFirst = true;
        for (int i = maxDigit; i >= 0; i--) {
            if (ans[i] == '0') {
                if (isFirst) continue;
                else System.out.print("0");
            } else if (ans[i] == '+') {
                isFirst = false;
                System.out.print("+");
            } else { // ans[i] == '-'
                isFirst = false;
                System.out.print("-");
            }
        }

    }

    public static void recursive(int digit, long tmpSum) {
        if (digit == -1) {
            if (tmpSum == W) {
                for (int i = maxDigit; i >= 0; i++) {
                    ans[i] = work[i];
                }
            }
            return;
        }
        work[digit] = '0';
        recursive(digit - 1, tmpSum);
        work[digit] = '+';
        recursive(digit - 1, tmpSum + POW[digit]);
        if (tmpSum > 0) {
            work[digit] = '-';
            recursive(digit - 1, tmpSum - POW[digit]);
        }
    }
}
```
