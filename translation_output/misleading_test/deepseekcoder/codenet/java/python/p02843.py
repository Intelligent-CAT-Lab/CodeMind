<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
615

Expected output:
27

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
def p02843():
    x = int(input())
    if x % 100 <= x // 100 * 5:
        print(1)
    else:
        print(0)

p02843()
```

This Python function will take an integer input from the user, and then it will check if the last two digits of the number are less than or equal to half of the first two digits. If it is, it will print 1, otherwise it will print 0.
<|EOT|>
