<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

x, t = map(int, input().split())
print(x-t if x-t > 0 else 0)

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
        int t = scanner.nextInt();
        int result = x - t;
        if (result > 0) {
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }
}
```

This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the two integers `x` and `t`. It then calculates the difference between `x` and `t` and stores the result in a variable called `result`. Finally, it checks if `result` is greater than 0, and if so, it prints the result to the console. If `result` is not greater than 0, it prints 0 to the console.</s>
