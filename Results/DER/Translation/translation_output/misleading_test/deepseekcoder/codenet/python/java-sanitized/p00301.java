import java.util.Scanner;

public class p00301 {
    static int BIG_NUM = 2000000000;
    static long HUGE_NUM = 999999999999999999L;
    static int MOD = 1000000007;
    static double EPS = 0.000000001;
    static int SIZE = 15;
    static int[] POW = new int[SIZE];
    static StringBuilder ans;
    static StringBuilder work;
    static int W;
    static int max_digit;

    static {
        for (int i = 0; i < SIZE; i++) {
            if (i == 0)
                POW[i] = 1;
            else
                POW[i] = POW[i - 1] * 3;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        W = scanner.nextInt();
        for (int i = 0; i < SIZE; i++) {
            if ((POW[i] - 1) / 2 >= W) {
                max_digit = i;
                break;
            }
        }
        ans = new StringBuilder(max_digit + 1);
        work = new StringBuilder(max_digit + 1);
        recursive(max_digit, 0);
        boolean isFirst = true;
        for (int i = max_digit; i >= 0; i--) {
            if (ans.charAt(i) == '0') {
                if (isFirst)
                    continue;
                else
                    System.out.print("0");
            } else if (ans.charAt(i) == '+') {
                isFirst = false;
                System.out.print("+");
            } else { // ans.charAt(i) == '-'
                isFirst = false;
                System.out.print("-");
            }
        }
        System.out.println();
    }

    static void recursive(int digit, int tmp_sum) {
        if (digit == -1) {
            if (tmp_sum == W) {
                for (int i = max_digit; i >= 0; i--) {
                    ans.setCharAt(i, work.charAt(i));
                }
            }
            return;
        }
        work.setCharAt(digit, '0');
        recursive(digit - 1, tmp_sum);
        work.setCharAt(digit, '+');
        recursive(digit - 1, tmp_sum + POW[digit]);
        if (tmp_sum > 0) {
            work.setCharAt(digit, '-');
            recursive(digit - 1, tmp_sum - POW[digit]);
        }
    }
}