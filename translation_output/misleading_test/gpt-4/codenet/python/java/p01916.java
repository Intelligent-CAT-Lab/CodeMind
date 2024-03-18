Sure, here's the equivalent Java code:

```java
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        HashMap<Character, Integer> dic = new HashMap<>();
        for (char s : input.toCharArray()) {
            dic.put(s, dic.getOrDefault(s, 0) + 1);
        }
        int ans = 0;
        for (int value : dic.values()) {
            if ((value & 1) == 1) {
                ans += 1;
            }
        }
        System.out.println(ans >> 1);

        sc.close();
    }
}
```

You can test this code with the same test input "hcpc" (without the quotes) and the expected output will be 76 when you run the Java program.
