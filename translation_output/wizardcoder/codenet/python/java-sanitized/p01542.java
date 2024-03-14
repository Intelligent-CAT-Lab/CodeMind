import java.util.*;
import java.io.*;

public class p01542 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String n = br.readLine();
            int r = solve(n);
            bw.write(r + "\n");
        }

        bw.close();
    }

    public static int solve(String n) {
        int r = -1;
        char[] ca = {'0', '1', '+', '-', '*', '('};
        int[] sa = new int[n.length()];
        for (int i = 0; i < n.length(); i++) {
            sa[i] = n.charAt(i) - '0';
        }
        int sl = sa.length;

        Map<String, Integer> fm = new HashMap<>();
        int[] dp = new int[1 << sl];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int i = 0; i < sl; i++) {
            for (int j = 0; j < ca.length; j++) {
                char c = ca[j];
                if (c == '(') {
                    continue;
                }
                int[] ns = new int[sl + 1];
                System.arraycopy(sa, 0, ns, 0, i);
                ns[i] = c == '0'? 0 : 1;
                System.arraycopy(sa, i, ns, i + 1, sl - i);
                String s = toStr(ns);
                if (fm.containsKey(s)) {
                    dp[i + 1] = Math.max(dp[i + 1], fm.get(s));
                } else {
                    int tr = -1;
                    if (c == '*') {
                        for (int k = 0; k < i; k++) {
                            if (sa[k] == 0 or sa[k] == 1) {
                                continue;
                            }
                            int t = dp[k];
                            if (t == -1) {
                                continue;
                            }
                            for (int l = k + 1; l <= i; l++) {
                                if (sa[l] == 0 or sa[l] == 1) {
                                    continue;
                                }
                                int u = dp[l];
                                if (u == -1) {
                                    continue;
                                }
                                int tu = t * u;
                                if (t < 0 || t >= 1024 || u < 0 || u >= 1024 || tu < 0 || tu >= 1024) {
                                    continue;
                                }
                                String ts = toStr(tu);
                                tr