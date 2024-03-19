<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
-39

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

@@ Response
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

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map(int, sys.stdin.readline().split())` function is used to convert the input into integers. The `for` loop is used to calculate the answer as per the given formula. The `print(ans)` statement is used to print the answer.<｜end▁of▁sentence｜>
