import java.util.*;
import java.io.*;

public class p02062 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int cur = 0;
        int[] ans = parse(s, cur);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] parse(String s, int cur) {
        int[] res = new int[2];
        res[0] = 0;
        res[1] = 0;
        while (cur < s.length()) {
            if (s.charAt(cur) == '?') {
                res[0]++;
                res[1]++;
                cur++;
            } else if (s.charAt(cur) == '|') {
                cur++;
                int[] rhs = parse(s, cur);
                res[0] += rhs[0];
                res[1] = Math.min(res[1], rhs[0] + rhs[1]);
            } else if (s.charAt(cur) == '&') {
                cur++;
                int[] rhs = parse(s, cur);
                res[0] = Math.min(res[0], rhs[0]);
                res[1] += rhs[1];
            } else if (s.charAt(cur) == '(') {
                cur++;
                int[] rhs = parse(s, cur);
                res[0] = Math.min(res[0], rhs[0]);
                res[1] = Math.min(res[1], rhs[1]);
                if (s.charAt(cur)!= ')') {
                    throw new Exception("not closed");
                }
                cur++;
            }
        }
        return res;
    }
}