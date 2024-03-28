```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] values = input.split(" ");
        int A = Integer.parseInt(values[0]);
        int B = Integer.parseInt(values[1]);

        System.out.println(A + B);
    }
}
```
