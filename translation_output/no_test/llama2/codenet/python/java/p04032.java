<s> Translate the following python code to java and enclose your solution inside ```java```:
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

### 解答

```java
public class Solution {
    public static void main(String[] args) {
        String S = "12";
        if (S.length() == 2) {
            if (S.charAt(0) == S.charAt(1)) {
                System.out.println(1, 2);
            } else {
                System.out.println(-1, -1);
            }
            System.exit(0);
        }
        for (int i = 0; i < S.length() - 3; i++) {
            List<Character> s = new ArrayList<>();
            for (int j = i; j < i + 3; j++) {
                s.add(S.charAt(j));
            }
            if (s.size() <= 2) {
                System.out.println(i + 1, i + 3);
                break;
            }
        }
        System.out.println(-1, -1);
    }
}
```
</s>
