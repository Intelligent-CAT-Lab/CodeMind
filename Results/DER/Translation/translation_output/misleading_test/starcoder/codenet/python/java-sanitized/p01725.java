import java.util.*;
import java.io.*;

public class p01725 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next() + "$";
        int[] pri = new int[3];
        for (int i = 0; i < 3; i++) {
            pri[i] = sc.nextInt();
        }
        int ans = -1000000000;
        for (int[] p : new int[][]{{1, 1, 1}, {1, 1, 2}, {1, 2, 1}, {1, 2, 2}, {2, 1, 1}, {2, 1, 2}, {2, 2, 1}, {2, 2, 2}}) {
            ans = Math.max(ans, parse(s, p));
        }
        System.out.println(ans);
    }

    public static int parse(String s, int[] pri) {
        int[] code = new int[]{'+', '-', '*'};
        int cur = 0;
        int[] num = new int[1];
        int[] result = new int[1];
        int[] op = new int[1];
        num[0] = 0;
        result[0] = 0;
        op[0] = '+';
        while (cur < s.length()) {
            char c = s.charAt(cur);
            if (c == '(') {
                cur++;
                result[0] = expr(0);
                cur++;
            } else {
                while (cur < s.length() && Character.isDigit(s.charAt(cur))) {
                    num[0] = num[0] * 10 + (s.charAt(cur) - '0');
                    cur++;
                }
                result[0] = op[0] == '+'? result[0] + num[0] : op[0] == '-'? result[0] - num[0] : result[0] * num[0];
            }
            c = s.charAt(cur);
            if (code[pri[code.indexOf(c)]]!= c) {
                break;
            }
            op[0] = c;
            cur++;
        }
        return result[0];
    }
}