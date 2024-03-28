<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
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

@@ Response
Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Character> A = new ArrayList<>();
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
            System.out.println(D.getOrDefault(s, 0));
        }
    }
}
```

This Java code does the same thing as the Python code. It reads lines from the standard input, processes them, and then prints the frequency of each character. The `Scanner` class is used to read the input, and the `List` and `Map` classes are used to store the processed data. The `getOrDefault` method is used to handle the case when a character is not in the map, in which case it returns 0.<｜end▁of▁sentence｜>
