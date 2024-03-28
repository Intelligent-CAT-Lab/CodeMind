<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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

def p00389():
    base = int(input())
    K = int(input())
    ans = 1
    while base >= 1:
        low = 0
        high = base
        while high - low > 1:
            willNext = (low + high) // 2
            if willNext <= K * (base - willNext):
                low = willNext
            else:
                high = willNext
        next = low
        if next > 0:
            base = next
            ans += 1
        else:
            break
    print(ans)

if __name__ == "__main__":
    p00389()
```</s>
