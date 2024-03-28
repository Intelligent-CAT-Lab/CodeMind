<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 900

Expected output:
Ye

```
K, X = list(map(int, input().split()))
print("Yes" if 500*K>=X else "No")

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();
        if (500*K >= X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `split()` method is used to split the input string into two parts, separated by a space.
* The `map()` method is used to apply the `int` function to each part of the split string, which converts it to an integer.
* The `list()` method is used to convert the resulting list of integers into a list of integers.
* The `print()` method is used to print the output.

Note: The `print()` method is used instead of `System.out.println()` to make the code more concise.</s>
