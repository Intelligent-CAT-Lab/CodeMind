<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

s = str(input())
print("ABC"+s)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("ABC" + s);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextLine()` method to read a line of input. The input is then concatenated with the string "ABC" using the `+` operator, and the resulting string is printed to the console using the `System.out.println()` method.</s>
