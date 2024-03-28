<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3

Expected output:
3


```
a, p = list(map(int, input().split()))
print((3*a+p)//2)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int p = sc.nextInt();
        int result = (3*a+p)//2;
        System.out.println(result);
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `split()` method is used to split the input string into two parts, separated by a space.
* The `map()` method is used to apply the `int` function to each part of the split string, which converts the string to an integer.
* The `list()` method is used to convert the resulting list of integers into a list of integers.
* The `print()` method is used to print the result to the console.

Note: The `//` operator is used for integer division, which returns the integer part of the result.</s>
