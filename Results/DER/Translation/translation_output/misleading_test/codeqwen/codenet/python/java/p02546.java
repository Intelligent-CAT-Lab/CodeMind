Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.endsWith("s")) {
            System.out.println(s + "es");
        } else {
            System.out.println(s + "s");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, checks if the last character is 's', and if it is, it appends 'es' to the string. If the last character is not 's', it appends 's'. The result is then printed to the console.
