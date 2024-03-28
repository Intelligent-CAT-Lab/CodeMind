Here is the translated Java code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        
        if (Math.sqrt(8 * x + 1) == Math.floor(Math.sqrt(8 * x + 1))) {
            double a = (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println((int)a);
        } else {
            double xFloor = Math.floor((-1 + Math.sqrt(1 + 8 * x)) / 2);
            System.out.println((int)xFloor + 1);
        }
    }
}
```

And you would run the program and input "6" as specified in your test case to check if the expected output "69" is produced. Remember that `Math.sqrt` and the other Math functions will automatically work with doubles in Java, so the explicit Python floor division `//` in the `else` block is replaced by `Math.floor()` and then `/ 2` to achieve the same effect.
