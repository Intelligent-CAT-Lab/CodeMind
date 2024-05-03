Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int even = n * (n-1) / 2;
        int odd = m * (m-1) / 2;
        
        System.out.println(even + odd);
    }
}
```

In Java, we use `Scanner` class to read input from the user. The `nextInt()` method is used to read an integer from the user. The `/` operator is used for integer division in Java, unlike Python where `//` is used for floor division.
