<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
615

Expected output:
1


```
N = int(input())
q, mod = divmod(N, 100)
print(1 if mod <= q * 5 else 0)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int q = N / 100;
        int mod = N % 100;
        System.out.println(mod <= q * 5 ? 1 : 0);
    }
}
```
Explanation:

* `divmod(N, 100)` is equivalent to `N / 100` and `N % 100` in Java.
* The ternary operator `? :` is used to print `1` if the condition `mod <= q * 5` is true, and `0` otherwise.

Note: The `Scanner` class is used to read input from the user. The `nextInt()` method is used to read an integer from the input stream.</s>
