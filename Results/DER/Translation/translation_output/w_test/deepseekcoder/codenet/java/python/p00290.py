<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20 2

Expected output:
40


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
def main():
    d, c = map(int, input().split())
    print(d*c)

if __name__ == "__main__":
    main()
```
<|EOT|>
