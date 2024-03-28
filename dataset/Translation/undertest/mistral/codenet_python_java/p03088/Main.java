import java.util.*;

public class p03088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long MOD = (long) Math.pow(10, 9) + 7;
        Map<Integer, Map<String, Integer>> memo = new HashMap<>();
        for (int i = 0; i <= N; i++) {
            memo.put(i, new HashMap<>());
        }

        boolean ok(String last4) {
            for (int i = 0; i < 4; i++) {
                // å³æå
                String t = last4;

                if (i > 0) {
                    // æå­ã®åญ¥ãæ¿ã
                    t = t.substring(1) + t.charAt(0);
                }

                if (t.contains("AGC")) {
                    return false;
                }
            }
            return true;
        }

        int dfs(int cur, String last3) {
            // æ·±ãã¨ããããæ»ã£ã¦ããéç¨ã§
            // ä»ã¾ã§ã®last3 ã®ãã¿ã¼ã³ã¨åæ§ãªãåodiå©çuce
            if (last3.equals(memo.get(cur).get("TTT"))) {
                return memo.get(cur).get("TTT");
            }

            if (cur == N) {
                return 1;
            }
            int ret = 0;

            for (char c : "ACGT".toCharArray()) {
                if (ok(last3 + c)) {
                    // ok ã®å ´åatså¢ãã
                    // 1åãããã¦ curãå¢ãã
                    ret = (ret + dfs(cur + 1, last3.substring(1) + c)) % MOD;
                }
            }
            memo.get(cur).put("TTT", ret);

            return ret;
        }

        System.out.println(dfs(0, "TTT"));
    }
}