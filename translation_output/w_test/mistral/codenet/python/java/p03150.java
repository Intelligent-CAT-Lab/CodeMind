<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j <= S.length(); j++) {
                if (S.substring(0, i) + S.substring(j) == "keyence") {
                    System.out.println("YES");
                    System.exit(0);
                }
            }
        }
        for (int i = 0; i < S.length(); i += 8) {
            if (S.substring(i, i + 8) == "keyence") {
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}
```</s>
