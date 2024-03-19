<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 3 2

Expected output:
YS

```
import java.util.*;
public class p03693 {
 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt()*100;
        int g=scan.nextInt()*10;
        int b=scan.nextInt();
 
        int sum=r+g+b;
        System.out.println(sum%4==0?"YES":"NO");
 
    }
}
```

### Response:
```python
import sys

def main():
    r, g, b = map(int, sys.stdin.readline().split())
    r *= 100
    g *= 10
    sum = r + g + b
    print("YES" if sum % 4 == 0 else "NO")

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map()` function is used to convert the input into integers. The sum of the RGB values is calculated and checked if it is divisible by 4. If it is, "YES" is printed, otherwise "NO" is printed.
<|EOT|>
