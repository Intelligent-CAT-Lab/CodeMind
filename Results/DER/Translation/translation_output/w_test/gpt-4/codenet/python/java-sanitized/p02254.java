import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p02254 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        input.close();

        Map<Character, Integer> dictString = new HashMap<>();
        Map<Character, Integer> dictDepth = new HashMap<>();

        for (char s : S.toCharArray()) {
            dictString.put(s, dictString.getOrDefault(s, 0) + 1);
            dictDepth.putIfAbsent(s, 0);
        }

        TreeMap<String, Integer> dictStringCalc = new TreeMap<>();
        for (Map.Entry<Character, Integer> entry : dictString.entrySet()) {
            dictStringCalc.put(String.valueOf(entry.getKey()), entry.getValue());
        }

        while (dictStringCalc.size() != 1) {
            String x = null, y = null;
            int xCnt = 0, yCnt = 0;

            for (Map.Entry<String, Integer> entry : dictStringCalc.entrySet()) {
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