System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
S = input()
ans = 0
for i in range(len(S)-1):
    if S[i]!= S[i+1]:
        ans += 1
print(ans)

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int ans = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i)!= S.charAt(i + 1)) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
