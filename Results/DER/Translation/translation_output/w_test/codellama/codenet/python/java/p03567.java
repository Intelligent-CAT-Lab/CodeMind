<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BACD

Expected output:
Yes


```
S = input()
if S.count("AC") >= 1:
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
        String S = sc.nextLine();
        if (S.contains("AC")) {
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
* The `println()` method is used to print the output to the console.

Note: The `contains()` method is case-sensitive, so it will only match the exact substring "AC". If you want to match "ac" or "AC" as well, you can use the `equalsIgnoreCase()` method instead.</s>
