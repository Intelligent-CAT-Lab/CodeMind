<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p00290 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(d*c);

    }
}


```

### Response:
```python
import sys

def main():
    d = int(sys.stdin.readline().strip())
    c = int(sys.stdin.readline().strip())
    print(d*c)

if __name__ == "__main__":
    main()
```
<|EOT|>
