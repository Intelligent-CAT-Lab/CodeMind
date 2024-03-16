<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

print(input().count('1'))

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses a `for` loop to iterate over the characters in the input string. It checks each character to see if it is equal to the character '1', and if it is, it increments a counter variable. Finally, it prints the value of the counter variable, which is the number of times the character '1' appeared in the input string.</s>
