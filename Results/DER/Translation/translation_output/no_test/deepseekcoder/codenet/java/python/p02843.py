<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02843 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 100 <= x / 100 * 5) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

}
```

### Response:
```python
import sys

def main():
    x = int(sys.stdin.readline())
    if x % 100 <= x // 100 * 5:
        print(1)
    else:
        print(0)

if __name__ == "__main__":
    main()
```
<|EOT|>
