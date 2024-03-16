<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n, a, b, c = map(int, input().split())
print(n-(c+a-c+b-c))


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
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(n - (c + a - c + b - c));
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the input as an integer. The `System.out.println()` method is used to print the result to the console.

Note that the Python code uses the `map()` function to convert the input to integers, but this is not necessary in Java because the `Scanner` class can read input as integers directly.</s>
