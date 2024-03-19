<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
12Fizz4B9uzzFizz78Fiz

```
D = 20
ds = [0]*D

from math import log10

for i in xrange(1, D):
    fr = 10**(i-1)-1
    to = 10**i-1
    ds[i] = ds[i-1] + (4-i)*(to/3 + to/5 - (to/15)*2 - fr/3 - fr/5 + (fr/15)*2) + (8-i)*(to/15 - fr/15) + i*(to-fr)

def calc(m):
    if m == 0:
        return 0
    c = int(log10(m))+1
    fr = 10**(c-1)-1
    to = m
    return ds[c-1] + (4-c)*(to/3 + to/5 - (to/15)*2 - fr/3 - fr/5 + (fr/15)*2) + (8-c)*(to/15 - fr/15) + c*(to-fr)

s = input()
left = 0; right = 10**18
while left+1 < right:
    mid = (left + right) / 2
    if calc(mid) <= s-1:
        left = mid
    else:
        right = mid
idx = calc(left)
num = left+1
ans = ""
while len(ans) < s - idx + 20:
    if num % 15 == 0:
        ans += "FizzBuzz"
    elif num % 3 == 0:
        ans += "Fizz"
    elif num % 5 == 0:
        ans += "Buzz"
    else:
        ans += str(num)
    num += 1
print ans[s-idx-1:s-idx+19]
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int D = 20;
        long[] ds = new long[D];

        for (int i = 1; i < D; i++) {
            long fr = (long) Math.pow(10, i - 1) - 1;
            long to = (long) Math.pow(10, i) - 1;
            ds[i] = ds[i - 1] + (4 - i) * (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2) + (8 - i) * (to / 15 - fr / 15) + i * (to - fr);
        }

        long left = 0;
        long right = (long) Math.pow(10, 18);
        while (left + 1 < right) {
            long mid = (left + right) / 2;
            if (calc(mid, ds) <= s - 1) {
                left = mid;
            } else {
                right = mid;
            }
        }

        long idx = calc(left, ds);
        long num = left + 1;
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

        System.out.println(ans.substring((int) (s - idx - 1), (int) (s - idx + 19)));
    }

    private static long calc(long m, long[] ds) {
        if (m == 0) {
            return 0;
        }
        int c = (int) (Math.log10(m) + 1);
        long fr = (long) Math.pow(10, c - 1) - 1;
        long to = m;
        return ds[c - 1] + (4 - c) * (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2) + (8 - c) * (to / 15 - fr / 15) + c * (to - fr);
    }
}
```

This Java code does the same thing as the Python code. It calculates the number of "Fizz", "Buzz", and "FizzBuzz" strings in the range from 1 to 10^18, and then prints the string at the given index.<｜end▁of▁sentence｜>
