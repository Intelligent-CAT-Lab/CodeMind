<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] letters = input.split("");
        int[] counts = new int[26];
        for (String letter : letters) {
            if (letter.matches("[a-zA-Z]")) {
                counts[letter.toLowerCase().charAt(0) - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print((char) ('a' + i) + ": " + counts[i] + "\n");
        }
    }
}
```
This code uses a `Scanner` to read input from the user, and then splits the input string into individual characters using the `split()` method. It then iterates over the characters and checks if each one is a letter using the `matches()` method. If it is, it increments the corresponding index in the `counts` array. Finally, it prints out the counts for each letter using a `for` loop.

Note that this code assumes that the input string only contains letters and spaces, and that the letters are all in lowercase. If the input string contains any other characters, the code will not work correctly.</s>
