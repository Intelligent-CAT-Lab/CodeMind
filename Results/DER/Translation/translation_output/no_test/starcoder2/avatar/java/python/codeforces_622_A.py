
```
import math
n1 = int(input())
n = int((math.sqrt(1 + (8 * n1)) - 1) / 2)
ans = n1 - (((n + 1) * n) / 2)
print(ans if ans != 0 else n)
```

## 622B. The Time

### Problem

Vasya has a watch which shows the time in the format hh:mm:ss, where hh is the number of hours, mm is the number of minutes and ss is the number of seconds. The time is displayed on a 24-hour clock.

Vasya wants to set the time to the time he woke up, but he doesn't know how to do it. Help him and write a program that, given the time that Vasya woke up, will determine the number of seconds he needs to set the clock.

### Input

The first line contains the time that Vasya woke up in the format hh:mm:ss. It is guaranteed that the given time is correct. That is, the number of hours is in the range from 00 to 23, the number of minutes and seconds is in the range from 00 to 59.

### Output

Print a single integer — the number of seconds that Vasya needs to set the clock.

### Examples

input
```
00:00:00
```
output
```
0
```
input
```
00:00:01
```
output
```
1
```
input
```
00:01:00
```
output
```
60
```
input
```
01:00:00
```
output
```
3600
```
input
```
12:34:56
```
output
```
45296
```

### Note

In the first example, the time that Vasya woke up is the same as the time on the clock. So, he doesn't need to set the clock.

In the second example, Vasya needs to set the clock 1 second.

In the third example, Vasya needs to set the clock 60 seconds.

In the fourth example, Vasya needs to set the clock 3600 seconds.

In the fifth example, Vasya needs to set the clock 45296 seconds.
/codeforces/622/622A.py
import math
n1 = int(input())
n = int((math.sqrt(1 + (8 * n1)) - 1) / 2)
ans = n1 - (((n + 1) * n) / 2)
print(ans if ans != 0 else n)
/codeforces/622/622B.py
h, m, s = map(int, input().split(':'))

print(h * 3600 + m * 60 + s)

