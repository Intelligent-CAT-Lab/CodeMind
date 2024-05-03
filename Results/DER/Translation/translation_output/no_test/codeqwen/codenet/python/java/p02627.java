Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        if (n.equals(n.toUpperCase())) {
            System.out.println("A");
        } else if (n.equals(n.toLowerCase())) {
            System.out.println("a");
        }
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user. The `equals` method is used to compare the input string with its uppercase version and lowercase version. If the input string is equal to its uppercase version, it means the input is in uppercase and we print "A". If the input string is equal to its lowercase version, it means the input is in lowercase and we print "a".
