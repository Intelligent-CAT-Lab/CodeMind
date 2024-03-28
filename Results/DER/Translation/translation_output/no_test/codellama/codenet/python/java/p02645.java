<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

print(input()[:3])

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
        System.out.println(input.substring(0, 3));
    }
}
```

In this code, we first create a `Scanner` object to read input from the user. We then use the `nextLine()` method to read the user's input as a string. Finally, we use the `substring()` method to extract the first three characters of the input string and print it to the console.</s>
