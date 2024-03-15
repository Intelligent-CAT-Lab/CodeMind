Here is the equivalent Java code for the given Python code:

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String B = scanner.nextLine();

        List<String> O = Arrays.asList("1 1 0", "0 0 1");

        if (O.contains(B)) {
            System.out.println("Open");
        } else {
            System.out.println("Close");
        }

        scanner.close();
    }
}
```

Please note that Java requires more boilerplate code, such as the class and method declarations, as well as explicit import statements for Scanner and data structure classes like Arrays and List.
