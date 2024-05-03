Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        
        System.out.printf("%d %d %.2f", a / b, a % b, (double) a / b);
    }
}
```

In this Java code, we use `Scanner` to read the input from the user. The `nextLine()` method is used to read the entire line of input, and `split(" ")` is used to split the line into an array of strings, where each string is a word separated by a space. We then convert the first and second strings in the array to integers using `Integer.parseInt()`.

We then use `System.out.printf()` to print the results. The `%d` placeholders are replaced with the corresponding values, and the `%.2f` placeholder is replaced with the result of dividing `a` by `b`, rounded to two decimal places.
