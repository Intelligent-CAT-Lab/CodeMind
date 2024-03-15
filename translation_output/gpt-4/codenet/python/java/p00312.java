Here's the translated Python code to Java:

```java
import java.util.Scanner;

public class DivLan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int D = scanner.nextInt();
        int L = scanner.nextInt();
        
        int ans = D / L + (D - L * (D / L));
        System.out.println(ans);
        
        scanner.close();
    }
}
```

This Java program will produce the equivalent output to the given Python code. It reads two integers `D` and `L` from the standard input, performs the computations and prints the result to the standard output.
