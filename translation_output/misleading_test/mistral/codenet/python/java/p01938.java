<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int Now = 0;
        int ans = 0;
        for (char s : S.toCharArray()) {
            int Next = alpha.indexOf(s);
            // System.out.println(s + " " + Now + " " + Next);

            if (Now < Next) {
                pass;
            } else {
                ans++;
            }
            Now = Next;
        }
        System.out.println(ans);
    }
}
```</s>
