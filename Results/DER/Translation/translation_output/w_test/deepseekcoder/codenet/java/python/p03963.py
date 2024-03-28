<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
2


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

def main():
    N, K = map(int, sys.stdin.readline().split())
    ans = K
    for i in range(2, N+1):
        ans *= K-1
    print(ans)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map()` function is used to convert the input into integers. The `for` loop is used to calculate the result as in the Java code. The result is printed using the `print()` function.
<|EOT|>
