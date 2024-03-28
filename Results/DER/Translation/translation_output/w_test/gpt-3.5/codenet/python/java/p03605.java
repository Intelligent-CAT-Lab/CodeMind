```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        if (input.contains("9")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
