Here is the Java version of your Python code:

```java
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String S = "serval";
        System.out.println(min(S));
    }

    public static int min(String S) {
        Map<Character, Integer> C = new HashMap<>();
        for (char a : S.toCharArray()) {
            C.put(a, C.getOrDefault(a, 0) + 1);
        }

        int[] o = new int[C.size()];
        int i = 0;
        for (char a : C.keySet()) {
            int j = 0;
            int m = 0;
            for (char b : S.toCharArray()) {
                if (a == b) {
                    j = 0;
                } else {
                    j += 1;
                    m = Math.max(m, j);
                }
            }
            o[i++] = m;
        }

        int min = Integer.MAX_VALUE;
        for (int num : o) {
            min = Math.min(min, num);
        }

        return min;
    }
}
```

This Java code does the same thing as your Python code. It counts the occurrences of each character in the string, then for each character, it counts the number of consecutive characters that are not the same and keeps track of the maximum number of such consecutive characters. Finally, it returns the minimum of all these maximum numbers.
