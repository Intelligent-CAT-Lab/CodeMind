Below is the translated code from Python to Java that provides the same functionality as the given Python code:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int i = 1;
        int j = n * n;
        while (i < j) {
            System.out.println(i + " " + j);
            i++;
            j--;
        }
    }
}
```

This Java program reads an integer from the input, calculates the square of that number, and then prints pairs of numbers (i, j) in ascending and descending order, respectively, stopping when `i` is no longer less than `j`. The output format matches the specified "i j" structure from the original Python program.
