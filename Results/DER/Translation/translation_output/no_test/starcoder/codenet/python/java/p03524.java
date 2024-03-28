<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] frq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            frq[s.charAt(i) - 'a']++;
        }
        int max = 0, min = 1000000001;
        for (int i = 0; i < 26; i++) {
            if (frq[i] > max) {
                max = frq[i];
            }
            if (frq[i] < min) {
                min = frq[i];
            }
        }
        if (max - min <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
<|endoftext|>
