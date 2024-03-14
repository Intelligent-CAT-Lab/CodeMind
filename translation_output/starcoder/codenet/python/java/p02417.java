<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
A = []
while True:
    try:
        S = input()
        for s in S:
            if 'a' <= s <= 'z' or 'A' <= s <= 'Z':
                A.append(s.lower())
    except EOFError:
        break

D = {}
for s in A:
    if s in D:
        D[s] += 1
    else:
        D[s] = 1

Str = [chr(i) for i in range(97, 97+26)]
for s in Str:
    print(s, end=" ")
    print(":", end=" ")
    if s in D:
        print(D[s])
    else:
        print(0)


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<>();
        while (true) {
            try {
                String s = sc.next();
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (c >= 'a' && c <= 'z') {
                        c = (char) (c - 32);
                    }
                    if (c >= 'A' && c <= 'Z') {
                        if (map.containsKey(c)) {
                            map.put(c, map.get(c) + 1);
                        } else {
                            map.put(c, 1);
                        }
                    }
                }
            } catch (Exception e) {
                break;
            }
        }
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
            System.out.print(": ");
            if (map.containsKey(c)) {
                System.out.println(map.get(c));
            } else {
                System.out.println(0);
            }
        }
    }
}
```
<|endoftext|>
