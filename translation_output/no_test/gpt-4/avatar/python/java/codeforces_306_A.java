Below is the translated code from Python to Java:

```java
import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int q = n / m;
        int r = n % m;
        int[] a = new int[m];

        for (int i = 0; i < m; i++) {
            a[i] = q;
        }

        for (int i = 0; i < r; i++) {
            a[i] += 1;
        }

        for (int i = 0; i < m; i++) {
            System.out.print(a[i] + " ▁ ");
        }
        input.close();
    }
}
```

To run this Java program, you need to compile it first and execute the class file. Make sure to provide inputs as expected, that is two space-separated integers when prompted. The scanner takes care of the space-separated inputs. The Java code uses the `Scanner` class for user input, mirrors the flooring division and the modulo operations, initializes the array `a` with `q`, increments the first `r` elements by 1, and finally prints the array elements followed by the special character "▁". Note that the `System.out.print` method automatically prints a space after each number, so you don't need to include an extra space in the string literal like in the Python code.

