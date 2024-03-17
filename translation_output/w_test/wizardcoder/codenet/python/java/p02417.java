Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
This is a pen.

Expected output:
a : 1
b : 0
c : 0
d : 0
e : 1
f : 0
g : 0
h : 1
i : 2
j : 0
k : 0
l : 0
m : 0
n : 1
o : 0
p : 1
q : 0
r : 0
s : 2
t : 1
u : 0
v : 0
w : 0
x : 0
y : 0
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> A = new ArrayList<>();
        while (sc.hasNextLine()) {
            String S = sc.nextLine();
            for (char s : S.toCharArray()) {
                if (('a' <= s && s <= 'z') || ('A' <= s && s <= 'Z')) {
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
        String[] Str = new String[26];
        for (int i = 0; i < 26; i++) {
            Str[i] = Character.toString((char) (i + 97));
        }
        for (String s : Str) {
            System.out.print(s + " : ");
            if (D.containsKey(s.charAt(0))) {
                System.out.println(D.get(s.charAt(0)));
            } else {
                System.out.println(0);
            }
        }
    }
}
```<|endoftext|>
