Here's the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class OverlapSegment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println(Math.max(0, Math.min(b, d) - Math.max(a, c)));
    }
}
```

This Java code snippet does the same computation as the Python script. The `Scanner` class is used for input handling, and the `Math.max()` and `Math.min()` methods are used to perform the maximum and minimum calculations, respectively. Make sure the test input fits in one line when you provide the input for this program as it uses space as a delimiter to read integers.
