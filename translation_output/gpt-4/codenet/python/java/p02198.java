Here's the equivalent Java code for the provided Python snippet, which reads two integers from the standard input (presuming they are entered on the same line separated by a space) and prints out their product:

```java
import java.util.Scanner;

public class MultiplyIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        System.out.println(N * M);
        
        scanner.close();
    }
}
```

In this Java code, I've used the `Scanner` class to read input from the user. The method `nextInt()` is used to read the next token from the input as an `int`. After the multiplication, the program prints out the result and then closes the `Scanner` to free resources.
