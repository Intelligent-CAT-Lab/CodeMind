```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String replacedInput = input.replace(",", "â");
        System.out.println(replacedInput);
    }
}
```
