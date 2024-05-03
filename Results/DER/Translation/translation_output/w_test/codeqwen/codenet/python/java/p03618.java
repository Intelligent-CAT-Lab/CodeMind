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

This Java code does the same thing as your Python code. It reads a string from the user, sorts it, and then counts the number of unique characters. It then calculates the number of pairs of characters that can be formed from the unique characters and subtracts this number from the total number of pairs of characters that can be formed from all characters. The result is then printed to the console.
