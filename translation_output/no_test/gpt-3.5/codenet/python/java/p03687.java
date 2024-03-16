```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] S = input.toCharArray();
        Map<Character, Integer> counter = new HashMap<>();
        
        for (char c : S) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        
        List<Integer> output = new ArrayList<>();
        
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
            output.add(m);
        }
        
        int min = Collections.min(output);
        System.out.println(min);
    }
}
```
