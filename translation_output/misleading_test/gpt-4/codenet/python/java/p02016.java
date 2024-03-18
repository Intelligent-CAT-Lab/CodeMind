Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if ("ani".equals(userInput)) {
            System.out.println("squareo1001");
        } else {
            System.out.println("e869120");
        }
        scanner.close();
    }
}
```

When you run this Java program, it will wait for the user to input a string. If the string is "ani", it will print "squareo1001"; otherwise, it will print "e869120".
