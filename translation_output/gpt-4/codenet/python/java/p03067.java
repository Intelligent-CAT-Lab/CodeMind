Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        
        if ((a < c && c < b) || (a > c && c > b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

Please note that Java is strongly typed, so we need to declare the type of each variable (`a`, `b`, `c`). Also, Java uses a `Scanner` class for input, and we must close it after we're done to release the resources it may be holding on to. Furthermore, the print statements have been adapted to use `System.out.println` for Java.
