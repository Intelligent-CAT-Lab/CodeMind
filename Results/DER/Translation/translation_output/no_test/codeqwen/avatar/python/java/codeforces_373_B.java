Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        int w = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        int k = Integer.parseInt(line[2]);
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

This Java code does the same thing as your Python code. It reads three integers from the standard input, calculates the maximum length, and prints it to the standard output.
