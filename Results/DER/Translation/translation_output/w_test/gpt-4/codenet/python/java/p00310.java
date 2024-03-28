Here's how you could translate the provided Python code into Java:

```java
import java.util.Scanner;

public class SumInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int p = scanner.nextInt();
        int m = scanner.nextInt();
        int c = scanner.nextInt();
        
        System.out.println(p + m + c);
        
        scanner.close();
    }
}
```

To run this code, you would compile it with a Java compiler (for instance, `javac SumInputs.java`) and run it with the Java Virtual Machine (such as with the command `java SumInputs`). When running, you would enter your test input (`10 10 20`) to get the expected output (`40`).
