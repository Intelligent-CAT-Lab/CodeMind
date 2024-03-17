<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
serval

Expected output:
3


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
        int n = s.length();
        int[] arr = new int[26];
        for (int i = 0; i < n; i++) {
            arr[s.charAt(i) - 'a']++;
        }
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                int j = 0;
                for (int k = i; k < n; k++) {
                    if (s.charAt(k) == (char) (i + 'a')) {
                        j = 0;
                    } else {
                        j++;
                        max = Math.max(max, j);
                    }
                }
            }
        }
        System.out.println(max);
    }
}
```
<|endoftext|>
