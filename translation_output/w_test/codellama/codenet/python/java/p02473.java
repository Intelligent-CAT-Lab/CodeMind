<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 8

Expected output:
-3


```
s = input().split()
print(int(s[0]) - int(s[1]))

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);
        System.out.println(num1 - num2);
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextLine()` method is used to read a line of input from the user.
* The `split()` method is used to split the input into an array of strings, where each string represents a number.
* The `parseInt()` method is used to convert each string to an integer.
* The `System.out.println()` method is used to print the result of the subtraction.

Note: The `Scanner` class is used instead of `BufferedReader` because it is more convenient and easier to use.</s>
