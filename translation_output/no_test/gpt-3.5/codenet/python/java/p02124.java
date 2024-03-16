```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        String result = "ai1333" + "3".repeat(input / 100);
        System.out.println(result);
    }
}
```
