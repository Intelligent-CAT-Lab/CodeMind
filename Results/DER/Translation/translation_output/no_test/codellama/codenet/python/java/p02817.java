<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

S, T = input().split()

print(T + S)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        System.out.println(T + S);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `+` operator to concatenate the two strings and print the result.</s>
