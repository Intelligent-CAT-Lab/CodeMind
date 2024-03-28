```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] S = input.toCharArray();
        Map<Character, Integer> charCounts = new HashMap<>();

        for (char c : S) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        int[] o = new int[charCounts.size()];

        int index = 0;
        for (char key : charCounts.keySet()) {
            int j = 0;
            int m = 0;
            for (char b : S) {
                if (key == b) {
                    j = 0;
                } else {
                    j++;
                    m = Math.max(m, j);
                }
            }
            o[index] = m;
            index++;
        }

        int min = Integer.MAX_VALUE;
        for (int value : o) {
            if (value < min) {
                min = value;
            }
        }

        System.out.println(min);
    }
}
```
```
