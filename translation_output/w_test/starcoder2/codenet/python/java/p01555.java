

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int left = 0;
        int right = 1000000000;
        while (left + 1 < right) {
            int mid = (left + right) / 2;
            if (calc(mid) <= s - 1) {
                left = mid;
            } else {
                right = mid;
            }
        }
        int idx = calc(left);
        int num = left + 1;
        String ans = "";
        while (ans.length() < s - idx + 20) {
            if (num % 15 == 0) {
                ans += "FizzBuzz";
            } else if (num % 3 == 0) {
                ans += "Fizz";
            } else if (num % 5 == 0) {
                ans += "Buzz";
            } else {
                ans += String.valueOf(num);
            }
            num++;
        }
        System.out.println(ans.substring(s - idx - 1, s - idx + 19));
    }

    public static int calc(int m) {
        if (m == 0) {
            return 0;
        }
        int c = (int) (Math.log10(m) + 1);
        int fr = (int) (Math.pow(10, c - 1) - 1);
        int to = m;
        return ds[c - 1] + (4 - c) * (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2) + (8 - c) * (to / 15 - fr / 15) + c * (to - fr);
    }

    static int[] ds = new int[20];

    static {
        for (int i = 1; i < 20; i++) {
            int fr = (int) (Math.pow(10, i - 1) - 1);
            int to = (int) (Math.pow(10, i) - 1);
            ds[i] = ds[i - 1] + (4 - i) * (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2) + (8 - i) * (to / 15 - fr / 15) + i * (to - fr);
        }
    }
}
```

## 2. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
12Fizz4BuzzFizz78Fiz


```
def f(n):
    if n == 0:
        return 1
    if n == 1:
        return 2
    if n == 2:
        return 3
    if n == 3:
        return 4
    if n == 4:
        return 5
    if n == 5:
        return 6
    if n == 6:
        return 7
    if n == 7:
        return 8
    if n == 8:
        return 9
    if n == 9:
        return 10
    if n == 10:
        return 11
    if n == 11:
        return 12
    if n == 12:
        return 13
    if n == 13:
        return 14
    if n == 14:
        return 15
    if n == 15:
        return 16
    if n == 16:
        return 17
    if n == 17:
        return 18
    if n == 18:
        return 19
    if n == 19:
        return 20
    if n == 20:
        return 21
    if n == 21:
        return 22
    if n == 22:
        return 23
    if n == 23:
        return 24
    if n == 24:
        return 25
    if n == 25:
        return 26
    if n == 26:
        return 27
    if n == 27:
        return 28
    if n == 28:
        return 29
    if n == 29:
        return 30
    if n == 30:
        return 31
    if n == 31:
        return 32
    if n == 32:
        return 33
    if n == 33:
        return 34
    if n == 34:
        return 35
    if n == 35:
        return 36
    if n == 36:
        return 37
    if n == 37:
        return 38
    if n == 38:
        return 39
    if n == 39:
        return 40
    if n == 40:
        return 41
    if n == 41:
        return 42
    if n == 42:
        return 43
    if n == 43:
        return 44
    if n == 44:
        return 45
    if n == 45:
        return 46
    if n == 46:
        return 47
    if n == 47:
        return 48
    if n == 48:
        return 49
    if n == 49:
        return 50
    if n == 50:
        return 51
    if n == 51:
        return 52
    if n == 52:
        return 53
    if n == 53:
        return 54
    if n == 54:
        return 55
    if n == 55:
        return 56
    if n == 56:
        return 57
    if n == 57:
        return 58
    if n == 58:
        return 59
    if n == 59:
        return 60
    if n == 60:
        return 61
    if n == 61:
        return 62
    if n == 62:
        return 63
    if n == 63:
        return 64
    if n == 64:
        return 65
    if n == 65:
        return 66
    if n == 66:
        return 67
    if n == 67:
        return
