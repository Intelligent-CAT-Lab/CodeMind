```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if ((s.charAt(0) == s.charAt(s.length()-1) && s.length() % 2 == 0) || (s.charAt(0) != s.charAt(s.length()-1) && s.length() % 2 == 1)) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }
}
```
