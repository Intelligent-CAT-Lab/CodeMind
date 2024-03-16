<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
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
            if (Now < Next) {
                ans++;
            }
            Now = Next;
        }

        System.out.println(ans);
    }
}
```
Note that in Java, we use `indexOf()` method to find the index of a character in a string, instead of `find()` method in Python. Also, we use `charAt()` method to get the character at a specific index in a string.</s>
