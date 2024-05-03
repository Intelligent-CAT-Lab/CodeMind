Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            if (c != 'A') {
                sb.append(c);
            }
        }
        String result = sb.toString();
        boolean b = result.equals("KIHBR");
        if (b) {
            String[] split = result.split("(?<!^)A");
            int[] X = {1, 0, 0, 1, 1, 1, 1};
            for (int i = 0; i < split.length; i++) {
                if (split[i].length() > X[i]) {
                    b = false;
                    break;
                }
            }
        }
        System.out.println(b ? "YES" : "NO");
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, removes all 'A' characters, checks if the resulting string is "KIHBR", and if it is, it checks if the lengths of the substrings are less than or equal to the corresponding values in the array X. If all these conditions are met, it prints "YES", otherwise it prints "NO".
