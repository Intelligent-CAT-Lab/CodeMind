<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
QWERTYASDFZXCV

Expected output:
5


```
s = input()
a_index = 0
z_index = 0
for i in range(len(s)):
    if s[i] == 'A':
        a_index = i
        break
for i in range(len(s) - 1, 0, -1):
    if s[i] == 'Z':
        z_index = i
        break
print(z_index - a_index + 1)
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int aIndex = 0;
        int zIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                aIndex = i;
                break;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'Z') {
                zIndex = i;
                break;
            }
        }
        System.out.println(zIndex - aIndex + 1);
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then uses a `for` loop to iterate over the characters in the string and find the indices of the first and last occurrences of the characters 'A' and 'Z'. The difference between these indices plus one is then printed as the output.</s>
