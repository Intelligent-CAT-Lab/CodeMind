Below is the equivalent Java code for the given Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int D = scanner.nextInt();
        int x = scanner.nextInt();
        
        for (int i = 0; i < 10; i++) {
            x = r * x - D;
            System.out.println(x);
        }
        
        scanner.close();
    }
}
```

When you run this Java program, it will read three integers from the input, just like the Python code did, and then print out the calculated values for the next ten iterations. Make sure to provide the input in the same format as stated in the test case (`2 1 2`), if running this code in a console-based Java environment.
