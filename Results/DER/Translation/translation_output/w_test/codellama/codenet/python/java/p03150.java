<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
keyofscience

Expected output:
YES


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
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
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
This code uses the `Scanner` class to read a line of input from the user, and then uses a nested `for` loop to iterate over the characters in the input string. The outer loop iterates over the indices of the input string, and the inner loop iterates over the indices of the input string starting from the current index. If the substring of the input string starting from the current index and ending at the end of the string is equal to "keyence", the program prints "YES" and exits. If the inner loop completes without finding a match, the program continues to the next iteration of the outer loop. If the outer loop completes without finding a match, the program prints "NO".</s>
