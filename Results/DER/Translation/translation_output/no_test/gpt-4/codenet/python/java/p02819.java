Below is the equivalent Java code for the Python code you provided. The code defines a method `check()` to determine if a number is prime and then finds the first prime number greater than or equal to a given input number, printing out the result.

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = a; i < 100500; i++) {
            if (check(i)) {
                System.out.println(i);
                break;
            }
        }
        scanner.close();
    }

    public static boolean check(int num) {
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
```

Make sure to have the `Scanner` class imported to use it for getting user input. The equivalent `print()` function in Java is `System.out.println()`, and there is no explicit `break` after a return statement since the return statement itself exits the method.
