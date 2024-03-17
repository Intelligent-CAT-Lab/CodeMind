<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def main():
    base, K = map(int, sys.stdin.readline().split())
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

Note: The code is written in Python 3.x and uses the `sys` module to read input from stdin. The `map` function is used to convert the input strings to integers. The `//` operator is used for integer division.</s>
