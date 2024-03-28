import java.util.*;

public class p00301 {
    static int SIZE = 15;
    static long[] POW = new long[SIZE];
    static String[] ans = new String[SIZE];
    static String[] work = new String[SIZE];
    static boolean isFirst = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long W = scanner.nextLong();

        for (int i = 0; i < SIZE; i++) {
            POW[i] = (long) Math.pow(3, i);
        }

        int maxDigit = -1;
        for (int i = 0; i < SIZE; i++) {
            if ((POW[i] - 1) / 2 >= W) {
                maxDigit = i;
                break;
            }
        }

        recursive(maxDigit, 0);

        for (int i = maxDigit; i >= 0; i--) {
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

    static void recursive(int digit, long tmpSum) {
        if (digit == -1) {
            if (tmpSum == 0) {
                for (int i = 0; i <= digit; i++) {
                    ans[i] = work[i];
                }
            }
            return;
        }
        work[digit] = "0";
        recursive(digit - 1, tmpSum);
        work[digit] = "+";
        recursive(digit - 1, tmpSum + POW[digit]);
        if (tmpSum > 0) {
            work[digit] = "-";
            recursive(digit - 1, tmpSum - POW[digit]);
        }
    }
}