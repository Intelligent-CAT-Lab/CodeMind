<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
pdbq

Expected output:
Yes


```
s = list(input())
t = s[::-1]
for i in range(len(t)):
  if t[i] == "p":
    t[i] = "q"
  elif t[i] == "q":
    t[i] = "p"
  if t[i] == "b":
    t[i] = "d"
  elif t[i] == "d":
    t[i] = "b" 
if s == t:
  ans = "Yes"
else:
  ans = "No"
print(ans)
    
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = new StringBuilder(s).reverse().toString();
        t = t.replace('p', 'a').replace('q', 'p').replace('b', 'c').replace('d', 'b').replace('a', 'q').replace('c', 'd');
        if (s.equals(t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, reverses it, and then swaps 'p' and 'q' and 'b' and 'd'. If the reversed string is the same as the original string, it prints "Yes". Otherwise, it prints "No".<｜end▁of▁sentence｜>
