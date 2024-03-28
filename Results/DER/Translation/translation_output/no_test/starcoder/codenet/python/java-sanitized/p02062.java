import java.util.*;
import java.io.*;

public class p02062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s + " ";
        int cur = 0;
        int[] ans = new int[2];
        ans[0] = 1;
        ans[1] = 1;
        while (cur < s.length()) {
            if (s.charAt(cur) == '?') {
                ans[0] = ans[0] + 1;
                ans[1] = ans[1] + 1;
                cur++;
            } else if (s.charAt(cur) == '&') {
                ans[0] = Math.min(ans[0], ans[1] + 1);
                ans[1] = ans[1] + 1;
                cur++;
            } else if (s.charAt(cur) == '|') {
                ans[0] = ans[0] + ans[1];
                ans[1] = Math.min(ans[0], ans[1] + 1);
                cur++;
            } else if (s.charAt(cur) == '(') {
                cur++;
                int[] tmp = new int[2];
                tmp[0] = 1;
                tmp[1] = 1;
                while (s.charAt(cur)!= ')') {
                    tmp = parse(s, cur);
                    cur = tmp[1];
                }
                cur++;
                ans[0] = Math.min(ans[0], tmp[0]);
                ans[1] = ans[1] + tmp[1];
            }
        }
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] parse(String s, int cur) {
        int[] ans = new int[2];
        ans[0] = 1;
        ans[1] = 1;
        while (cur < s.length()) {
            if (s.charAt(cur) == '?') {
                ans[0] = ans[0] + 1;
                ans[1] = ans[1] + 1;
                cur++;
            } else if (s.charAt(cur) == '&') {
                ans[0] = Math.min(ans[0], ans[1] + 1);
                ans[1] = ans[1] + 1;
                cur++;
            } else if (s.charAt(cur) == '|') {
                ans[0] = ans[0] + ans[1];
                ans[1] = Math.min(ans[0], ans[1] + 1);
                cur++;
            } else if (s.charAt(cur) == '(') {
                cur++;
                int[] tmp = new int[2];
                tmp[0] = 1;
                tmp[1] = 1;
                while (s.charAt(cur)!= ')') {
                    tmp = parse(s, cur);
                    cur = tmp[1];
                }
                cur++;
                ans[0] = Math.min(ans[0], tmp[0]);
                ans[1] = ans[1] + tmp[1];
            }
        }
        return ans;
    }
}