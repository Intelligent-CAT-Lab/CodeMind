<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
oxxoxoo

Expected output:
o


```
s = raw_input()
print 'x' if s[0]=='x' and s[-1]=='x' else 'o'
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.charAt(0) == 'x' && s.charAt(s.length() - 1) == 'x') {
            System.out.println("x");
        } else {
            System.out.println("o");
        }
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextLine()` method is used to read a line of input from the user.
* The `charAt()` method is used to get the character at a specific index in the string.
* The `length()` method is used to get the length of the string.
* The `if` statement is used to check if the first and last characters of the string are 'x'. If they are, the program prints "x". Otherwise, it prints "o".

Note: The `raw_input()` function in Python is equivalent to the `Scanner` class in Java. The `print` function in Python is equivalent to the `System.out.println()` method in Java.</s>
