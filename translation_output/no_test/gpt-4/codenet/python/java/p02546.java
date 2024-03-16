Below is the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Pluralize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        if (s.endsWith("s")) {
            System.out.println(s + "es");
        } else {
            System.out.println(s + "s");
        }
        
        scanner.close();
    }
}
```

This Java code does the same thing as the original Python code: it reads a string from the input, checks if it ends with the letter 's', and then prints the plural form accordingly by appending either "es" (if it ends with 's') or "s" (if it doesn't).
