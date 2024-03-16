Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n == 1) {
            System.out.println("Hello World");
            // System.exit(0); // Uncomment if you want to match the Python behavior of exiting immediately
            return; // Exits the main method
        }
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
    }
}
```

For your specific test input of `1`, you would get the expected output "Hello World" as follows:

Test input:
```
1
```

Expected output:
```
Hello World
```

Note that I commented out the `System.exit(0)` line because in many contexts it's not necessary or desirable to forcibly exit the entire program. Instead, I'm using `return;` to exit the `main` method, which is equivalent to reaching the end of the method. Uncomment the `System.exit(0);` line if you do want to forcibly terminate the program immediately after printing "Hello World", matching the behavior of the `exit()` function in the Python code.
