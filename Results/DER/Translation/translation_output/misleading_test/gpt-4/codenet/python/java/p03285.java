Here is the equivalent Java code that performs the same operation as the given Python code:

```java
import java.util.Scanner;

public class SolveEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        boolean found = false;

        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 20; j++) {
                if (4 * i + 7 * j == N) {
                    System.out.println("Yes");
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```
To ensure that the code works correctly, you can compile and run it using the given test input "11", and it will print "Yes" as the expected output.
