```java
import java.util.Scanner;

public class CheckFirstAndLastChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        char firstChar = s.charAt(0);
        char lastChar = s.charAt(s.length() - 1);

        if (firstChar == 'x' && lastChar == 'x') {
            System.out.println("x");
        } else {
            System.out.println("o");
        }
    }
}
```
