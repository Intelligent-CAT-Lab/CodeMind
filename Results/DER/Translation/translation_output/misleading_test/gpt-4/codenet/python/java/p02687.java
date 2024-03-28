Here is the equivalent Java code for the provided Python code.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        
        if (string.equals("ARC")) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
        
        scanner.close();
    }
}
```

This Java code uses `Scanner` for input (equivalent to Python's `input()`) and `System.out.println` for output (equivalent to Python's `print()`). It uses `.equals()` to compare strings because in Java, strings are compared for content equality using `.equals()` not `==` which is used for reference equality.
