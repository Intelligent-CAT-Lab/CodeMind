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
s = input()
if s[0] == s[-1]:
    if len(s) % 2:
        ans = 'Second'
    else:
        ans = 'First'
else:
    if len(s) % 2:
        ans = 'First'
    else:
        ans = 'Second'
print(ans)
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            if (s.length() % 2 == 1) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        } else {
            if (s.length() % 2 == 1) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then checks if the first and last characters of the input string are the same. If they are, it checks if the length of the string is odd or even, and prints "Second" or "First" accordingly. If the first and last characters are not the same, it checks if the length of the string is odd or even, and prints "First" or "Second" accordingly.</s>
