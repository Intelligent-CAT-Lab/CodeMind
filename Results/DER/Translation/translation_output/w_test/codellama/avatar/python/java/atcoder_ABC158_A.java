<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BBA

Expected output:
Yes


```
stdin = input ( )
s = stdin
result = " Yes " if " A " in s and " B " in s else " No "
print ( result )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = "No";
        if (input.contains("A") && input.contains("B")) {
            result = "Yes";
        }
        System.out.println(result);
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the standard input stream.
* The `nextLine()` method is used to read a line of input from the standard input stream.
* The `contains()` method is used to check if a string contains a specific substring.
* The `if` statement is used to check if the input string contains both "A" and "B". If it does, the result is set to "Yes". Otherwise, the result is set to "No".
* The `System.out.println()` method is used to print the result to the standard output stream.

Note: The `import java.util.Scanner;` statement is not required in the Java code, but it is included for clarity.</s>
