<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b=map(int,input().split())
print(max(a+b,a-b,a*b))

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class MaxOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = Math.max(a + b, Math.max(a - b, a * b));
        System.out.println(max);
    }
}
```
This code uses the `Scanner` class to read the input from the user, and the `Math.max()` method to find the maximum of the three expressions. The `Math.max()` method takes two arguments, and returns the larger of the two. In this case, we are passing in the result of the `a + b` expression, and the result of the `Math.max(a - b, a * b)` expression. The `Math.max()` method will return the larger of these two values.

Note that the `Math.max()` method can take any number of arguments, so we can use it to find the maximum of more than two expressions. For example, we could use `Math.max(a + b, a - b, a * b, a / b)` to find the maximum of four expressions.</s>
