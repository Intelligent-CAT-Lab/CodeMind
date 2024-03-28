Below is the translated Java code equivalent to the provided Python code:

```java
import java.util.*;

public class Main {
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
```

Here are some notes about the translation from Python to Java:
1. Java uses explicit types, so the character key and integer values are declared as `Map<Character, Integer>`.
2. Java does not have a built-in equivalent of Python's `dict.copy()` for HashMaps, so we manually copy the values with a loop.
3. The `sorted()` function in Python, which sorts by value, is replaced by using a List of Map.Entry and then sorting with `Collections.sort()` in Java.
4. String concatenation is directly done with the `+` operator in both Python and Java.
5. Java uses `System.out.println()` for outputs instead of Python's `print()`.
6. Exceptions are handled using `try-catch` in Java, but in this specific translation, we didn't replace `raise` as the original Python code will never reach that part due to logic ensuring the keys exist.
7. Java requires a class and a `main` method to run the code.
