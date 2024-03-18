Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class BatchSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int T = scanner.nextInt();
        
        int output;
        if (N % X != 0) {
            output = (N / X) * T + T;
        } else {
            output = (N / X) * T;
        }
        
        System.out.println(output);
    }
}
```
In this code snippet, we create a Scanner object to receive input from the user, similar to how the Python script uses input(). The N, X, and T variables are read as integers, and we then check the condition using the modulo operator to decide which expression to use to calculate the output. Finally, the result is printed to the standard output.
