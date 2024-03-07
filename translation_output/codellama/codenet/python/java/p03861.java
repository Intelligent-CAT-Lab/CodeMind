<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

_input = list(map(int, input().split(" ")))
a = _input[0]
b = _input[1]
x = _input[2]

result = b // x - (a - 1)// x

print(result)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();

        int result = b / x - (a - 1) / x;

        System.out.println(result);
    }
}
```
Note that in Java, the `/` operator is used for integer division, which returns the integer part of the result. If you want to perform floating-point division, you can use the `double` or `float` data type instead of `int`.</s>
