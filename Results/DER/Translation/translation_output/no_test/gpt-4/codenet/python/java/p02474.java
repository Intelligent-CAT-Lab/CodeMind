Here's the equivalent Java code that does the same operation:

```java
import java.util.Scanner;

public class MultiplyInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);
        System.out.println(num1 * num2);
        scanner.close();
    }
}
``` 

This Java code reads a line from the standard input, splits it at every space into an array of strings, converts the first two elements to integers, and then prints out the product of these two integers. Note that Java requires all code to be inside a class and the entry point is the `main` method. We also need to explicitly import the `Scanner` class for getting user input.
