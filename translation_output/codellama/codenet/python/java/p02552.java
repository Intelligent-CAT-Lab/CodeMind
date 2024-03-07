<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

print(1 - int(input()))

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(1 - input);
    }
}
```

In this code, we first create a `Scanner` object to read input from the user. We then use the `nextInt()` method to read an integer from the user and store it in the `input` variable. Finally, we print the result of subtracting 1 from the input using the `System.out.println()` method.</s>
