Here's a Java translation of the Python code provided, along with the use of a Scanner to handle input, and a flag to indicate if a solution was found:

```java
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean found = false;
        
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 20; j++) {
                if (4 * i + 7 * j == N) {
                    System.out.println("Yes");
                    found = true;
                    break;
                }
            }
            if(found) {
                break;
            }
        }
        
        if (!found) {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```

You can compile and run this Java program and input `11` as the test case value, and it should output `Yes`, just as the Python code would.

Keep in mind that Java does not have an equivalent to Python's `exit()` -- to exit a loop prematurely, you can use the `break` keyword. If you want to exit the entire program, you would use `System.exit(0);` but that is usually not good practice when only breaking out of loops suffice. Here, we've used a boolean flag to track whether the condition has been met and break out of both nested loops.
