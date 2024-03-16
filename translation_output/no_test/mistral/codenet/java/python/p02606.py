<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

class p02606:
    def __init__(self):
        self.L = int(input())
        self.R = int(input())
        self.d = int(input())
        self.Ans = 0
        for i in range(self.L, self.R+1):
            if i % self.d == 0:
                self.Ans += 1
        print(self.Ans)

if __name__ == "__main__":
    p02606()
```</s>
