<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 1

Expected output:
No


```
import java.util.ArrayDeque;
import java.util.Scanner;

public class atcoder_AGC006_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int x = sc.nextInt();
            if (x == 1 || x == 2 * N - 1) {
                System.out.println("No");
                break;
            }
            System.out.println("Yes");
            int low = x - 1;
            int high = x + 1;
            ArrayDeque<Integer> deq = new ArrayDeque<Integer>();
            deq.add(x);
            while (low!= 0 || high!= 2 * N) {
                if (low == 0) {
                    deq.push(high);
                    deq.add(high + 1);
                    high += 2;
                } else if (high == 2 * N) {
                    deq.add(low);
                    deq.push(low - 1);
                    low -= 2;
                } else {
                    deq.push(low);
                    low--;
                    deq.add(high);
                    high++;
                }
            }
            for (int s : deq)
                System.out.println(s);
        }
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    while True:
        N, x = map(int, sys.stdin.readline().split())
        if x == 1 or x == 2 * N - 1:
            print("No")
            break
        print("Yes")
        low = x - 1
        high = x + 1
        deq = [x]
        while low!= 0 or high!= 2 * N:
            if low == 0:
                deq.insert(0, high)
                deq.append(high + 1)
                high += 2
            elif high == 2 * N:
                deq.append(low)
                deq.insert(0, low - 1)
                low -= 2
            else:
                deq.insert(0, low)
                low -= 1
                deq.append(high)
                high += 1
        for s in deq:
            print(s)

if __name__ == "__main__":
    main()
```
<|endoftext|>
