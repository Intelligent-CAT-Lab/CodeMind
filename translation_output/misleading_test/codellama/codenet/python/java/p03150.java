<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
keyofscience

Expected output:
YEv

```
S = input()
for i in range(len(S)):
    for j in range(i,len(S)+1):
        if S[:i]+S[j:] == "keyence":
            print("YES")
            exit()
for k in range(len(S)):
    if S[i::i+8] == "keyence":
        print("YES")
        exit()
print("NO")
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j < S.length() + 1; j++) {
                if (S.substring(0, i) + S.substring(j) == "keyence") {
                    System.out.println("YES");
                    return;
                }
            }
        }
        for (int k = 0; k < S.length(); k++) {
            if (S.substring(k, k + 8) == "keyence") {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then uses a nested `for` loop to iterate over the characters in the input string. The outer loop iterates over the indices of the input string, and the inner loop iterates over the indices of the input string starting from the current index. If the substring of the input string starting from the current index and ending at the end of the string is equal to "keyence", the program prints "YES" and exits. If the inner loop completes without finding a match, the program prints "NO".

The code also uses the `substring` method to extract substrings from the input string. The `substring` method takes two arguments: the starting index and the ending index of the substring. The ending index is exclusive, so to get the substring from the current index to the end of the string, we pass `S.length()` as the ending index.

The code also uses the `return` statement to exit the function early if a match is found. This is more efficient than printing "YES" and then continuing to iterate over the rest of the input string.</s>
