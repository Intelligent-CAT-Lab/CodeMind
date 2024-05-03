Here is the Python equivalent of the Java code:

```python
import sys

def solve():
    n = int(sys.stdin.readline())
    ans = 0

    #25cent
    ans += n//25
    n %= 25

    #10cent
    ans += n//10
    n %= 10

    #5cent
    ans += n//5
    n %= 5

    #1cent
    ans += n

    print(ans)

solve()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the number of 25-cent coins, 10-cent coins, 5-cent coins, and 1-cent coins needed to make up the total amount, and then prints the total number of coins needed.
