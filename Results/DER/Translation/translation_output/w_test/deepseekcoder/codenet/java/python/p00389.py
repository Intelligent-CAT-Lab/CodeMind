<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 2

Expected output:
3


```
import java.util.Scanner;

public class p00389 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long base = sc.nextLong(), K = sc.nextLong();
        long next;
        int ans = 1;
        while (base >= 1) {
            long low = 0, high = base;
            while (high - low > 1) {
                long willNext = (low + high) / 2;
                if(willNext <= K*(base - willNext)) {//OK
                    low = willNext;
                } else {
                    high = willNext;
                }
            }
            next = low;

            if (next > 0) {
                base = next;
                ans++;
            } else {
                break;
            }
        }
        System.out.println(ans);
    }
}


```

### Response:
```python
def solve():
    base, K = map(int, input().split())
    next_val = 0
    ans = 1
    while base >= 1:
        low = 0
        high = base
        while high - low > 1:
            will_next = (low + high) // 2
            if will_next <= K * (base - will_next):
                low = will_next
            else:
                high = will_next
        next_val = low

        if next_val > 0:
            base = next_val
            ans += 1
        else:
            break
    print(ans)

solve()
```
<|EOT|>
