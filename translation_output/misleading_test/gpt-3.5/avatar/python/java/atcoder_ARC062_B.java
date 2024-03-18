```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine().trim();
        HashMap<Character, Integer> c = new HashMap<>();
        
        for (char ch : S.toCharArray()) {
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }
        
        System.out.println((c.getOrDefault('g', 0) - c.getOrDefault('p', 0)) / 2);
    }
}
```
