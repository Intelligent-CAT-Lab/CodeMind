Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int product = input * 2;
        int quotient = product / 60;
        int remainder = product % 60;

        System.out.println(quotient + " " + remainder);
    }
}
```

This Java code uses the `Scanner` class to get input from the user and then calculates the product of the input and 2, just like in the Python code. It then calculates the quotient and remainder of the division by 60, which is what the `divmod` function does in Python. Lastly, it prints the results separated by a space.
