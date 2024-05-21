import java.util.*;

public class p00301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int[] POW = new int[15];
        POW[0] = 1;
        for (int i = 1; i < 15; i++) {
            POW[i] = POW[i - 1] * 3;
        }
        int maxDigit = 0;
        while ((POW[maxDigit] - 1) / 2 >= W) {
            maxDigit++;
        }
        int[] ans = new int[maxDigit + 1];
        int[] work = new int[maxDigit + 1];
        recursive(maxDigit, W, ans, work, POW);
        boolean isFirst = true;
        for (int i = maxDigit; i >= 0; i--) {
            if (ans[i] == 0) {
                if (isFirst) {
                    continue;
                } else {
                    System.out.print("0");
                }
            } else if (ans[i] == 1) {
                isFirst = false;
                System.out.print("+");
            } else { //ans[i] == -1
                isFirst = false;
                System.out.print("-");
            }
        }
        System.out.println();
    }

    public static void recursive(int digit, int tmpSum, int[] ans, int[] work, int[] POW) {
        if (digit == -1) {
            if (tmpSum == 0) {
                for (int i = digit; i >= 0; i--) {
                    ans[i] = work[i];
                }
            }
            return;
        }
        work[digit] = 0;
        recursive(digit - 1, tmpSum, ans, work, POW);
        work[digit] = 1;
        recursive(digit - 1, tmpSum + POW[digit], ans, work, POW);
        if (tmpSum > 0) {
            work[digit] = -1;
            recursive(digit - 1, tmpSum - POW[digit], ans, work, POW);
        }
    }
}