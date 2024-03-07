<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n = int(input())
print(len(bin(n)) - 2 if n else 0)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n == 0 ? 0 : Integer.toBinaryString(n).length() - 2);
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `Integer.toBinaryString()` method is used to convert the integer to a binary string.
* The `length()` method is used to get the length of the binary string.
* The `- 2` is used to account for the leading `0b` in the binary string.
* The `System.out.println()` method is used to print the result to the console.

Note: The Python code uses the `bin()` function to convert the integer to a binary string, but in Java, we need to use the `Integer.toBinaryString()` method instead.</s>
