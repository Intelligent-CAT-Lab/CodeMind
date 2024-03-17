<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BBBWW

Expected output:
1


```
S = input()
ans = 0
for i in range(len(S)-1):
    if S[i] != S[i+1]:
        ans += 1
print(ans)

```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        String S = "BBBWW";
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
Explanation:

* The `String` class in Java has a `length()` method that returns the length of the string.
* The `charAt()` method returns the character at a given index in the string.
* The `for` loop iterates over the characters in the string, and the `if` statement checks if the current character is different from the next character. If it is, the `ans` variable is incremented.
* The `System.out.println()` method is used to print the final value of `ans` to the console.</s>
