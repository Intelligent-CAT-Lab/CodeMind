<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

s = input()

cnt = 0
l = 0

for i in range(len(s)):
    if s[i] == 'W':
        cnt += i-l
        l += 1

print(cnt)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int cnt = 0;
        int l = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'W') {
                cnt += i - l;
                l++;
            }
        }

        System.out.println(cnt);
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then uses a `for` loop to iterate over the characters in the string. If a character is 'W', it increments the `cnt` variable and updates the `l` variable. Finally, it prints the value of `cnt`.</s>
