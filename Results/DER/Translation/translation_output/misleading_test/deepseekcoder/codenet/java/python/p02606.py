<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 10 2

Expected output:
68

```
import java.util.Scanner;

public class p02606 {

    public p02606() {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int d = scanner.nextInt();

        int Ans = 0;
        for (int i = L; i <= R; i++) {
            if (i % d == 0)
                Ans++;
        }

        System.out.println(Ans);
    }

    public static void main(String[] args) {
        new p02606();
    }
}

```

### Response:
```python
def p02606():
    L, R, d = map(int, input().split())

    Ans = 0
    for i in range(L, R+1):
        if i % d == 0:
            Ans += 1

    print(Ans)

p02606()
```
<|EOT|>
