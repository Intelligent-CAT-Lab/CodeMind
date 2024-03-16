Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int ans = A - 2 * B;

        if (ans < 0) {
            ans = 0;
        }
        
        System.out.println(ans);
        
        scanner.close();
    }
}
```

In Java, you need to `import java.util.Scanner` to get input from the user. Then, you create an instance of `Scanner`, and use its `nextInt()` method to read integers. After performing the calculations, you check if `ans` is negative and if it is, you set it to `0`. Finally, you print out the result with `System.out.println()` and close the scanner to free resources.
