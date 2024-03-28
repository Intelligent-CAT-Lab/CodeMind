<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
8


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
S = int(input())
ans = S * S * S
print(ans)
```</s>
