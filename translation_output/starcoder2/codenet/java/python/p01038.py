
```
import sys

N = int(sys.stdin.readline())
heights = [int(x) for x in sys.stdin.readline().split()]

signed = []
prev = -1000000000
for i in range(N - 1):
    next_diff = heights[i + 1] - heights[i]
    next_sign = 0 if next_diff == 0 else next_diff / abs(next_diff)

    if i == 0:
        prev = next_sign
        continue

    if prev != next_sign:
        signed.append(prev)
        prev = next_sign

if prev != -1000000000:
    signed.append(prev)

counts = [0] * 5

for i in range(1, len(signed) - 1):
    prev_sign = signed[i - 1]
    curr_sign = signed[i]
    next_sign = signed[i + 1]

    if curr_sign == 0:
        if prev_sign == 1 and next_sign == -1:
            counts[0] += 1
        elif prev_sign == -1 and next_sign == 1:
            counts[1] += 1
        else:
            counts[2] += 1

for i in range(len(signed) - 1):
    curr_sign = signed[i]
    next_sign = signed[i + 1]

    if curr_sign != next_sign and curr_sign != 0 and next_sign != 0:
        if curr_sign > 0:
            counts[3] += 1
        else:
            counts[4] += 1

print(' '.join([str(x) for x in counts]))
```


```
/README.md
# 100-days-of-code

## Day 1

### 2019-01-01

**Today's Progress**:

- [x] [100 Days of Code](https://www.100daysofcode.com/)
- [x] [100 Days of Code - Log](https://github.com/Kallaway/100-days-of-code/blob/master/log.md)
- [x] [100 Days of Code - Rules](https://github.com/Kallaway/100-days-of-code/blob/master/rules.md)
- [x] [100 Days of Code - FAQ](https://github.com/Kallaway/100-days-of-code/blob/master/FAQ.md)
- [x] [100 Days of Code - Resources](https://github.com/Kallaway/100-days-of-code/blob/master/resources.md)
- [x] [100 Days of Code - Extra](https://github.com/Kallaway/100-days-of-code/blob/master/extra.md)
- [x] [100 Days of Code - Log - Round 1](https://github.com/Kallaway/100-days-of-code-log)
- [x] [100 Days of Code - Log - Round 2](https://github.com/Kallaway/100-days-of-code-log-r2)
- [x] [100 Days of Code - Log - Round 3](https://github.com/Kallaway/100-days-of-code-log-r3)
- [x] [100 Days of Code - Log - Round 4](https://github.com/Kallaway/100-days-of-code-log-r4)
- [x] [100 Days of Code - Log - Round 5](https://github.com/Kallaway/100-days-of-code-log-r5)
- [x] [100 Days of Code - Log - Round 6](https://github.com/Kallaway/100-days-of-code-log-r6)
- [x] [100 Days of Code - Log - Round 7](https://github.com/Kallaway/100-days-of-code-log-r7)
- [x] [100 Days of Code - Log - Round 8](https://github.com/Kallaway/100-days-of-code-log-r8)
- [x] [100 Days of Code - Log - Round 9](https://github.com/Kallaway/100-days-of-code-log-r9)
- [x] [100 Days of Code - Log - Round 10](https://github.com/Kallaway/100-days-of-code-log-r10)
- [x] [100 Days of Code - Log - Round 11](https://github.com/Kallaway/100-days-of-code-log-r11)
- [x] [100 Days of Code - Log - Round 12](https://github.com/Kallaway/100-days-of-code-log-r12)
- [x] [100 Days of Code - Log - Round 13](https://github.com/Kallaway/100-days-of-code-log-r13)
- [x] [100 Days of Code - Log - Round 14](https://github.com/Kallaway/100-days-of-code-log-r14)
- [x] [100 Days of Code - Log - Round 15](https://github.com/Kallaway/100-days-
