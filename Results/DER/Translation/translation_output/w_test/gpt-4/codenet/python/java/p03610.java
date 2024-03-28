Here's the equivalent Java code that will produce the same result as the provided Python code for the given test input:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }
        
        System.out.println(result.toString());
        scanner.close();
    }
}
```

When you run this Java program and input "atcoder", it will output "acdr" as expected.
