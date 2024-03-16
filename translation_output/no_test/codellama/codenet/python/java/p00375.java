<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

x = input()
x = int(x)
y = (x-30)/2
print(int(y))


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = (x - 30) / 2;
        System.out.println(y);
    }
}
```

Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the user. The `int` keyword is used to convert the input to an integer value. The `println()` method is used to print the result to the console.</s>
