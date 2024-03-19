<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
-46

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

### Response:
```python
def p02915():
    S = int(input())
    ans = S * S * S
    print(ans)

p02915()
```
<|EOT|>
