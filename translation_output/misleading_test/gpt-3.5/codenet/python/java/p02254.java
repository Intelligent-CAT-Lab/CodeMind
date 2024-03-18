```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

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

            for (char s : (x + "" + y).toCharArray()) {
                if (dictDepth.containsKey(s)) {
                    dictDepth.put(s, dictDepth.get(s) + 1);
                } else {
                    throw new RuntimeException("Invalid character");
                }
            }

            dictStringCalc.remove(x);
            dictStringCalc.remove(y);

            dictStringCalc.put(x + "" + y, xCnt + yCnt);
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
```
```
