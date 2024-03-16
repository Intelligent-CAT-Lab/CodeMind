Here's the equivalent code in Java. Remember that Java needs a class and a main method to run, and it uses `Scanner` for input instead of `input()`.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("ABC" + s);
        scanner.close();
    }
}
```
