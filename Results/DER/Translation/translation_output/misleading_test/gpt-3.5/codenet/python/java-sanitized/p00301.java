import java.util.*;

public class p00301 {

    static final int SIZE = 15;
    static final int MOD = 1000000007;

    static int[] POW = new int[SIZE];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int W = input.nextInt();

        for (int i = 0; i < SIZE; i++) {
            POW[i] = (int) Math.pow(3, i);
        }

        int max_digit = 0;
        for (int i = 0; i < SIZE; i++) {
            if ((POW[i] - 1) / 2 >= W) {
                max_digit = i;
                break;
            }
        }

        char[] ans = new char[max_digit + 1];
        char[] work = new char[max_digit + 1];

        recursive(max_digit, 0, W, ans, work);

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
        System.out.println();
    }

    static void recursive(int digit, int tmpSum, int W, char[] ans, char[] work) {
        if (digit == -1) {
            if (tmpSum == W) {
                for (int i = 0; i < ans.length; i++) {
                    ans[i] = work[i];
                }
            }
            return;
        }

        work[digit] = '0';
        recursive(digit - 1, tmpSum, W, ans, work);
        work[digit] = '+';
        recursive(digit - 1, tmpSum + POW[digit], W, ans, work);
        if (tmpSum > 0) {
            work[digit] = '-';
            recursive(digit - 1, tmpSum - POW[digit], W, ans, work);
        }
    }
}