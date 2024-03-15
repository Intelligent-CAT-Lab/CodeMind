Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = sum(ij((int) Math.sqrt(n))) - 2;
        System.out.println(result);
    }

    private static int sum(int[] ijValues) {
        return ijValues[0] + ijValues[1];
    }

    private static int[] ij(int x) {
        int i = x;
        while (i > 0) {
            if (n / i == n / i) {
                return new int[]{i, n / i};
            }
            i--;
        }
        return new int[]{0, 0}; // default return value if no solution found
    }
}
```

Make sure to note the differences between Python and Java, such as the way inputs are handled and the method signatures. In Java, we have to explicitly define the type of variables, and we use loops differently compared to Python. 

Additionally, I have changed the division logic slightly, since `n / i` will already be the equivalent of Python's `n // i` because Java's `/` operator with integer operands performs integer division. Thus, `n/i == n//i` always holds true in Java for integer `n` and `i`, making the check unnecessary.
