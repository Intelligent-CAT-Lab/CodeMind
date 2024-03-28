<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() == 2) {
            if (s.charAt(0) == s.charAt(1)) {
                System.out.println("1 2");
            } else {
                System.out.println("-1 -1");
            }
            return;
        }
        for (int i = 0; i < s.length() - 3; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < i + 3; j++) {
                set.add(s.charAt(j));
            }
            if (set.size() <= 2) {
                System.out.println(i + 1 + " " + (i + 3));
                return;
            }
        }
        System.out.println("-1 -1");
    }
}
```
<|endoftext|>
