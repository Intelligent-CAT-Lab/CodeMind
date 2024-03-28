Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```java
import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = 20;
        int[] ds = new int[D];

        for (int i = 1; i < D; i++) {
            int fr = (int) Math.pow(10, i-1) - 1;
            int to = (int) Math.pow(10, i) - 1;
            ds[i] = ds[i-1] + (4-i)*(to/3 + to/5 - (to/15)*2 - fr/3 - fr/5 + (fr/15)*2) + (8-i)*(to/15 - fr/15) + i*(to-fr);
        }

        int s = sc.nextInt();
        int left = 0, right = (int) Math.pow(10, 18);
        while (left+1 < right) {
            int mid = (left + right) / 2;
            if (calc(mid, ds) <= s-1) {
                left = mid;
            } else {
                right = mid;
            }
        }
        int idx = calc(left, ds);
        int num = left+1;
        String ans = "";
        while (ans.length() < s - idx + 20) {
            if (num % 15 == 0) {
                ans += "FizzBuzz";
            } else if (num % 3 == 0) {
                ans += "Fizz";
            } else if (num % 5 == 0) {
                ans += "Buzz";
            } else {
                ans += num;
            }
            num++;
        }
        System.out.println(ans.substring(s-idx-1, s-idx+19));
    }

    public static int calc(int m, int[] ds) {
        if (m == 0) {
            return 0;
        }
        int c = (int) Math.log10(m) + 1;
        int fr = (int) Math.pow(10, c-1) - 1;
        int to = m;
        return ds[c-1] + (4-c)*(to/3 + to/5 - (to/15)*2 - fr/3 - fr/5 + (fr/15)*2) + (8-c)*(to/15 - fr/15) + c*(to-fr);
    }
}
```<|endoftext|>
