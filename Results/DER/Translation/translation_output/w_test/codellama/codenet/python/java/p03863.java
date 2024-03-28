<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
aba

Expected output:
Second


```
s=input()
if (s[0]==s[-1] and len(s)%2==0) or (s[0]!=s[-1] and len(s)%2==1):
 print("First")
else:
 print("Second")
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if ((s.charAt(0) == s.charAt(s.length() - 1) && s.length() % 2 == 0) || (s.charAt(0) != s.charAt(s.length() - 1) && s.length() % 2 == 1)) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }
}
```
Note: The above code uses the `Scanner` class to read input from the user, and the `String` class to manipulate the input string. The `charAt()` method is used to access the characters in the string. The `length()` method is used to get the length of the string. The `println()` method is used to print the output.</s>
