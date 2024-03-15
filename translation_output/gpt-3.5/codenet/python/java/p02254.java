```java
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CompressionAlgorithm {

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

        Map<Character, Integer> dictStringCalc = new HashMap<>(dictString);

        while (dictStringCalc.size() != 1) {
            Character x = null;
            Character y = null;

            for (Map.Entry<Character, Integer> entry : sortMapByValue(dictStringCalc)) {
                if (x == null) {
                    x = entry.getKey();
                    continue;
                }

                if (y == null) {
                    y = entry.getKey();
                    break;
                }
            }

            if (x != null && y != null) {
                for (char s : ("" + x + y).toCharArray()) {
                    if (dictDepth.containsKey(s)) {
                        dictDepth.put(s, dictDepth.get(s) + 1);
                    } else {
                        throw new IllegalArgumentException("Character not found in dictDepth");
                    }
                }

                dictStringCalc.remove(x);
                dictStringCalc.remove(y);

                dictStringCalc.put((char)(x + y), dictString.get(x) + dictString.get(y));
            }
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

    private static List<Map.Entry<Character, Integer>> sortMapByValue(Map<Character, Integer> map) {
        List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(map.entrySet());
        Collections.sort(sortedList, Map.Entry.comparingByValue());
        return sortedList;
    }

}
```
```
