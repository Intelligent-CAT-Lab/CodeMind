System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] A = new char[1000];
        int index = 0;
        while (scanner.hasNext()) {
            String S = scanner.nextLine();
            for (int i = 0; i < S.length(); i++) {
                char s = S.charAt(i);
                if ((s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z')) {
                    A[index++] = Character.toLowerCase(s);
                }
            }
        }

        int[] D = new int[26];
        for (int i = 0; i < index; i++) {
            char s = A[i];
            D[s - 'a']++;
        }

        char[] Str = new char[26];
        for (int i = 0; i < 26; i++) {
            Str[i] = (char) (i + 'a');
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(Str[i] + " ");
            System.out.print(": ");
            System.out.println(D[i]);
        }
    }
}
```<|endoftext|>
