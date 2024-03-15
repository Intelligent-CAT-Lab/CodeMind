Below is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);
        
        int ans = n * a > b ? b : n * a;
        
        System.out.println(ans);
        
        scanner.close();
    }
}
```

This Java code assumes input is provided in the same way as in the Python code: three integers on one line separated by spaces. It makes use of the `Scanner` class to read input from the standard input stream. Remember to close the `Scanner` object after use to prevent resource leaks. The ternary operator `? :` is used to substitute for the Python inline `if-else` expression.
