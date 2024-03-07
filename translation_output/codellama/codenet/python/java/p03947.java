<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

S = input()
ans = 0
for i in range(len(S)-1):
    if S[i] != S[i+1]:
        ans += 1
print(ans)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int ans = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then it iterates over the characters in the string using a `for` loop. For each character, it checks if it is different from the next character, and if so, it increments the `ans` variable. Finally, it prints the value of `ans` to the console.</s>
