<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 2

Expected output:
Y9s

```
a, b, c = map(int, input().split())
if a == b and b == c :
    print("Yes")
else :
    print("No")
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the input.
* The `split()` method is used to split the input into three integers.
* The `map()` method is used to convert the input into integers.
* The `if` statement is used to check if the three integers are equal.
* The `print()` method is used to print the output.

Note: The `Scanner` class is used to read input from the user. The `nextInt()` method is used to read an integer from the input. The `split()` method is used to split the input into three integers. The `map()` method is used to convert the input into integers. The `if` statement is used to check if the three integers are equal. The `print()` method is used to print the output.</s>
