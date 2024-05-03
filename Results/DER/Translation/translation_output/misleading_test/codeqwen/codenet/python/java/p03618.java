Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sortedString = new String(chars);
        int l = sortedString.length();
        int res = l * (l - 1) / 2 + 1;
        for (int i = 0; i < l; i++) {
            int p = 1;
            while (i + 1 < l && sortedString.charAt(i) == sortedString.charAt(i + 1)) {
                p++;
                i++;
            }
            res -= p * (p - 1) / 2;
        }
        System.out.println(res);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, sorts it, and then calculates the number of distinct substrings. It does this by iterating over the string and counting the number of consecutive identical characters. It then subtracts the number of pairs of identical characters from the total number of substrings.
