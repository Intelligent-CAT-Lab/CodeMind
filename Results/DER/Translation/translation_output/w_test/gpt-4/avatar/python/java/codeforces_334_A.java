Here is the translation of the provided Python code into Java:

```java
import java.util.Scanner;

public class ZigZagNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int i = 1, j = n * n;
        while (i < j) {
            System.out.print(i + " " + j + " ");
            i++;
            j--;
            if (i % n == 1) {
                System.out.println();
            }
        }
        
        scanner.close();
    }
}
```

Explanation:
- `Scanner scanner = new Scanner(System.in);` is used to create a new `Scanner` object to read input from standard input.
- `int n = scanner.nextInt();` reads an integer from the input.
- `int i = 1, j = n * n;` initializes two variables `i` and `j` with the values 1 and n*n, respectively.
- The `while` loop continues until `i` is less than `j`.
- `System.out.print(i + " " + j + " ");` prints the values of `i` and `j` separated by a space without a newline.
- `i++` increments `i`, and `j--` decrements `j`.
- The `if (i % n == 1)` condition checks whether to add a newline after printing `n` pairs of numbers.
- `System.out.println();` prints a newline.
- `scanner.close();` closes the scanner.
