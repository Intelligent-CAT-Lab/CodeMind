Here is the Java equivalent of the given Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] abc = new int[3];

        for (int i = 0; i < abc.length; i++) {
            abc[i] = scanner.nextInt();
        }

        Arrays.sort(abc);
        System.out.println(abc[0] + abc[1]);

        scanner.close();
    }
}
```

When you provide the test input "700 600 780" to this Java program, it will produce the expected output "1397", which corresponds to the sum of the two smallest numbers in the input array.
