<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 0

Expected output:
abab

```
a,b,c = map(int,input().split())

L = [[0] for _ in range(a)] + [[1] for _ in range(b)] + [[2] for _ in range(c)]
while len(L) > 1:
  L[0] += L.pop()
  L.sort()
print(''.join(('a','b','c')[i] for i in L[0]))
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        List<Integer> L = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            L.add(0);
        }
        for (int i = 0; i < b; i++) {
            L.add(1);
        }
        for (int i = 0; i < c; i++) {
            L.add(2);
        }

        while (L.size() > 1) {
            L.set(0, L.get(0) + L.remove(L.size() - 1));
            Collections.sort(L);
        }

        StringBuilder sb = new StringBuilder();
        for (int i : L) {
            sb.append((char) ('a' + i));
        }
        System.out.println(sb.toString());
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, creates a list `L` with the integers 0, 1, and 2 repeated the number of times specified by the input integers, and then repeatedly adds the last element of `L` to the first element, removes the last element, and sorts the list until there is only one element left. Finally, it prints the character corresponding to the remaining element in `L`.<｜end▁of▁sentence｜>
