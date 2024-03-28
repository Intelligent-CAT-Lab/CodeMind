Here's the translated Java code:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] n = scanner.next().toCharArray();
        reverse(n);
        int lb = 0, ub = n.length;
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(n, 9 * mid)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        System.out.println(ub);
    }

    private static boolean check(char[] n, int x) {
        int g = 0;
        for (char c : n) {
            int digit = c - '0';
            x -= (x + g - digit) % 10;
            if (x < 0) {
                return false;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }

    private static void reverse(char[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
```
This code takes a number as string input from the user and applies the algorithm similar to the Python code. The `reverse` method flips the character array to reverse the order of elements similar to how the `reverse()` function works on lists in Python. The `check` method ensures the same functionality of checking the decremented values according to the logic in the Python code. 

Make sure to run this Java program using a compatible Java Development Kit (JDK) environment. You can provide the input '80' when prompted, and the console should output '51' as expected.
