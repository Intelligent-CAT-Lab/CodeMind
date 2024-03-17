<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
12Fizz4BuzzFizz78Fiz


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
[/INST]
```java
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int D = 20;
        List<Integer> ds = new ArrayList<>(D);
        for (int i = 0; i < D; i++) {
            ds.add(0);
        }
        double fr = Math.pow(10, D - 1) - 1;
        double to = Math.pow(10, D) - 1;
        ds.set(0, ds.get(0) + (4 - 1) * ((int) (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2) + (8 - 1) * ((int) (to / 15 - fr / 15)));
        for (int i = 1; i < D; i++) {
            fr = Math.pow(10, i - 1) - 1;
            to = Math.pow(10, i) - 1;
            ds.set(i, ds.get(i) + (4 - i) * ((int) (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2) + (8 - i) * ((int) (to / 15 - fr / 15)));
            ds.set(i, ds.get(i) + i * (to - fr));
        }
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int left = 0;
        int right = (int) Math.pow(10, 18);
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
        StringBuilder ans = new StringBuilder();
        while (ans.length() < s - idx + 20) {
            if (num % 15 == 0) {
                ans.append("FizzBuzz");
            } else if (num % 3 == 0) {
                ans.append("Fizz");
            } else if (num % 5 == 0) {
                ans.append("Buzz");
            } else {
                ans.append(String.valueOf(num));
            }
            num++;
        }
        System.out.println(ans.substring(s - idx - 1, s - idx + 19));
    }

    public static int calc(int m) {
        if (m == 0) {
            return 0;
        }
        int c = (int) Math.log10(m) + 1;
        double fr = Math.pow(10, c - 1) - 1;
        double to = m;
        return ds.get(c - 1) + (4 - c) * ((int) (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2) + (8 - c) * ((int) (to / 15 - fr / 15)));
    }
}
```</s>
