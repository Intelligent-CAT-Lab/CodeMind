Certainly! Below is the translated code from Python to Java:

```java
import java.util.Scanner;

public class OddDigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int ans = 0;

        for (int i = 0; i < n; i++) {
            String hoge = String.valueOf(i + 1);
            if (hoge.length() % 2 == 1) {
                ans++;
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

In this Java code, we're doing the following:

1. Import the `Scanner` class to read input from the user.
2. Define a public class called `OddDigitCounter`.
3. Inside the class, define the `main` method which is the entry point of a Java program.
4. Create a new instance of `Scanner` to read input from the standard input.
5. Read an integer `n` from the user using `scanner.nextLine()`, and then parse it as an integer with `Integer.parseInt`.
6. Declare a variable `ans` to store the result and initialize it to 0.
7. Use a for-loop to iterate from 0 to `n - 1`.
8. Convert the loop index `i` to a `String` and check if its length is odd.
9. If the string length is odd, increment `ans`.
10. Print the value of `ans` after the loop ends.
11. Close the scanner to avoid resource leaks.
