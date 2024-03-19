import java.util.*;

public class p02254 {
    public static void main(String[] args) {
        String S = "abca";

        Map<String, Integer> dictString = new HashMap<>();
        Map<String, Integer> dictDepth = new HashMap<>();

        for (char s : S.toCharArray()) {
            String key = String.valueOf(s);
            dictString.put(key, dictString.getOrDefault(key, 0) + 1);
            if (!dictDepth.containsKey(key)) {
                dictDepth.put(key, 0);
            }
        }

        Map<String, Integer> dictStringCalc = new HashMap<>(dictString);

        while (dictStringCalc.size() != 1) {
            String x = null;
            String y = null;
            int x_cnt = 0;
            int y_cnt = 0;

            List<Map.Entry<String, Integer>> list = new ArrayList<>(dictStringCalc.entrySet());
            list.sort(Map.Entry.comparingByValue());

            for (Map.Entry<String, Integer> entry : list) {
                if (x == null) {
                    x = entry.getKey();
                    x_cnt = entry.getValue();
                    continue;
                }

                if (y == null) {
                    y = entry.getKey();
                    y_cnt = entry.getValue();
                    break;
                }
            }

            for (char s : (x + y).toCharArray()) {
                String key = String.valueOf(s);
                dictDepth.put(key, dictDepth.get(key) + 1);
            }

            dictStringCalc.remove(x);
            dictStringCalc.remove(y);

            dictStringCalc.put(x + y, x_cnt + y_cnt);
        }

        int ans = 0;

        for (Map.Entry<String, Integer> entry : dictDepth.entrySet()) {
            ans += dictString.get(entry.getKey()) * entry.getValue();
        }

        if (dictString.size() == 1) {
            ans = S.length();
        }

        System.out.println(ans);
    }
}