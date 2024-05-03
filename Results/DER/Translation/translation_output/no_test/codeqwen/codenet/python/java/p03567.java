Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        if (S.contains("AC")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user. The `contains` method is used to check if the string `S` contains the substring "AC". If it does, the program prints "Yes", otherwise it prints "No".
