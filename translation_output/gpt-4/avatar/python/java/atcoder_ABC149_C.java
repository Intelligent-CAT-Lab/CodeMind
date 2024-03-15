Certainly! Below is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        while (true) {
            if (hoge(N)) {
                System.out.println(N);
                System.exit(0);
            }
            N++;
        }
    }
    
    public static boolean hoge(int n) {
        if (n == 2) {
            return true;
        }
        for (int x = 2; x <= (int) Math.sqrt(n) + 1; x++) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }
}
```

Please note the following differences and adjustments between Python and Java:

- In Java, methods and the main code block must be encapsulated within a class.
- We use `Scanner` to read input from the user.
- The `hoge` function is translated to a static method called `hoge`.
- `System.exit(0);` is used to terminate the program.
- Loops, variable declaration, and type casting follow Java's syntax rules.
