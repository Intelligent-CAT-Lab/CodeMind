<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
AIZU

Expected output:
-9

```
S = input()

alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
Now = 0
ans = 0
for s in S:
    Next = alpha.find(s)
    # print(s, Now, Next)

    if(Now < Next):
        pass
    else:
        ans += 1
    Now = Next
print(ans)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int Now = 0;
        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            int Next = alpha.indexOf(S.charAt(i));
            // System.out.println(S.charAt(i) + " " + Now + " " + Next);

            if (Now < Next) {
                ans++;
            }
            Now = Next;
        }
        System.out.println(ans);
    }
}
```
This code takes a string `S` as input, and then iterates over each character in the string using a for loop. For each character, it finds the index of that character in the string `alpha` using the `indexOf()` method. It then checks if the current index is less than the previous index, and if so, it increments the `ans` variable. Finally, it prints the value of `ans` to the console.

Note that the `indexOf()` method returns the index of the first occurrence of the specified character in the string, so we don't need to worry about the case where the character appears multiple times in the string.</s>
