Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(ij(n));
    }

    public static int ij(int x) {
        for (int i = x; i > 0; i--) {
            if (n / i == n / (double) i) {
                return i + n / i;
            }
        }
        return 0;
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then calls the `ij` function with that integer. The `ij` function iterates from the input integer down to 1, checking if the input integer is divisible by each integer in that range. If it is, it returns the sum of the integer and the result of dividing the input integer by that integer. If it doesn't find any such integer, it returns 0. The main function then prints the result of the `ij` function.
