Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
999999999 999999999

Expected output:
0


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

### Response:
```python
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
```<|endoftext|>
