Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine().trim();
        int N = S.length();

        int zero_start = 0;
        int zero_start_counter = 0;
        for (int i = 0; i < N; i++) {
            if (zero_start != Character.getNumericValue(S.charAt(i))) {
                zero_start_counter++;
            }
            zero_start = (zero_start + 1) % 2;
        }

        int one_start_counter = N - zero_start_counter;

        System.out.println(Math.min(zero_start_counter, one_start_counter));
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, counts the number of zeros and ones in the string, and then prints the minimum of the two counts.
