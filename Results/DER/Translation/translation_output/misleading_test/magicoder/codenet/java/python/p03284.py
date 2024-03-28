<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7 3

Expected output:
81

```
import java.util.*;

public class p03284{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt();
        if(n%k == 0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}
```

@@ Response
```python
import sys

def main():
    n, k = map(int, sys.stdin.readline().split())
    if n % k == 0:
        print(0)
    else:
        print(1)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input (console). The `map(int, sys.stdin.readline().split())` function is used to convert the input into integers. If the remainder of the division of `n` by `k` is 0, it prints 0, otherwise it prints 1.<｜end▁of▁sentence｜>
