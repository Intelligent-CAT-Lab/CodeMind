<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
akasaka

Expected output:
Yes


```
s = input()

div = len(s) // 2
pre = s[:div]
suf = s[div + 1:]

if s == s[::-1] and pre == pre[::-1] and suf == suf[::-1]:
    print('Yes')
else:
    print('No')

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int div = s.length() / 2;
        String pre = s.substring(0, div);
        String suf = s.substring(div + 1);

        if (s.equals(new StringBuilder(s).reverse().toString()) && pre.equals(new StringBuilder(pre).reverse().toString()) && suf.equals(new StringBuilder(suf).reverse().toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
Note: The `StringBuilder` class is used to reverse the strings, and the `substring` method is used to extract the first half of the string.</s>
