import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class p00301 {
    private static final int BIG_NUM = 2000000000;
    private static final int HUGE_NUM = 99999999999999999;
    private static final int MOD = 1000000007;
    private static final double EPS = 0.000000001;

    private static final int SIZE = 15;
    private static final int[] POW = new int[SIZE];

    static {
        POW[0] = 1;
        for (int i = 1; i < SIZE; i++) {
            POW[i] = POW[i - 1] * 3;
        }
    }

    public static void main(String[] args) {
        int W = Integer.parseInt(args[0]);

        int maxDigit = -1;
        for (int i = 0; i < SIZE; i++) {
            if ((POW[i] - 1) / 2 >= W) {
                maxDigit = i;
                break;
            }
        }

        char[] ans = new char[maxDigit + 1];
        char[] work = new char[maxDigit + 1];

        recursive(maxDigit, 0, ans, work);

        boolean isFirst = true;
        for (int i = maxDigit; i >= 0; i--) {
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
        System.out.println();
    }

    private static void recursive(int digit, int tmpSum, char[] ans, char[] work) {
        if (digit == -1) {
            if (tmpSum == W) {
                for (int i = 0; i <= maxDigit; i++) {
                    ans[i] = work[i];
                }
            }
            return;
        }
        work[digit] = '0';
        recursive(digit - 1, tmpSum, ans, work);
        work[digit] = '+';
        recursive(digit - 1, tmpSum + POW[digit], ans, work);
        if (tmpSum > 0) {
            work[digit] = '-';
            recursive(digit - 1, tmpSum - POW[digit], ans, work);
        }
    }
}