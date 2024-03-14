import java.util.*;

public class p00301 {
    static int W;
    static int SIZE = 15;
    static int[] POW = new int[SIZE];
    static String[] ans, work;
    static boolean isFirst;

    public static void main(String[] args) {
        for (int i = 1; i < SIZE; i++) {
            POW[i] = POW[i-1]*3;
        }

        Scanner scanner = new Scanner(System.in);
        W = scanner.nextInt();

        int max_digit = -1;
        for (int i = 0; i < SIZE; i++) {
            if ((POW[i]-1)/2 >= W) {
                max_digit = i;
                break;
            }
        }

        ans = new String[max_digit+1];
        work = new String[max_digit+1];

        recursive(max_digit, 0);

        isFirst = true;
        for (int i = max_digit; i >= 0; i--) {
            if (ans[i].equals("0")) {
                if (isFirst) {
                    continue;
                } else {
                    System.out.print("0");
                }
            } else if (ans[i].equals("+")) {
                isFirst = false;
                System.out.print("+");
            } else { // ans[i].equals("-")
                isFirst = false;
                System.out.print("-");
            }
        }
        System.out.println();
    }

    static void recursive(int digit, int tmp_sum) {
        if (digit == -1) {
            if (tmp_sum == W) {
                for (int i = digit; i <= ans.length-1; i++) {
                    ans[i] = work[i];
                }
            }
            return;
        }
        work[digit] = "0";
        recursive(digit-1, tmp_sum);
        work[digit] = "+";
        recursive(digit-1, tmp_sum+POW[digit]);
        if (tmp_sum > 0) {
            work[digit] = "-";
            recursive(digit-1, tmp_sum-POW[digit]);
        }
    }
}