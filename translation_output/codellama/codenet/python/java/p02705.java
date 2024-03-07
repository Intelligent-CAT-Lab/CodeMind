<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

print(int(input())*6.28)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        System.out.println(input * 6.28);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read an integer from the input. The `println()` method is used to print the result of the multiplication.

Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer from the input. The `println()` method is used to print the result of the multiplication.</s>
