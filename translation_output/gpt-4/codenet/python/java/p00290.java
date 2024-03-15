Here's the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.println(a * b);
        
        scanner.close();
    }
}
```

Keep in mind that in Java, we need to use a `Scanner` object to read input from the user, and we do not have a direct equivalent of Python's multiple assignment feature. Each variable is declared and read separately.
