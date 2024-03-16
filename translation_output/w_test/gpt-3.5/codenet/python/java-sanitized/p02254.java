import java.util.*;

public class p02254 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();

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

        Map<Character, Integer> dictStringCalc = new HashMap<>(dictString);

        while (dictStringCalc.size() != 1) {
            Character x = null;
            Character y = null;

            for (Map.Entry<Character, Integer> entry : dictStringCalc.entrySet()) {
                if (x == null) {
                    x = entry.getKey();
                    continue;
                }

                if (y == null) {
                    y = entry.getKey();
                    break;
                }
            }

            int xCnt = dictStringCalc.get(x);
            int yCnt = dictStringCalc.get(y);

            for (char s : (x.toString() + y.toString()).toCharArray()) {
                if (dictDepth.containsKey(s)) {
                    dictDepth.put(s, dictDepth.get(s) + 1);
                } else {
                    throw new IllegalArgumentException("Character not in dict_depth");
                }
            }

            dictStringCalc.remove(x);
            dictStringCalc.remove(y);

            dictStringCalc.put(x.toString() + y.toString(), xCnt + yCnt);
        }

        int ans = 0;

        for (Map.Entry<Character, Integer> entry : dictDepth.entrySet()) {
            char k = entry.getKey();
            int v = entry.getValue();
            ans += dictString.get(k) * v;
        }

        if (dictString.size() == 1) {
            ans = S.length();
        }

        System.out.println(ans);
    }
}