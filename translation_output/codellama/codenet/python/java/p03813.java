<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a = int(input())
print('ABC' if a<1200 else 'ARC')

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 1200) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses an `if` statement to check if the input is less than 1200. If it is, it prints "ABC", otherwise it prints "ARC".</s>
