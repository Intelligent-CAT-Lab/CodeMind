import java.util.*;

public class p03088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;
        Map<Integer, Map<String, Integer>> memo = new HashMap<>();

        for (int i = 0; i <= N; i++) {
            memo.put(i, new HashMap<>());
        }

        boolean ok(String last4) {
            for (int i = 0; i < 4; i++) {
                String t = last4;

                if (i >= 1) {
                    char[] chars = t.toCharArray();
                    char temp = chars[i - 1];
                    chars[i - 1] = chars[i];
                    chars[i] = temp;
                    t = new String(chars);
                }

                if (t.split("AGC").length - 1 >= 1) {
                    return false;
                }
            }

            return true;
        }

        int dfs(int cur, String last3) {
            if (memo.get(cur).containsKey(last3)) {
                return memo.get(cur).get(last3);
            }

            if (cur == N) {
                return 1;
            }

            int ret = 0;

            for (char c : "ACGT".toCharArray()) {
                if (ok(last3 + c)) {
                    ret = (ret + dfs(cur + 1, last3.substring(1) + c)) % MOD;
                }
            }

            memo.get(cur).put(last3, ret);

            return ret;
        }

        System.out.println(dfs(0, "TTT"));
    }
}