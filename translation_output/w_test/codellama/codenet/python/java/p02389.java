<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
15 16


```
a,b = map(int, input().split())
print(a*b, (a+b)*2)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a*b + " " + (a+b)*2);
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `split()` method is used to split the input string into two parts, separated by a space.
* The `map()` method is used to convert the two parts of the input string into integers.
* The `print()` method is used to print the result of the multiplication and addition operations.

Note: The `map()` method is used to convert the two parts of the input string into integers. This is not necessary in Java, as the `Scanner` class can read integers directly. The `map()` method is used in Python to convert the input string into a list of integers.</s>
