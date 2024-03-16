```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ans = 0;
        int length = 0;

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
                length++;
                ans = Math.max(ans, length);
            } else {
                length = 0;
            }
        }

        System.out.println(ans);
    }
}
```
