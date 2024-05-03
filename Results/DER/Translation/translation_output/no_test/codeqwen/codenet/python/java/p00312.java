Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int D = Integer.parseInt(input[0]);
        int L = Integer.parseInt(input[1]);
        int ans = D / L + (D - L * (D / L));
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, performs the division and modulus operations, and then prints the result.
