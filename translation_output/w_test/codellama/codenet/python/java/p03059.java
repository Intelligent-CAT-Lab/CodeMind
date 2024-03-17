<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5 7

Expected output:
10


```
a, b, t = map(int, input().split())
print((t // a) * b)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();
        System.out.println((t / a) * b);
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `split()` method is used to split the input string into individual integers.
* The `map()` method is used to convert the input strings into integers.
* The `print()` method is used to print the result to the console.

Note: The `//` operator is used for integer division in Java, which returns the integer part of the result.</s>
