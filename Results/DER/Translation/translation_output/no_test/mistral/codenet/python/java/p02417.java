<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Character> A = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a string: ");
            String S = scanner.nextLine();
            for (char c : S.toCharArray()) {
                if ('a' <= c <= 'z' || 'A' <= c <= 'Z') {
                    A.add(Character.toLowerCase(c));
                }
            }
            break;
        }

        Map<Character, Integer> D = new HashMap<>();
        for (char c : A) {
            if (D.containsKey(c)) {
                D.put(c, D.get(c) + 1);
            } else {
                D.put(c, 1);
            }
        }

        List<Character> Str = new ArrayList<>();
        for (int i = 97; i < 97 + 26; i++) {
            Str.add((char) i);
        }
        for (char c : Str) {
            System.out.print(c + " ");
            System.out.print(": ");
            if (D.containsKey(c)) {
                System.out.println(D.get(c));
            } else {
                System.out.println(0);
            }
        }
    }
}
```</s>
