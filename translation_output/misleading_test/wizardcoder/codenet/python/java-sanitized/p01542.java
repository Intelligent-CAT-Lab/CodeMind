import java.util.*;

public class p01542 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> res = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            if (s.equals("000")) break;
            int r = solve(s);
            res.add(r);
        }
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }

    public static int solve(String s) {
        int r = -1;
        char[] ca = {'0', '1', '+', '-', '*', '('};
        int[] cnt = new int[1024];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                int j = i + 1;
                while (j < s.length() && s.charAt(j)!= ')') j++;
                if (j == s.length()) return -1;
                String sub = s.substring(i+1, j);
                int subRes = solve(sub);
                if (subRes == -1) return -1;
                for (int k = 0; k < 1024; k++) {
                    cnt[k] += cnt[k & subRes];
                }
                i = j;
            } else if (c == '*') {
                int j = i - 1;
                while (j >= 0 && s.charAt(j)!= '*') j--;
                if (j < 0) return -1;
                int k = i + 1;
                while (k < s.length() && s.charAt(k)!= '*') k++;
                if (k == s.length()) return -1;
                String t1 = s.substring(j+1, i);
                String t2 = s.substring(i+1, k);
                int t1Res = solve(t1);
                int t2Res = solve(t2);
                if (t1Res == -1 || t2Res == -1) return -1;
                for (int l = 0; l < 1024; l++) {
                    cnt[l] += cnt[l & t1Res] * cnt[l & t2Res];
                }
                i = k;
            } else if (c == '+' || c == '-') {
                int j = i - 1;
                while (j >= 0 && s.charAt(j)!= '+' && s.charAt(j)!= '-') j--;
                if (j < 0) return -1;
                int