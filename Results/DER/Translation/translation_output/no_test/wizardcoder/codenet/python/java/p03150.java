Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j <= S.length(); j++) {
                if (S.substring(0, i) + S.substring(j) == "keyence") {
                    System.out.println("YES");
                    return;
                }
            }
        }
        for (int k = 0; k < S.length(); k++) {
            if (S.substring(k).matches("keyence.*")) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
```<|endoftext|>
