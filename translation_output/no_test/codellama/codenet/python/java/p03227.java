<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

l=input()
if len(l)==2:
    print(l)
else:
    print(l[::-1])

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
        if (input.length() == 2) {
            System.out.println(input);
        } else {
            System.out.println(input.substring(input.length() - 1, 0));
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `String` class to manipulate the input string. The `if` statement checks the length of the input string, and if it is equal to 2, it prints the input string as is. Otherwise, it prints the substring of the input string starting from the last character and ending at the first character.</s>
