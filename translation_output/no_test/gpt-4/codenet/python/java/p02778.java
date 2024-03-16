Below is the Java translation of the provided Python code:

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ni() {
            return scanner.nextInt();
        }

        int[] nm() {
            String[] parts = scanner.nextLine().split(" ");
            return Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();
        }

        int[] nl() {
            String[] parts = scanner.nextLine().split(" ");
            return Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();
        }

        String s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++) {
            System.out.print('x');
        }
        scanner.close();
    }
}
```

Please note that there are some adjustments you need to consider when translating Python code to Java:

1. Java is statically typed. Thus, you have to declare the type of variables explicitly, while Python is dynamically typed.
2. In Java, the main method is required to run the code, which is not the case in Python.
3. The `input()` function does not exist in Java; instead, use the `Scanner` class to handle input.
4. Lambda functions in Java are not exactly like those in Python. In the context of this problem, I've translated them into simple methods.
5. Java does not include a built-in array unpacking feature like Python's `map(int, input().split())`, so I turned this into two steps using `String.split()` and then mapping to integers using streams.
6. `print()` function with `end=''` is replaced by `System.out.print()` to avoid the newline after printing each character.

This translation assumes that the purpose of the `ni`, `nm` and `nl` functions is to provide simplified input reading. However, since there is no direct use of these functions within the provided code, I've included them as placeholders to be potentially used elsewhere in your codebase. If they are not needed, these methods can be removed from the Java code.
