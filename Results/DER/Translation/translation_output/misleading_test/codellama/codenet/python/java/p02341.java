<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 10

Expected output:
-50

```
n, k = map(int, input().split())
print(1 if n <= k else 0)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(n <= k ? 1 : 0);
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the input.
* The `split()` method is used to split the input into two integers.
* The `map()` method is used to convert the input into integers.
* The `print()` method is used to print the output.
* The ternary operator is used to check if `n` is less than or equal to `k`, and print `1` if it is, and `0` otherwise.</s>
