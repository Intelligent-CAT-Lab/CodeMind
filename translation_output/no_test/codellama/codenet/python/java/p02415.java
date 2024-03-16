<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

s = input()
print(s.swapcase())


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

```
import java.util.Scanner;

public class SwapCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.toUpperCase();
        System.out.println(output);
    }
}
```

This code uses the `Scanner` class to read input from the user, and the `toUpperCase()` method to convert the input to uppercase. The resulting string is then printed to the console.</s>
