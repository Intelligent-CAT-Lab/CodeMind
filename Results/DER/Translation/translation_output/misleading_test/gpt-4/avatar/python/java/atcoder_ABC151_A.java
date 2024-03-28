Here's the translated Java code that replicates the functionality of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char character = input.charAt(0);
        char nextChar = (char) (character + 1);
        System.out.println(nextChar);
        scanner.close();
    }
}
```

Test input:
```
c
```

Expected output:
```
]d
```
