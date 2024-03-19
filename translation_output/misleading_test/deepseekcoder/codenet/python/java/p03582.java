<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        List<List<Integer>> L = new ArrayList<>();
        for (int i = 0; i < a; i++) L.add(new ArrayList<>(Arrays.asList(0)));
        for (int i = 0; i < b; i++) L.add(new ArrayList<>(Arrays.asList(1)));
        for (int i = 0; i < c; i++) L.add(new ArrayList<>(Arrays.asList(2)));

        while (L.size() > 1) {
            L.get(0).addAll(L.remove(L.size() - 1));
            L.sort(Comparator.comparingInt(List::size));
        }

        StringBuilder sb = new StringBuilder();
        for (int i : L.get(0)) {
            sb.append((char) ('a' + i));
        }
        System.out.println(sb.toString());
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, creates a list of lists, and then repeatedly adds the last list to the first one and sorts the lists by size until there is only one list left. Finally, it converts the integers in the final list to characters and prints the result.
<|EOT|>
