import java.util.*;

public class p02254 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        Map<Character, Integer> dictString = new HashMap<>();
        Map<Character, Integer> dictDepth = new HashMap<>();

        for (char s : S.toCharArray()) {
            if (dictString.containsKey(s)) {
                dictString.put(s, dictString.get(s) + 1);
            } else {
                dictString.put(s, 1);
                dictDepth.put(s, 0);
            }
        }

        Map<String, Integer> dictStringCalc = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : dictString.entrySet()) {
            dictStringCalc.put(String.valueOf(entry.getKey()), entry.getValue());
        }

        while (dictStringCalc.size() != 1) {
            String x = null;
            int xCnt = 0;
            String y = null;
            int yCnt = 0;

            List<Map.Entry<String, Integer>> entries = new ArrayList<>(dictStringCalc.entrySet());
            entries.sort(Map.Entry.comparingByValue());

            for (Map.Entry<String, Integer> entry : entries) {
                if (x == null) {
                    x = entry.getKey();
                    xCnt = entry.getValue();
                    continue;
                }

                if (y == null) {
                    y = entry.getKey();
                    yCnt = entry.getValue();
                    break;
                }
            }

            for (char s : (x + y).toCharArray()) {
                dictDepth.put(s, dictDepth.get(s) + 1);
            }

            dictStringCalc.remove(x);
            dictStringCalc.remove(y);
            dictStringCalc.put(x + y, xCnt + yCnt);
        }

        int ans = 0;

        for (Map.Entry<Character, Integer> entry : dictDepth.entrySet()) {
            ans += dictString.get(entry.getKey()) * entry.getValue();
        }

        if (dictString.size() == 1) {
            ans = S.length();
        }

        System.out.println(ans);
    }
}