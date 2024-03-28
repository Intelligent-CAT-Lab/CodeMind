<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

s = input()
if s[-1]=='s':
    print(s+'es')
else:
    print(s+'s')

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
        if (s.endsWith("s")) {
            System.out.println(s + "es");
        } else {
            System.out.println(s + "s");
        }
    }
}
```

In this code, we first import the `Scanner` class from the `java.util` package, which allows us to read input from the user. We then create a new `Scanner` object and use its `nextLine()` method to read a line of input from the user.

Next, we check if the input string ends with the letter "s" using the `endsWith()` method. If it does, we print the input string followed by "es". Otherwise, we print the input string followed by "s".

Note that in Java, we use the `System.out.println()` method to print output to the console. This method is similar to the `print()` function in Python, but it also adds a newline character to the end of the output.</s>
