import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class p02065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int mod = sc.nextInt();

        ArrayList<HashMap<String, Integer>> dp = new ArrayList<HashMap<String, Integer>>();
        for (int i = 0; i < 2 * N; i++) {
            dp.add(new HashMap<String, Integer>());
        }

        dp.get(0).put("(None, (0,))", 1);
        for (int i = 0; i < 2 * N - 1; i++) {
            for (String key : dp.get(i).keySet()) {
                String[] keyParts = key.split(",");
                String left = keyParts[0];
                String top = keyParts[1];
                int v = dp.get(i).get(key);

                if (top.length() > K + 1) {
                    continue;
                }

                if (left.equals("None")) {
                    if (top.length() > 0 && i + 1 - Integer.parseInt(top.split(",")[0]) <= K) {
                        dp.get(i + 1).put("(" + (i + 1) + ", " + top + ")", (dp.get(i + 1).get("(" + (i + 1) + ", " + top + ")") + v) % mod);
                    }
                } else if (i + 1 - Integer.parseInt(left) <= K && top.length() > 1 && i + 1 - Integer.parseInt(top.split(",")[1]) <= K) {
                    dp.get(i + 1).put("(" + (i + 1) + ", " + top.substring(1) + ")", (dp.get(i + 1).get("(" + (i + 1) + ", " + top.substring(1) + ")") + v) % mod);
                }

                if (top.length() > 0 && i + 1 - Integer.parseInt(top.split(",")[top.length() - 1]) <= K) {
                    top = top + "," + (i + 1);
                    dp.get(i + 1).put("(" + left + ", " + top + ")", (dp.get(i + 1).get("(" + left + ", " + top + ")") + v) % mod);
                }
            }
        }

        int res = 0;
        for (String key : dp.get(2 * N - 1).keySet()) {
            String[] keyParts = key.split(",");
            String left = keyParts[0];
            String top = keyParts[1];
            int v = dp.get(2 * N - 1).get(key);

            if (top.length() == 1) {
                assert left.equals(2 * N - 1);
                res = (res + v) % mod;
            }
        }

        System.out.println(res);
    }
}