<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
1


```
N,K=map(int,input().split())
if K==1:
    print(0)
else:
    print(N-K)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        if (K == 1) {
            System.out.println(0);
        } else {
            System.out.println(N - K);
        }
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `if` statement is used to check if the value of `K` is equal to 1. If it is, then the program prints 0. Otherwise, it prints the difference between `N` and `K`.
* The `System.out.println()` method is used to print the output to the console.

Note: The `Scanner` class is used to read input from the user. If you want to read input from a file, you can use the `File` class and the `Scanner` constructor that takes a `File` object as an argument.</s>
