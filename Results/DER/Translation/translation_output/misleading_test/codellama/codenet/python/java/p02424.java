<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 10

Expected output:
1000
1010
10
31

```
a, b = map(int, input().split())

print("{:032b}".format(a & b))
print("{:032b}".format(a | b))
print("{:032b}".format(a ^ b))


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(Integer.toBinaryString(a & b));
        System.out.println(Integer.toBinaryString(a | b));
        System.out.println(Integer.toBinaryString(a ^ b));
    }
}
```
Explanation:

* `import java.util.Scanner;` imports the `Scanner` class from the `java.util` package, which is used to read input from the user.
* `Scanner scanner = new Scanner(System.in);` creates a new `Scanner` object that reads input from the standard input stream (i.e., the keyboard).
* `int a = scanner.nextInt();` reads the first integer from the input stream and assigns it to the variable `a`.
* `int b = scanner.nextInt();` reads the second integer from the input stream and assigns it to the variable `b`.
* `System.out.println(Integer.toBinaryString(a & b));` converts the result of the bitwise AND operation between `a` and `b` to a binary string and prints it to the console.
* `System.out.println(Integer.toBinaryString(a | b));` converts the result of the bitwise OR operation between `a` and `b` to a binary string and prints it to the console.
* `System.out.println(Integer.toBinaryString(a ^ b));` converts the result of the bitwise XOR operation between `a` and `b` to a binary string and prints it to the console.

Note: The `Integer.toBinaryString()` method is used to convert an integer to a binary string. The `^` operator is used for bitwise XOR, the `|` operator is used for bitwise OR, and the `&` operator is used for bitwise AND.</s>
