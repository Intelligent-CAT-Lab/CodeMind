```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);

        int result = charArray.length * (charArray.length - 1) / 2 + 1;
        int p = 1;

        for (int i = 0; i < sortedString.length(); i++) {
            if (i == sortedString.length() - 1 || sortedString.charAt(i) != sortedString.charAt(i + 1)) {
                result -= p * (p - 1) / 2;
                p = 1;
            } else {
                p++;
            }
        }

        System.out.println(result);
    }
}
```
