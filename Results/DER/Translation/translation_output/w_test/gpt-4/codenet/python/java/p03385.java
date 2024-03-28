Here's the translated Java code:

```java
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (s.contains("a") && s.contains("b") && s.contains("c")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
```

If you run this Java code with the input "bac", the output will be "Yes", just as expected from the Python code.
