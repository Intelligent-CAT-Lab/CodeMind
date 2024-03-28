```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        int Y = input.nextInt();
        int Z = input.nextInt();

        int answer = 0;
        int width = Y + 2 * Z;

        while (width <= X) {
            answer++;
            width += Y + Z;
        }

        System.out.println(answer);
    }
}
```
