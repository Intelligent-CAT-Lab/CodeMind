Here's the translated Java code based on the Python code you provided. I've taken the liberty to read the input from standard input using a Scanner.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        long w = Long.parseLong(line[0]);
        long m = Long.parseLong(line[1]);
        long k = Long.parseLong(line[2]);
        long max_length = 0;
        long available_digits = w / k;

        while (available_digits > 0) {
            long current_cost_per_n = String.valueOf(m).length();
            long same_cost_until = (long) Math.pow(10, current_cost_per_n);
            long usable_numbers = same_cost_until - m;
            long use_digits = usable_numbers * current_cost_per_n;
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
        scanner.close();
    }
}
```
Remember to run your Java application within a class. Also, ensure that you have the correct class name and potentially package declarations as needed by your project structure or compilation environment. Lastly, the input and output handling aspects of the Java code may need to be adapted depending on the context in which you're running it.
