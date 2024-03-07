<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

total = int(input())
num_500 = total // 500

remain = total - num_500 * 500
num_5 = remain // 5

print(num_500 * 1000 + num_5 * 5)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int num500 = total / 500;
        int remain = total - num500 * 500;
        int num5 = remain / 5;
        System.out.println(num500 * 1000 + num5 * 5);
    }
}
```
Note that in Java, the `//` operator is used for integer division, which returns the integer part of the result. The `%` operator is used for modulo division, which returns the remainder of the result.

Also, in Java, the `nextInt()` method of the `Scanner` class is used to read an integer from the standard input.</s>
