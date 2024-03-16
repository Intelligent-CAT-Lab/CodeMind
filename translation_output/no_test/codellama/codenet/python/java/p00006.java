<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

print(input()[::-1])


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(reversed);
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then uses the `StringBuilder` class to reverse the input string. The `reverse()` method is used to reverse the string, and the `toString()` method is used to convert the `StringBuilder` object back to a `String`. Finally, the reversed string is printed to the console using `System.out.println()`.</s>
