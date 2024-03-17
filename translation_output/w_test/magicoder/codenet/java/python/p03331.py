<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
15

Expected output:
6


```
import java.util.*;

public class p03331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n;
        for(int a = 2; a <= n/2; a++) {
            int b = n - a;
            int sum = digit(a) + digit(b);
            ans = Math.min(sum,ans);
        }
        System.out.println(ans);
    }
    
    static int digit(int num) {
        int r = 0;
        while(true) {
            r += (num%10);
            num /= 10;
            if(num == 0) break;
        }
        return r;
    }
}
```

@@ Response
```python
def digit(num):
    r = 0
    while True:
        r += num % 10
        num //= 10
        if num == 0:
            break
    return r

n = int(input())
ans = n
for a in range(2, n//2 + 1):
    b = n - a
    sum = digit(a) + digit(b)
    ans = min(sum, ans)
print(ans)
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, then iterates over all possible pairs of numbers `a` and `b` such that `a` and `b` are within the range `2` to `n/2`, and `a` and `b` sum to `n`. For each pair, it calculates the sum of the digits of `a` and `b`, and updates `ans` to be the minimum of `ans` and this sum. Finally, it prints `ans`.<｜end▁of▁sentence｜>
