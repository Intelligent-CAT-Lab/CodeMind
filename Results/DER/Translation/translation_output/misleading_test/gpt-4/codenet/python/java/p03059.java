Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();
        
        System.out.println((t / a) * b);
        
        scanner.close();
    }
}
```

Remember that Java is statically typed, so we need to declare the type of each variable. Additionally, Java uses `System.in` and `Scanner` to read from the standard input, and `System.out.println` to write to the standard output. Integer division works the same way in both Java and Python. Also, in Java, code is organized into classes and methods. In this case, the `main` method is the entry point of the program.
