Here is the equivalent Java code for the given Python code snippet:

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

This Java code will produce the same result as your Python code, prompting the user for input and then printing the value of `i` when the accumulated sum `a` (incremented by `X` in every iteration) is a multiple of 360.
