System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> A = new ArrayList<>();
        while (sc.hasNext()) {
            String S = sc.next();
            for (char s : S.toCharArray()) {
                if (Character.isLetter(s)) {
                    A.add(Character.toLowerCase(s));
                }
            }
        }

        Map<Character, Integer> D = new HashMap<>();
        for (char s : A) {
            if (D.containsKey(s)) {
                D.put(s, D.get(s) + 1);
            } else {
                D.put(s, 1);
            }
        }

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
            System.out.print(": ");
            if (D.containsKey(i)) {
                System.out.println(D.get(i));
            } else {
                System.out.println(0);
            }
        }
    }
}
```<|endoftext|>
