Below is the translated code from Python to Java. Java does not have a direct equivalent to Python's `input()` for console input, so you'll need to use a `Scanner` object to read from `System.in`. Additionally, Java arrays are strongly typed, so if we are expecting integers, we will define the arrays with `int` type.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] g = new int[50];
        int[] h = new int[50];
        h[1] = 3;
        g[1] = 6;
        
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        
        for (int i = 2; i <= X; i++) {
            h[i] = g[i - 1] + 1;
            g[i] = 2 * h[i];
        }
        System.out.println(g[X]);
        
        scanner.close();
    }
}
```

Please note that in Java, array index starts from `0`, just as in Python. The default value for uninitialized `int` array elements is `0`. The Java `main` method also must be within a class. Here `Main` class is used, but you might need to change this to fit the context in which you are using the code. Additionally, we must close the `Scanner` object to avoid any resource leaks, hence the `scanner.close()` at the end of the method.
