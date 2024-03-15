Here is the equivalent Java code for your Python code snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        
        int total = 1;
        int ans = 0;
        
        while (total < b) {
            ans += 1;
            total += a - 1;
        }
        
        System.out.println(ans);
        scanner.close();
    }
}
```

In this Java code, I've used `Scanner` for reading input from the user, which is the Java equivalent of Python's `input()` function. The `map()` and tuple assignment in the Python code are broken down into separate steps to handle input parsing and assignments individually in Java. I've assumed that this code is the main content of a Java class `Main`, as Java code needs to be inside a class.
