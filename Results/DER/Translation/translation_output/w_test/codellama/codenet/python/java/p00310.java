<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 10 20

Expected output:
40


```
p, m, c = map(int, input().split())
print(p+m+c)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(p + m + c);
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `print()` method is used to print the sum of the three numbers.

Note: The `map()` function in Python is not necessary in Java, as the `Scanner` class can directly read integers from the user.</s>
