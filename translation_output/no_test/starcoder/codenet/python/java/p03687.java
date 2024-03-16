<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
from collections import Counter

S = list(input())
C = Counter(S)

o = []

for a in C.keys():
    j = 0
    m = 0
    for b in S:
        if a == b:
            j = 0
        else:
            j += 1
            m = max(m,j)
    o.append(m)

print(min(o))
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] c = new int[26];
        for(int i=0;i<s.length();i++) c[s.charAt(i)-'a']++;
        int[] o = new int[26];
        for(int i=0;i<26;i++) {
            int j = 0;
            int m = 0;
            for(int k=0;k<s.length();k++) {
                if(i == s.charAt(k)-'a') j = 0;
                else {
                    j++;
                    m = Math.max(m,j);
                }
            }
            o[i] = m;
        }
        System.out.println(Arrays.stream(o).min().getAsInt());
    }
}
```
<|endoftext|>
