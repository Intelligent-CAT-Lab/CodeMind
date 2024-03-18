Below is the translated code from Python to Java, along with a snippet to handle the input and output:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        scanner.close();

        if (((H * W) * (X + Y)) % 2 == 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```

When the input:
```
3 5 1 4
```
is provided to the Java program above, it will produce the output:

```
No
```
