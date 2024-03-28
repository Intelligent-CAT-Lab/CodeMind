import java.util.Scanner;

public class p00301 {

    static final int BIG_NUM = 2000000000;
    static final long HUGE_NUM = 99999999999999999L;
    static final int MOD = 1000000007;
    static final double EPS = 0.000000001;
    static final int SIZE = 15;

    static final int[] POW = new int[SIZE];
    static {
        POW[0] = 1;
        for (int i = 1; i < SIZE; i++) {
            POW[i] = POW[i - 1] * 3;
        }
    }

    static int W;
    static Integer max_digit;
    static char[] ans;
    static char[] work;

    public static void recursive(int digit, int tmp_sum) {
        if (digit == -1) {
            if (tmp_sum == W) {
                System.arraycopy(work, 0, ans, 0, max_digit + 1);
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

        max_digit = null;
        for (int i = 0; i < SIZE; i++) {
            if ((POW[i] - 1) / 2 >= W) {
                max_digit = i;
                break;
            }
        }

        if (max_digit != null) {
            ans = new char[max_digit + 1];
            work = new char[max_digit + 1];

            recursive(max_digit, 0);

            boolean isFirst = true;
            for (int i = max_digit; i >= 0; i--) {
                if (ans[i] == '0') {
                    if (!isFirst) {
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

        scanner.close();
    }
}