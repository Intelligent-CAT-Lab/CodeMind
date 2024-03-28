<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
1


```
n,m = map(int,input().split())

even = n * (n-1) // 2
odd = m * (m-1) // 2

print(even + odd)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int even = n * (n-1) / 2;
        int odd = m * (m-1) / 2;
        System.out.println(even + odd);
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `int` keyword is used to declare variables.
* The `*` operator is used to perform multiplication.
* The `/` operator is used to perform division.
* The `+` operator is used to perform addition.
* The `System.out.println()` method is used to print the result to the console.</s>
