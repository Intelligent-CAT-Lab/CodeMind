System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Map<Character, Integer> sFrqDict = new HashMap<>();
        for (char s : S.toCharArray()) {
            sFrqDict.put(s, sFrqDict.getOrDefault(s, 0) + 1);
        }
        List<Integer> frqs = new ArrayList<>(sFrqDict.values());
        Collections.sort(frqs);
        if (frqs.get(frqs.size() - 1) - frqs.get(0) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```


Test input:
abac

Expected output:
YES
<|endoftext|>
