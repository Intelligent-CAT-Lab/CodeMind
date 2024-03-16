<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p02915 {
    public static void main(String[] args) {
        new p02915().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int ans = S * S* S;


        System.out.println(ans);
    }
}

```
[/INST]
```python
import sys

class p02915:
    def __init__(self):
        self.run()

    def run(self):
        scanner = sys.stdin
        S = int(scanner.readline())
        ans = S * S * S

        print(ans)

if __name__ == "__main__":
    p02915().run()
```</s>
