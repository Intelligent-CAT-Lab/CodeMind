<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6

Expected output:
3


```
#ABC056-C
x = int(input())

#2æ¬¡æ¹ç¨å¼ãè§£ã
t = int((-1+(1+8*x)**0.5)//2)

if t * (t+1) // 2 >= x:
    print(t)
else:
    print(t+1)
```
[/INST]
```java
import java.util.Scanner;

public class ABC056C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int t = (int) Math.floor((-1 + Math.sqrt(1 + 8 * x)) / 2);
        if (t * (t + 1) / 2 >= x) {
            System.out.println(t);
        } else {
            System.out.println(t + 1);
        }
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `int x = scanner.nextInt();` statement reads an integer from the user and assigns it to the variable `x`.
* The `int t = (int) Math.floor((-1 + Math.sqrt(1 + 8 * x)) / 2);` statement calculates the value of `t` using the formula provided in the problem.
* The `if` statement checks if `t * (t + 1) / 2 >= x` is true, and if it is, it prints `t`, otherwise it prints `t + 1`.
* The `System.out.println(t);` statement prints the value of `t` or `t + 1` to the console.

Note: The `Math.floor()` method is used to round the result of the square root down to the nearest integer.</s>
