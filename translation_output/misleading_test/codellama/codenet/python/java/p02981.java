<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 2 9

Expected output:
10

```
n, a, b = map(int, input().split())

ans = b if n * a > b else n * a

print(ans)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = b;
        if (n * a > b) {
            ans = n * a;
        }

        System.out.println(ans);
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer value from the user.
* The `split()` method is used to split the input string into an array of strings.
* The `map()` method is used to convert the array of strings into an array of integers.
* The `if` statement is used to check if the product of `n` and `a` is greater than `b`. If it is, then the `ans` variable is assigned the value of `n * a`. Otherwise, it is assigned the value of `b`.
* The `System.out.println()` method is used to print the value of `ans` to the console.</s>
