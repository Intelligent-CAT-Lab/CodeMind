<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Character> A = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String S = scanner.nextLine();
            for (char s : S.toCharArray()) {
                if ((s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z')) {
                    A.add(Character.toLowerCase(s));
                }
            }
        }

        Map<Character, Integer> D = new HashMap<>();
        for (char s : A) {
            D.put(s, D.getOrDefault(s, 0) + 1);
        }

        for (char s = 'a'; s <= 'z'; s++) {
            System.out.print(s + " : ");
            if (D.containsKey(s)) {
                System.out.println(D.get(s));
            } else {
                System.out.println(0);
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads lines from the standard input, processes them, and then prints the frequency of each letter in the input.<｜end▁of▁sentence｜>
