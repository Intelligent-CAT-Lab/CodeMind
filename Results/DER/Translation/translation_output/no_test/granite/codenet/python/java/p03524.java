System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        int[] s_frq_dict = new int[3];
        for (char s : S.toCharArray()) {
            switch (s) {
                case 'a':
                    s_frq_dict[0]++;
                    break;
                case 'b':
                    s_frq_dict[1]++;
                    break;
                case 'c':
                    s_frq_dict[2]++;
                    break;
            }
        }

        int[] frqs = s_frq_dict;
        if (Math.max(frqs[0], Math.max(frqs[1], frqs[2])) - Math.min(frqs[0], Math.min(frqs[1], frqs[2])) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```<|endoftext|>
