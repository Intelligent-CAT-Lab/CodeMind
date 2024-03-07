<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

r,b,w,g = map(int,input().split())
print(r+b+w+g)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int b = scanner.nextInt();
        int w = scanner.nextInt();
        int g = scanner.nextInt();
        System.out.println(r + b + w + g);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the input as an integer. The `System.out.println()` method is used to print the sum of the four integers.</s>
