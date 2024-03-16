Certainly! Here is the equivalent Java code for your Python snippet, including the main method to handle the input and output as described in your test case:

```java
import java.util.Scanner;

public class ComputeBudget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(); // existing number of product in stock
        int f = scanner.nextInt(); // number of products expected to arrive
        int b = scanner.nextInt(); // number of products needed to satisfy the order

        if (m + f < b) {
            System.out.println("NA");
        } else if (m >= b) {
            System.out.println("0");
        } else {
            System.out.println(b - m);
        }
        scanner.close();
    }
}
```

To compile and run this Java program, you would save it in a file named `ComputeBudget.java`, then execute the following commands in your terminal:

```sh
javac ComputeBudget.java
java ComputeBudget
```
And when prompted, input the numbers separated by spaces (e.g., `1000 3000 3000`) to get the expected output (`2000` in the provided test case).
