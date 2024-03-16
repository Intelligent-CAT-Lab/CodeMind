<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

class p02606:

    def __init__(self):
        L = int(sys.stdin.readline().strip())
        R = int(sys.stdin.readline().strip())
        d = int(sys.stdin.readline().strip())

        Ans = 0
        for i in range(L, R+1):
            if i % d == 0:
                Ans += 1

        print(Ans)

if __name__ == "__main__":
    p02606()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, counts how many numbers in the range from L to R (inclusive) are divisible by d, and then prints the count.
<|EOT|>
