import java.util.*;

public class p02254 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        Map<Character, Integer> dictString = new HashMap<>();
        Map<Character, Integer> dictDepth = new HashMap<>();

        for (char c : S.toCharArray()) {
            dictString.put(c, dictString.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> dictStringCalc = new HashMap<>(dictString);

        while (dictStringCalc.size() != 1) {
            Character x = null;
            Character y = null;
            int xCnt = 0;
            int yCnt = 0;

            List<Map.Entry<Character, Integer>> entries = new ArrayList<>(dictStringCalc.entrySet());
            entries.sort(Map.Entry.comparingByValue());

            for (Map.Entry<Character, Integer> entry : entries) {
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

            for (char c : (x.toString() + y.toString()).toCharArray()) {
                dictDepth.put(c, dictDepth.getOrDefault(c, 0) + 1);
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