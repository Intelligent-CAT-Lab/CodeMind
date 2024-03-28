import java.util.*;

public class p02254 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        Map<Character, Integer> dictString = new HashMap<>();
        Map<Character, Integer> dictDepth = new HashMap<>();

        for (char c : S.toCharArray()) {
            dictString.put(c, dictString.getOrDefault(c, 0) + 1);
            dictDepth.put(c, 0);
        }

        Map<Character, Integer> dictStringCalc = new HashMap<>(dictString);

        while (dictStringCalc.size() != 1) {
            char x = 0, y = 0;
            int xCnt = 0, yCnt = 0;
            List<Character> keys = new ArrayList<>(dictStringCalc.keySet());
            Collections.sort(keys, Comparator.comparingInt(dictStringCalc::get));

            for (char key : keys) {
                if (x == 0) {
                    x = key;
                    xCnt = dictStringCalc.get(key);
                    continue;
                }

                if (y == 0) {
                    y = key;
                    yCnt = dictStringCalc.get(key);
                    break;
                }
            }

            for (char c : ("" + x + y).toCharArray()) {
                dictDepth.put(c, dictDepth.get(c) + 1);
            }

            dictStringCalc.remove(x);
            dictStringCalc.remove(y);

            dictStringCalc.put("" + x + y, xCnt + yCnt);
        }

        int ans = 0;

        for (Map.Entry<Character, Integer> entry : dictDepth.entrySet()) {
            ans += dictString.getOrDefault(entry.getKey(), 0) * entry.getValue();
        }

        if (dictString.size() == 1) {
            ans = S.length();
        }

        System.out.println(ans);
    }
}