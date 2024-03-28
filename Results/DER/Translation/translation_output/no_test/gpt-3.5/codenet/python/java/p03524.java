```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        
        Map<Character, Integer> sFrqDict = new HashMap<>();
        sFrqDict.put('a', 0);
        sFrqDict.put('b', 0);
        sFrqDict.put('c', 0);
        
        for (char s : S.toCharArray()) {
            int count = sFrqDict.get(s) + 1;
            sFrqDict.put(s, count);
        }
        
        int[] frqs = sFrqDict.values().stream().mapToInt(Integer::intValue).toArray();
        int maxFrq = Integer.MIN_VALUE;
        int minFrq = Integer.MAX_VALUE;
        
        for (int frq : frqs) {
            maxFrq = Math.max(maxFrq, frq);
            minFrq = Math.min(minFrq, frq);
        }

        if (maxFrq - minFrq <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
