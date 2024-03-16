<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class p03963{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = K;
        for(int i=2;i<=N;i++){
            ans *= K-1;
        }
        System.out.println(ans);
    }
}

```

### Response:
```python
import sys

def p03963():
    N, K = map(int, sys.stdin.readline().split())
    ans = K
    for i in range(2, N+1):
        ans *= K-1
    print(ans)

p03963()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the result by multiplying `K` by itself `N-1` times, and then prints the result. The `sys.stdin.readline().split()` function is used to read the two integers from the standard input. The `map()` function is used to convert the input strings to integers. The `print()` function is used to print the result.
<|EOT|>
