import java.util.*;

public class p00301 {
    static final int SIZE = 15;
    static final int BIG_NUM = 2000000000;
    static final int HUGE_NUM = 99999999999999999;
    static final int MOD = 1000000007;
    static final double EPS = 0.000000001;

    static int[] POW = new int[SIZE];
    static int W;
    static int max_digit;
    static char[] ans = new char[SIZE];
    static char[] work = new char[SIZE];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        W = sc.nextInt();
        for (int i = 0; i < SIZE; i++) {
            POW[i] = 1;
        }
        for (int i = 1; i < SIZE; i++) {
            POW[i] = POW[i - 1] * 3;
        }
        for (int i = 0; i < SIZE; i++) {
            if ((POW[i] - 1) / 2 >= W) {
                max_digit = i;
                break;
            }
        }
        recursive(max_digit, 0);
        boolean is_First = true;
        for (int i = max_digit; i >= 0; i--) {
            if (ans[i] == '0') {
                if (is_First) {
                    continue;
                } else {
                    System.out.print("0");
                }
            } else if (ans[i] == '+') {
                is_First = false;
                System.out.print("+");
            } else {
                is_First = false;
                System.out.print("-");
            }
        }
        System.out.println();
    }

    static void recursive(int digit, int tmp_sum) {
        if (digit == -1) {
            if (tmp_sum == W) {
                for (int i = max_digit; i >= 0; i--) {
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
}