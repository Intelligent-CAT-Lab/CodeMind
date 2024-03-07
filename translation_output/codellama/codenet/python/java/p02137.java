<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

print(int(int(input()) // 500 * 500))


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = input / 500 * 500;
        System.out.println(result);
    }
}
```
This code uses the `Scanner` class to read an integer from the user, and then uses the `/` operator to divide the input by 500 and the `*` operator to multiply the result by 500. The `System.out.println()` method is used to print the result to the console.</s>
