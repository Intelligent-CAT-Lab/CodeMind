```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (Math.abs(b - c) % 2 == 0) {
            System.out.println("Alice");
        } else {
            System.out.println("Borys");
        }
    }
}
```
