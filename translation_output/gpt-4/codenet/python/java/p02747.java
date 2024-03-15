Here is the translated Python code into Java:

```java
import java.util.Scanner;

public class HiChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        if (S.equals("hi") || S.equals("hihi") || S.equals("hihihi") || S.equals("hihihihi") || S.equals("hihihihihi")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```

When translating the code, please note the following:

- We use `Scanner` in Java for input operations.
- String comparison in Java is done using `.equals()` method, not `==`.
- `System.out.println` is used instead of `print` for output in Java.
- Java code is typically organized within a class, in this case, a class named `HiChecker`.
