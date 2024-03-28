import java.util.Scanner;

public class p00301 {
    private static final int BIG_NUM = 2000000000;
    private static final long HUGE_NUM = 99999999999999999L;
    private static final int MOD = 1000000007;
    private static final double EPS = 0.000000001;
    
    private static final int SIZE = 15;
    private static final int[] POW = new int[SIZE];
    private static char[] ans;
    private static char[] work;
    private static int W;
    private static int max_digit;

    static {
        POW[0] = 1;
        for (int i = 1; i < SIZE; i++) {
            POW[i] = POW[i - 1] * 3;
        }
    }
    
    private static void recursive(int digit, int tmpSum) {
        if (digit == -1) {
            if (tmpSum == W) {
                System.arraycopy(work, 0, ans, 0, max_digit + 1);
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
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        W = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < SIZE; i++) {
            if ((POW[i] - 1) / 2 >= W) {
                max_digit = i;
                break;
            }
        }

        ans = new char[max_digit + 1];
        work = new char[max_digit + 1];
        
        recursive(max_digit, 0);
        
        boolean isFirst = true;
        for (int i = max_digit; i >= 0; i--) {
            if (ans[i] == '0') {
                if (!isFirst) {
                    System.out.print("0");
                }
            } else {
                isFirst = false;
                System.out.print(ans[i]);
            }
        }
        System.out.println();
    }
}