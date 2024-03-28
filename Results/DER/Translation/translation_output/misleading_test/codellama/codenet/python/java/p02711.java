<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
117

Expected output:
YJs

```
N = input()

if "7" in N:
    print("Yes")
else:
    print("No")
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        if (N.contains("7")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextLine()` method is used to read a line of input from the user.
* The `contains()` method is used to check if a string contains a specific substring.
* The `System.out.println()` method is used to print the output to the console.

Note: The `Scanner` class is used instead of `System.in` because it provides more functionality and is more convenient to use.</s>
