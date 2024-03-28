```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine().trim();
        HashMap<Character, Integer> counter = new HashMap<>();

        for (char c : line.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        System.out.println((counter.getOrDefault('g', 0) - counter.getOrDefault('p', 0)) / 2);
    }
}
```
