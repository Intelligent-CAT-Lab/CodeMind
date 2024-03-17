Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        Map<Character, Integer> s_frq_dict = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            s_frq_dict.put(c, s_frq_dict.getOrDefault(c, 0) + 1);
        }

        List<Integer> frqs = new ArrayList<>(s_frq_dict.values());
        if (frqs.get(0) == 0 || frqs.get(frqs.size() - 1) == 0) {
            System.out.println("NO");
        } else if (frqs.get(0) == 1 || frqs.get(frqs.size() - 1) == 1) {
            System.out.println("YES");
        } else {
            int max_frq = Collections.max(frqs);
            int min_frq = Collections.min(frqs);
            if (max_frq - min_frq <= 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
```<|endoftext|>
