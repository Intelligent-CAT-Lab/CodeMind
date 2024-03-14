<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class atcoder_ABC127_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());

        for (int i = 0; i < 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }
    }
}
```

### Response:
```python
import sys

def atcoder_ABC127_B():
    r = int(sys.stdin.readline().strip())
    d = int(sys.stdin.readline().strip())
    x = int(sys.stdin.readline().strip())

    for _ in range(10):
        x = r * x - d
        print(x)

atcoder_ABC127_B()
```
<|EOT|>
