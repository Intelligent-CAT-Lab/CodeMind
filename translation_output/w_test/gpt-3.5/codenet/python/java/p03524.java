```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        Map<Character, Integer> sFrqDict = new HashMap<>();
        sFrqDict.put('a', 0);
        sFrqDict.put('b', 0);
        sFrqDict.put('c', 0);

        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            sFrqDict.put(s, sFrqDict.get(s) + 1);
        }

        int minFrq = Integer.MAX_VALUE;
        int maxFrq = Integer.MIN_VALUE;
        for (int frq : sFrqDict.values()) {
            minFrq = Math.min(minFrq, frq);
            maxFrq = Math.max(maxFrq, frq);
        }

        if (maxFrq - minFrq <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
