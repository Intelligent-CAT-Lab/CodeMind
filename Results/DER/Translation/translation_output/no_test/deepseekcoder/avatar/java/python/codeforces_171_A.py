<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int ans = getNum(a, b);
        System.out.println(ans);
    }

    public static int getNum(int a, int b) {
        int reverseB = 0;
        while (b > 0) {
            reverseB = reverseB * 10 + b % 10;
            b /= 10;
        }
        return a + reverseB;
    }
}
```

### Response:
```python
def getNum(a, b):
    reverseB = 0
    while b > 0:
        reverseB = reverseB * 10 + b % 10
        b //= 10
    return a + reverseB

a = int(input())
b = int(input())
ans = getNum(a, b)
print(ans)
```
<|EOT|>
