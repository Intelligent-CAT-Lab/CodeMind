Below is the Java translation of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String X = scanner.next();
        int ans = 0;
        int memo = 0;
        for (int i = 0; i < X.length(); i++) {
            if (X.charAt(i) == 'T') {
                if (memo == 0) continue;
                else memo--;
            } else {
                memo++;
            }
        }
        System.out.println(memo * 2);
        scanner.close();
    }
}
```

You would use the following `main` method to create a simple Java program that reads an input from the console, processes it according to the provided logic, and then prints out the calculated result.

Here's how you could run a test with this program:

1. Compile the program using a Java compiler, for example:
   ```
   javac Main.java
   ```

2. Run the program and provide the test input (`TSTTSS`):
   ```
   java Main
   TSTTSS
   ```

3. You should then see the expected output (`101`).
