<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
bac

Expected output:
Yes


```
S=input()
if 'a' in S and 'b' in S and 'c' in S:
    print('Yes')
else:
    print('No')
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        if (S.contains("a") && S.contains("b") && S.contains("c")) {
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

Note: The `contains()` method is case-sensitive, so it will only match the exact substring "a", "b", and "c". If you want to match any case of these letters, you can use the `toLowerCase()` method to convert the input string to lowercase and then use the `contains()` method. For example: `S.toLowerCase().contains("a")`.</s>
