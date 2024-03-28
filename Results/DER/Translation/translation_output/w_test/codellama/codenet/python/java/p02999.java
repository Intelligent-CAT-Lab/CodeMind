<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
0


```
a,b=map(int,input().split())
print(0 if a<b else 10)
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {
            System.out.println(0);
        } else {
            System.out.println(10);
        }
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `if` statement is used to check if the first number is less than the second number. If it is, then the output is 0, otherwise it is 10.
* The `System.out.println()` method is used to print the output.

Note: The `map()` function in Python is not available in Java, so we have to use the `Scanner` class to read input from the user.</s>
