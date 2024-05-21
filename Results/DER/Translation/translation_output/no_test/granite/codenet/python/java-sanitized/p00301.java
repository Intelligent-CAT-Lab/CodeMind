import java.io.*;
import java.util.*;

public class p00301 {
    static int[] POW = new int[15];
    static int SIZE = 15;
    static int W;
    static int max_digit;
    static char[] ans = new char[15];
    static char[] work = new char[15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        POW[0] = 1;
        for (int i = 1; i < SIZE; i++) {
            POW[i] = POW[i - 1] * 3;
        }
        W = Integer.parseInt(br.readLine());
        max_digit = -1;
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
                    bw.write("0");
                }
            } else if (ans[i] == '+') {
                is_First = false;
                bw.write("+");
            } else { //ans[i] == '-'
                is_First = false;
                bw.write("-");
            }
        }
        bw.flush();
    }

    public static void recursive(int digit, int tmp_sum) {
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