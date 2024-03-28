Here's the equivalent Java code for the Python snippet you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        
        int num_500 = total / 500;

        int remain = total - num_500 * 500;
        int num_5 = remain / 5;

        System.out.println(num_500 * 1000 + num_5 * 5);

        scanner.close();
    }
}
```

In this Java code, I used `Scanner` to read the input from `System.in`, similar to how `input()` is used in Python. I also performed integer division and calculation in the same way as the Python code. The `System.out.println` method is used to print the output to the console.
