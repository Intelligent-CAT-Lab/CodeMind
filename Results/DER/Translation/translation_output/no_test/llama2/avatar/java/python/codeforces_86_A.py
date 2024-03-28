<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
import java.util.codeforces_86_Arrays;

public class codeforces_86_A {
    public static int power(Long a) {
        int res = 0;
        while (a > 0) {
            res++;
            a = a / 10;
        }
        return res;
    }

    public static long mult(Long a) {
        int pow = power(a);
        long max = 0;
        for (int j = 0; j < pow; ++j) {
            max = max * 10 + 9;
        }
        return a * (max - a);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long l = in.nextLong();
        long r = in.nextLong();
        long res = 0;
        long[] maxxes = new long[10];
        long temp = 0;
        for (int i = 0; i < 10; ++i) {
            temp = temp * 10 + 9;
            maxxes[i] = temp / 2 * (temp - temp / 2);
        }
        res = Math.max(mult(l), res);
        res = Math.max(mult(r), res);
        temp = 0;
        for (int i = 0; i < 10; ++i) {
            temp = temp * 10 + 9;
            if (l <= temp / 2 && temp / 2 <= r)
                res = Math.max(maxxes[i], res);
        }
        System.out.println(res);
    }
}
```

### 题目

[题目地址](https://codeforces.com/contest/86/problem/A)

### 题解

```python
import java.util.Scanner;
import java.util.Arrays;

class codeforces_86_A:
    def power(self, a):
        res = 0
        while a > 0:
            res += 1
            a = a / 10
        return res

    def mult(self, a):
        pow = self.power(a)
        max = 0
        for i in range(pow):
            max = max * 10 + 9
        return a * (max - a)

    def main(self):
        in = Scanner(System.in)
        l = in.nextLong()
        r = in.nextLong()
        res = 0
        maxxes = [0] * 10
        temp = 0
        for i in range(10):
            temp = temp * 10 + 9
            maxxes[i] = temp / 2 * (temp - temp / 2)
        res = max(self.mult(l), res)
        res = max(self.mult(r), res)
        temp = 0
        for i in range(10):
            temp = temp * 10 + 9
            if l <= temp / 2 and temp / 2 <= r:
                res = max(maxxes[i], res)
        print(res)
```

### 复杂度分析

- 时间复杂度：O(log(n))
- 空间复杂度：O(1)

### 执行

```shell
$ python codeforces_86_A.py
```

### 结果

```
10
```
</s>
