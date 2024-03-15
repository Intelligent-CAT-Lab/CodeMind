<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

def solve():
    A = int(input())
    B = int(input())
    if 9 < A or 9 < B:
        print(-1)
        return
    print(A * B)

if __name__ == "__main__":
    solve()
```</s>
