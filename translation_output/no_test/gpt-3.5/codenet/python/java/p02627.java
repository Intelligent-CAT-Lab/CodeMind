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
