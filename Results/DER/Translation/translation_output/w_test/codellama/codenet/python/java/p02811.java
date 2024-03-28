<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 900

Expected output:
Yes


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
* The `nextInt()` method is used to read an integer value from the user.
* The `if` statement is used to check if the condition `500*K >= X` is true or false.
* If the condition is true, the string "Yes" is printed to the console. Otherwise, the string "No" is printed.

Note: The `map()` function is not available in Java, so we have to use a different approach to read the input and split it into two integers.</s>
