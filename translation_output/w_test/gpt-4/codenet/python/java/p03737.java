Here's the Java code equivalent to the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next().toUpperCase();
        String s2 = scanner.next().toUpperCase();
        String s3 = scanner.next().toUpperCase();
        scanner.close();

        System.out.print(s1.charAt(0));
        System.out.print(s2.charAt(0));
        System.out.println(s3.charAt(0));
    }
}
```

You can test this code with the test input provided. When you input `atcoder beginner contest`, the expected output will be `ABC`.
