Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = scanner.nextInt();
        int ans = 0;
        ans += 1 * (Math.min(a, k));
        k -= Math.min(a, k);
        ans += 0 * (Math.min(b, k));
        k -= Math.min(b, k);
        ans += -1 * (Math.min(c, k));
        k -= Math.min(c, k);
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the user, calculates the minimum of the first two integers and the third integer with the third integer, and adds the result to the answer. Then it subtracts the minimum of the first two integers and the third integer with the third integer from the third integer and assigns the result to the third integer. This process is repeated until the third integer is less than or equal to zero. Finally, it prints the answer.
