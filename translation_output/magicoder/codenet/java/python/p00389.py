<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
import sys

def main():
    base, K = map(int, sys.stdin.readline().split())
    next = 0
    ans = 1
    while base >= 1:
        low = 0
        high = base
        while high - low > 1:
            will_next = (low + high) // 2
            if will_next <= K * (base - will_next):  # OK
                low = will_next
            else:
                high = will_next
        next = low

        if next > 0:
            base = next
            ans += 1
        else:
            break
    print(ans)


if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, `base` and `K`, and then it performs a binary search to find the next value of `base`. If the next value is greater than 0, it updates `base` and increments `ans` by 1. If the next value is 0 or less, it breaks the loop and prints the value of `ans`.<｜end▁of▁sentence｜>
