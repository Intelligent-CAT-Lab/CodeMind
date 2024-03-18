Here's the equivalent Java code for the given Python snippet. Remember to get user input in Java, you can use a `Scanner` object as shown below:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        int i = 1;
        int a = 0;
        while (true) {
            a = a + X;
            if (a % 360 == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
        scanner.close();
    }
}
```

To use the provided test input and get the expected output, you would run the program and input `1` when prompted. The expected output `435` would be printed to the console.
