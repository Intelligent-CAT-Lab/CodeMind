```java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String input = "serval";
        char[] S = input.toCharArray();
        HashMap<Character, Integer> counter = new HashMap<>();

        for (char c : S) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        int[] output = new int[S.length];

        for (char a : counter.keySet()) {
            int j = 0;
            int m = 0;
            for (char b : S) {
                if (a == b) {
                    j = 0;
                } else {
                    j++;
                    m = Math.max(m, j);
                }
            }
            output[a] = m;
        }

        int min = Integer.MAX_VALUE;
        for (int num : output) {
            if (num != 0) {
                min = Math.min(min, num);
            }
        }

        System.out.println(min);
    }
}
```
