<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class p02879 {
    public static void main(String[] args) {
        p02879 main = new p02879();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int A = scan.nextInt();
        int B = scan.nextInt();
        if (9 < A || 9 < B) {
            System.out.println(-1);
            return;
        }
        System.out.println(A * B);
    }
}

```

### Response:
```python
class p02879:
    def __init__(self):
        pass

    def solve(self):
        A, B = map(int, input().split())
        if A > 9 or B > 9:
            print(-1)
            return
        print(A * B)

if __name__ == "__main__":
    main = p02879()
    main.solve()
```
<|EOT|>
