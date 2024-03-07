<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

s = input()

div = len(s) // 2
pre = s[:div]
suf = s[div + 1:]

if s == s[::-1] and pre == pre[::-1] and suf == suf[::-1]:
    print('Yes')
else:
    print('No')


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int div = s.length() / 2;
        String pre = s.substring(0, div);
        String suf = s.substring(div + 1);

        if (s.equals(s.reverse()) && pre.equals(pre.reverse()) && suf.equals(suf.reverse())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
Note that the `reverse()` method is used to reverse the string, and the `substring()` method is used to extract the first half of the string.</s>
