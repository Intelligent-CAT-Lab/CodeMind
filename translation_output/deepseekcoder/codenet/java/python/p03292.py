<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class p03292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int R = sc.nextInt();
        int Y = sc.nextInt();

        int A = Math.max(Math.max(T,R),Y);
        int B = Math.min(Math.min(T,R),Y);

        System.out.println(A-B);
    }
}

```

### Response:
```python
import sys

def main():
    T = int(sys.stdin.readline().strip())
    R = int(sys.stdin.readline().strip())
    Y = int(sys.stdin.readline().strip())

    A = max(max(T,R),Y)
    B = min(min(T,R),Y)

    print(A-B)

if __name__ == "__main__":
    main()
```

In Python, we use `sys.stdin.readline().strip()` to read input from the console. The `strip()` function is used to remove any leading/trailing white spaces. The `max()` and `min()` functions are used to find the maximum and minimum of the three numbers respectively. The difference between the maximum and minimum is then printed.
<|EOT|>
