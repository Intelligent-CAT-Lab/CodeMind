import java.util.*;

public class p02254 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        Map<Character, Integer> dictString = new HashMap<>();
        Map<Character, Integer> dictDepth = new HashMap<>();

        for (char s : S.toCharArray()) {
            dictString.put(s, dictString.getOrDefault(s, 0) + 1);
            if (!dictDepth.containsKey(s)) {
                dictDepth.put(s, 0);
            }
        }

        Map<Character, Integer> dictStringCalc = new HashMap<>(dictString);

        while (dictStringCalc.size() != 1) {
            Character x = null;
            Character y = null;

            for (Map.Entry<Character, Integer> entry : dictStringCalc.entrySet()) {
                if (x == null) {
                    x = entry.getKey();
                    int xCnt = entry.getValue();
                    continue;
                }

                if (y == null) {
                    y = entry.getKey();
                    int yCnt = entry.getValue();
                    break;
                }
            }

            for (char s : ("" + x + y).toCharArray()) {
                if (dictDepth.containsKey(s)) {
                    dictDepth.put(s, dictDepth.get(s) + 1);
                } else {
                    throw new RuntimeException("Key not found");
                }
            }

            dictStringCalc.remove(x);
            dictStringCalc.remove(y);

            dictStringCalc.put((char)(x + y), dictString.get(x) + dictString.get(y));
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