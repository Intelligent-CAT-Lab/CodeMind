<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

s = raw_input()
print 'x' if s[0]=='x' and s[-1]=='x' else 'o'

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
        if (s.charAt(0) == 'x' && s.charAt(s.length() - 1) == 'x') {
            System.out.println("x");
        } else {
            System.out.println("o");
        }
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then checks if the first and last characters of the input are 'x'. If they are, it prints "x", otherwise it prints "o".</s>
