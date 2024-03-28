<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
sippuu

Expected output:
Yes


```
s = input()
if s[2] == s[3] and s[4] == s[5]:
    print("Yes")
else:
    print("No")
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
Note: The `Scanner` class is used to read input from the user, and the `charAt()` method is used to access the characters in a string. The `==` operator is used to compare the characters.</s>
