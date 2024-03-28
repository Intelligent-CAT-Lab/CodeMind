Below is the Java translation of the given Python code. I'm using `Scanner` to take the input from the user, and an if-else statement to check the condition similar to the Python code.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if (a == b && b == c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```

Please note that in the Java code, each integer is read separately by calling `nextInt()` on a `Scanner` object. This is analogous to using `map(int, input().split())` in Python, which applies the `int` function to each element (number) in the input split by space.
