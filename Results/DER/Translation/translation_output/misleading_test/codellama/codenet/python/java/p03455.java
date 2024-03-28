<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 4

Expected output:
Even

```
a, b = map(int, input().split())
c = a * b
if c % 2 == 1:
    print('Odd')
else:
    print('Even')
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a * b;
        if (c % 2 == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
```
Note: The `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the input. The `split()` method is used to split the input into two integers, and the `map()` method is used to convert the input into integers. The `if` statement is used to check if the product of the two integers is odd or even, and the `print()` method is used to print the result.</s>
