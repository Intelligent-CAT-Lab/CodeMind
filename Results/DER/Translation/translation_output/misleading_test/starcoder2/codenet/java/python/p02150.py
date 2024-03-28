

```python
MOD = 1000000007
a, b, x = map(int, input().split())
s = a - b
count = max(x - a, 0) // s
total = (count % MOD) * (a % MOD) % MOD
x -= count * s
while x >= a:
    total += a
    x += - a + b
total += x
total %= MOD
print(total)
```

## 2151. 2017 ACM-ICPC Asia Regional Qingdao Online

### 2151.1. Description

Time Limit: 1000 ms

Memory Limit: 262144 kB

#### Problem Description

There are n people in a circle. They are numbered from 1 to n. The first person is numbered 1, the second person is numbered 2, and so on.

The first person starts counting from 1. The second person starts counting from 2. The third person starts counting from 3. And so on.

When the counting reaches the number k, the person who is counting k is out of the circle.

The next person starts counting from the number that is the next number of the number that is just out of the circle.

The process continues until only one person is left in the circle.

For example, if n = 5 and k = 2, the process is as follows:

1, 2, 3, 4, 5, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1, 3, 5, 4, 2, 3, 1,
