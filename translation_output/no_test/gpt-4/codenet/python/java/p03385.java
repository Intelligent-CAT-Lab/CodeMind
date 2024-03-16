Sure! Below is the equivalent Java code for the provided Python code.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        if (S.contains("a") && S.contains("b") && S.contains("c")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}
```

This Java code reads a line of input from the user, checks if the string contains the characters 'a', 'b', and 'c', and prints "Yes" if all are present, otherwise prints "No".
