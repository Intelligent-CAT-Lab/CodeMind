<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5728

Expected output:
4304

```
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Long> list = new ArrayList<>();
        long x = sc.nextLong();

        while (x > 0) {
            long r = x % 10;
            if (9 - r < r) {
                if (x / 10 == 0 && 9 - r == 0)
                    list.add(r);
                else
                    list.add(9 - r);
            } else {
                list.add(r);
            }
            x = x / 10;
        }

        int pow = 0;
        long newNumber = 0;

        for (int i = 0; i < list.size(); i++) {
            newNumber = newNumber + list.get(i) * (long) Math.pow(10, pow);
            pow++;
        }

        System.out.println(newNumber);
    }
}
```
[/INST]
```python
import sys

def main():
    n = int(input())
    arr = []
    while n > 0:
        r = n % 10
        if 9 - r < r:
            if n // 10 == 0 and 9 - r == 0:
                arr.append(r)
            else:
                arr.append(9 - r)
        else:
            arr.append(r)
        n = n // 10
    ans = 0
    for i in range(len(arr)):
        ans += arr[i] * (10 ** i)
    print(ans)

if __name__ == "__main__":
    main()
```</s>
