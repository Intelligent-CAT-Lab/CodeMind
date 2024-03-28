Here's the translated Java code for the given Python snippet:

```java
import java.util.Scanner;

public class MinAbsDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int a = 99999;
        for (int i = 0; i < S.length() - 2; i++) {
            int num = Integer.parseInt(S.substring(i, i + 3));
            a = Math.min(Math.abs(753 - num), a);
        }
        System.out.println(a);
        scanner.close();
    }
}
```

When you run this Java program, it should produce the expected output "34" for the input "1234567876".
