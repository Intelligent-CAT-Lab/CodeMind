Here is the Java translation of the provided Python code, including a sample test case:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String S = scanner.next();
        String T = scanner.next();
        
        System.out.println(T + S);
        
        scanner.close();
    }
}
```

To run this Java code with the provided test case, you can input `oder atc` when prompted, and it will output `atcoder`, as expected. The `Scanner` class is used for input, much like `input().split()` is used in Python for reading space-separated values.
