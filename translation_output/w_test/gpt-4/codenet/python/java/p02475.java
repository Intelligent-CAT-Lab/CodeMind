Here is the translated version of the provided Python code into Java:

```java
import java.util.Scanner;

public class RoundFunction {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(round(a, b));
        scanner.close();
    }
    
    public static int round(int a, int b) {
        if (a * b < 0) {
            return -Math.floorDiv(-a, b);
        } else {
            return Math.floorDiv(a, b);
        }
    }
}
```

To test the input "5 8" as in your example, the program would be run, and the user would input "5 8" (without quotes) when prompted. The program should output `0` as expected.
