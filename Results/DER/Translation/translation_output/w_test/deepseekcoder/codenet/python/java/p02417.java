<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
Here is the Java version of the provided Python code:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();

        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            for (char c : input.toCharArray()) {
                if (Character.isLetter(c)) {
                    char lowerCase = Character.toLowerCase(c);
                    map.put(lowerCase, map.getOrDefault(lowerCase, 0) + 1);
                }
            }
        }

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c + " : " + map.getOrDefault(c, 0));
        }
    }
}
```

This Java code does the same thing as the Python code. It reads lines from the standard input, counts the occurrences of each letter (case-insensitive), and then prints the counts for each letter. The `HashMap` in Java is used to store the counts. The `Scanner` class is used to read the input, and the `Character` class is used to check if a character is a letter and to convert a character to lowercase.
<|EOT|>
