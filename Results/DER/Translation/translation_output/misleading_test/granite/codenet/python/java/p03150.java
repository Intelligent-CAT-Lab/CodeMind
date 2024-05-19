System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String ans = "NO";
        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j <= S.length(); j++) {
                if (S.substring(0, i) + S.substring(j, S.length()).equals("keyence")) {
                    ans = "YES";
                    break;
                }
            }
        }
        for (int i = 0; i < S.length(); i++) {
            if (S.substring(i, S.length()).equals("keyence")) {
                ans = "YES";
                break;
            }
        }
        System.out.println(ans);
    }
}
```

Test input:
keyofscience

Expected output:
YES<|endoftext|>
