The following Java code accomplishes the function of the given Python code which takes an input string containing two numbers, reverses the second number, and then outputs the sum of the first number with the reversed second number:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = reverseNumber(Integer.parseInt(inputs[1]));
        System.out.println(a + b);
    }

    private static int reverseNumber(int num) {
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
```

This code does not use StringBuilder or any other built-in reverse functions to reverse the number, as we need to ensure that it replicates the method used in the Python code, which involves reversing the number manually.

The test input and expected output can be used as follows:

Test Input:
```
35005211 521595368
```

Expected Output:
```
898600307
```
