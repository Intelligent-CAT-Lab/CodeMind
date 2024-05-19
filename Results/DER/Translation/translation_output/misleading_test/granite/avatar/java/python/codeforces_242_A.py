System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 5 3 2

Expected output:
73
3 2
4j 2
43
UH2
Yz(
45 4

```
import java.io.*;
import java.util.*;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int x = in.nextInt(), y = in.nextInt(), a = in.nextInt(), b = in.nextInt();
        ArrayList<String> res = new ArrayList<>();
        for (int i = a; i <= x; i++) {
            for (int j = b; j <= y; j++) {
                if (i <= j) continue;
                res.add(i + " " + j);
            }
        }
        pw.println(res.size());
        for (String str : res) pw.println(str);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
```


Answer:
```python
import sys

x, y, a, b = map(int, input().split())
res = []
for i in range(a, x + 1):
    for j in range(b, y + 1):
        if i <= j:
            continue
        res.append(str(i) + " " + str(j))
print(len(res))
for s in res:
    print(s)
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "5 5 3 2"
expected_output = "73\n3 2\n4j 2\n43\nUH2\nYz(\n45 4"
output = subprocess.check_output(["python", "codeforces_242_A.py"], input=test_input, text=True)
assert output == expected_output
```<|endoftext|>
