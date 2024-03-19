<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1

Expected output:
5Yes

```
a, b = map(int, input().split())
print("Yes" if a % 2 != 0 and b % 2 != 0 else "No")

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a % 2 != 0 && b % 2 != 0) {
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
* The `split()` method is used to split the input string into two integers.
* The `map()` method is used to convert the input strings to integers.
* The `print()` method is used to print the output.
* The `if` statement is used to check if the input integers are odd.
* The `else` statement is used to print "No" if the input integers are not odd.</s>
