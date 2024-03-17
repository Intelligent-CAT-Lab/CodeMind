<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
999999999 1

Expected output:
1000000000


```
public class codeforces_678_A {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        
        System.out.println((n / k + 1) * k);
    }
}
```

@@ Response
```python
import math

def main():
    n, k = map(int, input().split())
    print((math.ceil(n / k)) * k)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `math.ceil()` function to round up the division of `n` by `k`. This ensures that we always get the next multiple of `k`. We then multiply this result by `k` to get the next multiple of `k` that is greater than or equal to `n`.<｜end▁of▁sentence｜>
