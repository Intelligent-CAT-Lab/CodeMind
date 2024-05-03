Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.toLowerCase().replace('a', 'A').replace('e', 'E').replace('i', 'I').replace('o', 'O').replace('u', 'U').replace('A', 'a').replace('E', 'e').replace('I', 'i').replace('O', 'o').replace('U', 'u'));
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, converts it to lowercase, and then replaces all vowels with their uppercase counterparts and vice versa.
