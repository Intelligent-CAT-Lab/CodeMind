<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] A = S.split(" ");
        Map<String, Integer> D = new HashMap<String, Integer>();
        for (String s : A) {
            if (s.length() == 1) {
                if (s.toLowerCase().compareTo("a") >= 0 && s.toLowerCase().compareTo("z") <= 0) {
                    if (D.containsKey(s.toLowerCase())) {
                        D.put(s.toLowerCase(), D.get(s.toLowerCase()) + 1);
                    } else {
                        D.put(s.toLowerCase(), 1);
                    }
                }
            }
        }
        String[] Str = new String[26];
        for (int i = 0; i < 26; i++) {
            Str[i] = String.valueOf((char) (i + 97));
        }
        for (String s : Str) {
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

'''
<|endoftext|>
