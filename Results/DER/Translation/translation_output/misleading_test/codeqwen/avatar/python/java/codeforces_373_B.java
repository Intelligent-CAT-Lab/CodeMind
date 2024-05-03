Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int w = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);
        int max_length = 0;
        int available_digits = w / k;
        while (available_digits > 0) {
            int current_cost_per_n = String.valueOf(m).length();
            int same_cost_until = (int) Math.pow(10, current_cost_per_n);
            int usable_numbers = same_cost_until - m;
            int use_digits = usable_numbers * current_cost_per_n;
            m = same_cost_until;
            if (available_digits >= use_digits) {
                max_length += usable_numbers;
                available_digits -= use_digits;
            } else {
                max_length += available_digits / current_cost_per_n;
                available_digits = 0;
            }
        }
        System.out.println(max_length);
    }
}
```

This Java code does the same thing as the Python code. It reads the input from the standard input, splits it into three integers, calculates the maximum length, and prints the result.
