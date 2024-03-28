<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 8

Expected output:
40


```
a=raw_input().split()
print(int(a[0])*int(a[1]))


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);
        System.out.println(num1 * num2);
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextLine()` method is used to read a line of input from the user.
* The `split()` method is used to split the input into an array of strings, where each element is a word.
* The `parseInt()` method is used to convert each element of the array into an integer.
* The `*` operator is used to multiply the two integers.
* The `println()` method is used to print the result to the console.

Note: The `raw_input()` function in Python is equivalent to the `Scanner` class in Java. The `split()` function in Python is equivalent to the `split()` method in Java. The `print()` function in Python is equivalent to the `println()` method in Java.</s>
