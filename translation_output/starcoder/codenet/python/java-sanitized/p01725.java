import java.util.*;
import java.io.*;

public class p01725 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine() + "$";
        int[] pri = new int[3];
        int[] code = new int[] {1, 2, 3};
        int ans = -1000000000;
        for (int[] p : new int[][]{{0, 1, 2}, {0, 2, 1}, {1, 0, 2}, {1, 2, 0}, {2, 0, 1}, {2, 1, 0}}) {
            pri[0] = p[0];
            pri[1] = p[1];
            pri[2] = p[2];
            int cur = 0;
            int num = 0;
            int result = 0;
            char op = '+';
            while (cur < S.length()) {
                char c = S.charAt(cur);
                if (c == '(') {
                    cur++;
                    result = expr(0);
                    cur++;
                } else if (c >= '0' && c <= '9') {
                    num = num*10 + (c - '0');
                } else {
                    if (op == '+') {
                        result += num;
                    } else if (op == '-') {
                        result -= num;
                    } else {
                        result *= num;
                    }
                    op = c;
                    num = 0;
                }
                cur++;
            }
            ans = Math.max(ans, result);
        }
        System.out.println(ans);
    }
    public static int expr(int level) {
        int cur = 0;
        int result = 0;
        char op = '+';
        while (1) {
            if (level == 2) {
                int num = 0;
                while (cur < S.length()) {
                    char c = S.charAt(cur);
                    if (c >= '0' && c <= '9') {
                        num = num*10 + (c - '0');
                    } else {
                        break;
                    }
                    cur++;
                }
                result += num;
            } else {
                result = expr(level+1);
            }
            if (cur >= S.length()) {
                break;
            }
            char c = S.charAt(cur);
            if (c == '+' || c == '-' || c == '*') {
                op = c;
            } else {
                break;
            }
            cur++;
        }
        return result;
    }
}