import java.io.*;
import java.util.*;

class Main {
    static HashMap<String, int[]> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] ans = parse(s);
        System.out.println(ans[1]);
    }

    static int[] parse(String s) {
        if (map.containsKey(s)) {
            return map.get(s);
        }
        int[] ans = new int[2];
        ans[0] = ans[1] = Integer.MAX_VALUE;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                int j = i + 1;
                while (s.charAt(j)!= ')') {
                    j++;
                }
                int[] tmp = parse(s.substring(i + 1, j));
                int[] tmp2 = new int[2];
                tmp2[0] = tmp[0] + tmp[1];
                tmp2[1] = tmp[0] - tmp[1];
                if (i > 0 && s.charAt(i - 1)!= '(') {
                    int[] tmp3 = parse(s.substring(0, i - 1));
                    tmp2[0] += tmp3[0];
                    tmp2[1] += tmp3[1];
                }
                if (j < n - 1 && s.charAt(j + 1)!= ')') {
                    int[] tmp3 = parse(s.substring(j + 1, n));
                    tmp2[0] += tmp3[0];
                    tmp2[1] += tmp3[1];
                }
                ans[0] = Math.min(ans[0], tmp2[0]);
                ans[1] = Math.max(ans[1], tmp2[1]);
                i = j;
            }
        }
        map.put(s, ans);
        return ans;
    }
}