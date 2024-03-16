Here is the equivalent Java code for the given Python code. Keep in mind that Java is statically typed, so you have to define the type of each variable. In this example, `Scanner` is used to read input from the standard input, and the output is printed using `System.out.println`.

```java
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        boolean cielWon = false;

        while (y > 1 && x * 10 + y > 21) {
            int t = Math.min(x, 2);
            x -= t;
            y -= (2 - t) * 10 + 2;
            if (y < 2 || 10 * x + y < 22) {
                cielWon = true;
                break;
            }
            y -= 2;
            t = Math.min(2, y / 10);
            y -= 10 * t;
            x -= 2 - t;
        }

        System.out.println(cielWon ? "Ciel" : "Hanako");
        scanner.close();
    }
}
```

When you compile and run this Java code with the test input "1 20", it will produce the expected output "Ciel".
