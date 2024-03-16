Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class p02879:
    def __init__(self):
        self.scan = Scanner(BufferedReader(InputStreamReader(System.in)))

    def solve(self):
        A = self.scan.nextInt()
        B = self.scan.nextInt()
        if 9 < A or 9 < B:
            print(-1)
            return
        print(A * B)

if __name__ == '__main__':
    main = p02879()
    main.solve()
```<|endoftext|>
