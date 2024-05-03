Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        char[] nArray = n.toCharArray();
        int lb = 0, ub = nArray.length;
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(9 * mid, nArray)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        System.out.println(ub);
    }

    public static boolean check(int x, char[] nArray) {
        int g = 0;
        for (char i : nArray) {
            x -= (x + g - Character.getNumericValue(i)) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, reverses it, and then checks if it can be represented as a sum of non-negative integers. If it can, it prints the largest possible sum. If it can't, it prints the largest possible sum that can be represented as a sum of non-negative integers.
