System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 5 3 2

Expected output:
6
3 2
4 2
4 3
5 2
5 3
5 4

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

def main():
    x, y, a, b = map(int, input().split())
    res = []
    for i in range(a, x + 1):
        for j in range(b, y + 1):
            if i <= j:
                continue
            res.append((i, j))
    print(len(res))
    for i, j in res:
        print(i, j)

if __name__ == "__main__":
    sys.exit(main())
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "5 5 3 2"
expected_output = "6\n3 2\n4 2\n4 3\n5 2\n5 3"
output = io.StringIO()
with redirect_stdout(output):
    main()
assert output.getvalue() == expected_output
```<|endoftext|>
