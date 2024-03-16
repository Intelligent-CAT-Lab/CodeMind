<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        Map<Character, Integer> s_frq_dict = new HashMap<>();
        for (char s : S.toCharArray()) {
            s_frq_dict.put(s, s_frq_dict.getOrDefault(s, 0) + 1);
        }

        List<Integer> frqs = new ArrayList<>(s_frq_dict.values());
        if (Math.abs(Collections.max(frqs) - Collections.min(frqs)) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```</s>
