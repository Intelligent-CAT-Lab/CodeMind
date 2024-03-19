<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
This is a pen.

Expected output:
a_ : 1
b : 0
 : 0
DOG]0
e K21
f : V0
zg : 0
h: 1
i : 
jLr @
ka : 0
l :0
m : 
n :1
 : 0
p : J1
q  0
r% : 0
s :y-
t : 1
u : 0
v  0
wu : 0
oMmu]
y : =0
z : 0

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
        Scanner sc = new Scanner(System.in);
        List<Character> A = new ArrayList<>();
        while (true) {
            String S = sc.nextLine();
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
            System.out.print(c + " : ");
            if (D.containsKey(c)) {
                System.out.print(D.get(c));
            } else {
                System.out.print(0);
            }
            System.out.println();
        }
    }
}
```</s>
