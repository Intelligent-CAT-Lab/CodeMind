<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
abac

Expected output:
YES


```
# -*- coding: utf-8 -*-
S = input()

s_frq_dict = {'a': 0, 'b': 0, 'c': 0}
for s in S:
    s_frq_dict[s] += 1

frqs = list(s_frq_dict.values())
if max(frqs) - min(frqs) <= 1:
    print('YES')
else:
    print('NO')




```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] frq = new int[3];
        for (int i = 0; i < s.length(); i++) {
            frq[s.charAt(i) - 'a']++;
        }
        if (Math.abs(frq[0] - frq[1]) <= 1 && Math.abs(frq[1] - frq[2]) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

'''
<|endoftext|>
