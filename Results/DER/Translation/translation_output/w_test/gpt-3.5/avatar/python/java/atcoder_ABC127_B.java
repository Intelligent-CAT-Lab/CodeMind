```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int r = Integer.parseInt(input[0]);
        int D = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        for (int i = 0; i < 10; i++) {
            x = r * x - D;
            System.out.println(x);
        }
    }
}
```
