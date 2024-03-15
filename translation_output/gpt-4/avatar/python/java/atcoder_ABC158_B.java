Here is your Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int ans = N / (A + B) * A;
        int rem = N % (A + B);
        ans += Math.min(rem, A);

        System.out.println(ans);

        sc.close();
    }
}
```

Please note that the above Java code does the same operations as the provided Python code:
1. Takes input for the variables `N`, `A`, and `B`.
2. Calculates the answer (`ans`) based on the formula from the Python code.
3. Prints out the result.
