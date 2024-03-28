import java.util.*;

public class p00301 {
    final static int BIG_NUM = 2000000000;
    final static int HUGE_NUM = 99999999999999999;
    final static int MOD = 1000000007;
    final static double EPS = 0.000000001;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();

        int max_digit = -1;
        for (int i = 0; i < 15; i++) {
            if ((Math.pow(3, i) - 1) / 2 >= W) {
                max_digit = i;
                break;
            }
        }

        int[] ans = new int[max_digit + 1];
        int[] work = new int[max_digit + 1];

        recursive(max_digit, 0);

        for (int i = max_digit; i >= 0; i--) {
            if (ans[i] == 0) {
                continue;
            }
            System.out.print(ans[i] == '+' ? "+" : "-");
        }
        System.out.println();
    }

    public static void recursive(int digit, int tmp_sum) {
        if (digit == -1) {
            if (tmp_sum == W) {
                for (int i = max_digit; i >= 0; i--) {
                    System.out.print(work[i]);
                }
            }
            return;
        }
        work[digit] = '0';
        recursive(digit - 1, tmp_sum);
        work[digit] = '+';
        recursive(digit - 1, tmp_sum + Math.pow(3, digit));
        if (tmp_sum > 0) {
            work[digit] = '-';
            recursive(digit - 1, tmp_sum - Math.pow(3, digit));
        }
    }
}