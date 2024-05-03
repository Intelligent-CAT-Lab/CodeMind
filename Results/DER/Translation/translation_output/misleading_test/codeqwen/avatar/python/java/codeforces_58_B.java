Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = a; i > 0; i--) {
            if (a % i == 0) {
                System.out.print(i + " ");
                a = i;
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then it loops from that integer down to 1, printing each integer that divides the input evenly. When it finds an integer that divides the input evenly, it prints that integer and sets the input to that integer, so that the loop will stop once it has printed all the factors.
