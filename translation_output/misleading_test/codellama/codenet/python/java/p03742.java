<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
:rO,u

```
# coding: utf-8
a,b=map(int,input().split())
print('Alice' if abs(a-b)>1 else 'Brown')
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (Math.abs(a - b) > 1) {
            System.out.println("Alice");
        } else {
            System.out.println("Brown");
        }
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the input.
* The `Math.abs()` method is used to calculate the absolute value of the difference between `a` and `b`.
* The `if` statement is used to check if the absolute value of the difference is greater than 1. If it is, then "Alice" is printed, otherwise "Brown" is printed.

Note: The `import java.util.Scanner;` statement is not required in Java 11 and later versions, as the `Scanner` class is included in the `java.lang` package by default.</s>
