Here is the Python equivalent of the Java code:

```python
import sys

n = int(sys.stdin.readline())
num = 7
res = 1

while num < n:
    num = num * 10 + 7
    res += 1

set_ = set()

while True:
    if num % n == 0:
        break
    num %= n
    res += 1
    if num in set_:
        res = -1
        break
    set_.add(num)
    num = num * 10 + 7

print(res)
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, then it repeatedly multiplies the current number by 10 and adds 7 until it is greater than or equal to the input number. It then repeatedly takes the remainder of the current number divided by the input number and adds 1 to the result until it is zero. If it encounters a number that has already been seen, it sets the result to -1 and breaks out of the loop. Finally, it prints the result.
