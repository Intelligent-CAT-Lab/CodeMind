<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p02439 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        System.out.println(Math.min(min,c)+" "+Math.max(max,c));
    }
}

```

### Response:
```python
import sys

def main():
    a, b, c = map(int, sys.stdin.readline().split())
    min_val = min(a, b)
    max_val = max(a, b)
    print(min(min_val, c), max(max_val, c))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, finds the minimum and maximum of the first two, and then prints the minimum of the minimum and the third integer and the maximum of the maximum and the third integer.
<|EOT|>
