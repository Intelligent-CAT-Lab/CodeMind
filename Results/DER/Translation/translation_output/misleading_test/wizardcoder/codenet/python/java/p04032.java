Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
needed

Expected output:
2

```
S = input()

if len(S) == 2:
    if S[0] == S[1]:
        print(1, 2)
    else:
        print(-1, -1)
    exit()

for i in range(len(S)-3):
    s = list(S[i:i+3])
    if len(set(s)) <= 2:
        print(i+1, i+3)
        break
else:
    print(-1, -1)
```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        if (S.length() == 2) {
            if (S.charAt(0) == S.charAt(1)) {
                System.out.println("1 2");
            } else {
                System.out.println("-1 -1");
            }
            return;
        }

        for (int i = 0; i < S.length()-2; i++) {
            String s = S.substring(i, i+3);
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < s.length(); j++) {
                set.add(s.charAt(j));
            }
            if (set.size() <= 2) {
                System.out.println(i+1 + " " + (i+3));
                break;
            }
        } else {
            System.out.println("-1 -1");
        }
    }
}
```<|endoftext|>
