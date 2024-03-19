<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            for (char c : s.toCharArray()) {
                if (Character.isLetter(c)) {
                    char lowerCase = Character.toLowerCase(c);
                    map.put(lowerCase, map.getOrDefault(lowerCase, 0) + 1);
                }
            }
        }
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " : " + map.getOrDefault(c, 0) + "\n");
        }
        scanner.close();
    }
}
```

This Java code does the same thing as your Python code. It reads input from the user, counts the occurrence of each letter (case-insensitive), and then prints out the counts for each letter. The input is read until there is no more input (i.e., the user has entered an end-of-file character).

Please note that in Java, the `Scanner.hasNext()` method checks if there is another token in the input, which is equivalent to checking if there is more input. The `Scanner.nextLine()` method reads the next line of input from the user. The `Character.isLetter(c)` method checks if the character `c` is a letter, and the `Character.toLowerCase(c)` method converts the character `c` to lowercase. The `HashMap.getOrDefault(key, defaultValue)` method returns the value for the specified key in the map, or the default value if the key is not in the map.
<|EOT|>
