Here's the equivalent code in Java:

```java
import java.util.Scanner;

public class Main {

    public static String isGoodOrBad(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return "Bad";
            }
        }
        return "Good";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(isGoodOrBad(s));
    }
}
```

When you input `3776`, the expected output would be `Bad` as per the test case you provided.
