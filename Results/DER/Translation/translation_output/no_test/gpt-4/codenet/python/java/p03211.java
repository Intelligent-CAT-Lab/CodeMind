Below is the translated Python code to Java. This code reads a string from the user, iterates over it to find the minimum absolute difference between the sequence "753" and every substring of length 3, and prints the minimum difference found.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int a = 99999;
        for (int i = 0; i < S.length() - 2; i++) {
            a = Math.min(Math.abs(753 - Integer.parseInt(S.substring(i, i + 3))), a);
        }

        System.out.println(a);
    }
}
```

Make sure that you have imported `java.util.Scanner` to handle user inputs correctly in Java. Note that in Java, unlike Python, you must declare the type of variables and you handle strings a bit differently (`substring` method instead of substring by indexing).
