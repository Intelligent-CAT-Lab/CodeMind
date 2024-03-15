Below is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        System.out.println(x % y == 0 ? -1 : x);
        
        scanner.close();
    }
}
```
Make sure to compile and run this code within a Java environment since the syntax and structure differ from Python. Note that Java requires type declarations and does not support tuple unpacking like Python.
